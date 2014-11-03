(ns frontend.core
  (:require [cheshire.core :as json]
            [compojure.core :refer (defroutes GET ANY)]
            [compojure.handler :refer (site)]
            [compojure.route]
            [frontend.less :as less]
            [frontend.util.docs :as doc-utils]
            [frontend.proxy :as proxy]
            [ring.util.response :as response]
            [stefon.core :as stefon]
            [org.httpkit.server :as httpkit]))

(def stefon-options
  {:asset-roots ["resources/assets"]
   :mode :development})

(defroutes routes
  (compojure.route/resources "/" {:root "public"
                                  :mime-types {:svg "image/svg"}})
  (GET "/docs/manifest-dev.json" []
       (-> (doc-utils/read-doc-manifest "resources/assets/docs")
           (json/encode {:pretty true})
           (response/response)
           (response/content-type "application/json")))
  (ANY "*" [] {:status 404 :body nil}))

(defn cross-origin-everything
  "This lets us use local assets without the browser complaining. Safe because
   we're only serving assets in dev-mode from here."
  [handler]
  (fn [req]
    (-> (handler req)
        (response/header "Access-Control-Allow-Origin" "*"))))

(defonce stopf (atom nil))

(defn stop-server []
  (when-let [f @stopf]
    (println "stopping server")
    (f :timeout 3000)
    (reset! stopf nil)))

(def port 3000)

(defn start-server []
  (stop-server)
  (println "starting server on port" port)
  (reset! stopf
          (httpkit/run-server (-> (site #'routes)
                                  (stefon/asset-pipeline stefon-options)
                                  (proxy/wrap-handler {:patterns [#"/"
                                                                  #"/logout"
                                                                  #"/auth/.*"
                                                                  #"/api/.*"]
                                                       ;;TODO also support production backend
                                                       :backend {:proto "http"
                                                                 :host "circlehost:8080"}})
                                  (cross-origin-everything))
                              {:port port}))
  nil)

(defn -main
  "Starts the server that will serve the assets when visiting circle with ?use-local-assets=true"
  []
  (println "Starting less compiler.")
  (less/init)
  (start-server))
