(ns frontend.components.pieces.icon
  "Each icon is a component in this namespace. Icons are block-level elements.
  They are square and `width: 100%`, so the correct way to size them is by
  controlling the width of their containing block.

  The correct way to place an icon in front of text is generally to align it on
  center with the text using flexbox and size the icon to `1em`. See the devcards
  for examples."
  (:refer-clojure :exclude [key])
  (:require [devcards.core :as dc :refer-macros [defcard defcard-doc]])
  (:require-macros [frontend.utils :refer [html component ns-docstring]]))

(defn- icon
  "The svg element of an icon. Our icon SVG sizes are standardized so that the
  path (or paths) from an SVG built from the Sketch style guide should be
  suitable for passing into this component to build the icon."
  [content]
  (component
    (html
     [:svg {:xmlns "http://www.w3.org/2000/svg"
            :viewBox "2 2 20 20"
            :fill "currentColor"}
      content])))

(defn cancel-circle
  "Used to delete things, most notably on action buttons in table rows."
  []
  (component
    (icon
     (html
      [:path {:d "M12,2 C6.47,2 2,6.47 2,12 C2,17.53 6.47,22 12,22 C17.53,22 22,17.53 22,12 C22,6.47 17.53,2 12,2 L12,2 Z M17,15.59 L15.59,17 L12,13.41 L8.41,17 L7,15.59 L10.59,12 L7,8.41 L8.41,7 L12,10.59 L15.59,7 L17,8.41 L13.41,12 L17,15.59 L17,15.59 Z"}]))))

(defn rebuild
  "Used to rebuild and rerun things, most notably on the rebuild button in the build header."
  []
  (component
    (icon
     (html
      [:path {:d "M17.65,6.35 C16.2,4.9 14.21,4 12,4 C7.58,4 4.01,7.58 4.01,12 C4.01,16.42 7.58,20 12,20 C15.73,20 18.84,17.45 19.73,14 L17.65,14 C16.83,16.33 14.61,18 12,18 C8.69,18 6,15.31 6,12 C6,8.69 8.69,6 12,6 C13.66,6 15.14,6.69 16.22,7.78 L13,11 L20,11 L20,4 L17.65,6.35 L17.65,6.35 Z"}]))))

(defn github
  "Represents GitHub, or denotes that an org name refers to a GitHub org."
  []
  (component
    (icon
     (html
      [:path {:d "M12,2 C14.777778,2 17.1388887,2.99290757 19.0833333,4.9787234 C21.027778,6.96453923 22,9.3758863 22,12.212766 C22,13.6312054 21.722222,15.0141842 21.1666667,16.3617021 C20.6111113,17.7092201 19.8125,18.8439714 18.7708333,19.7659574 C17.7291667,20.6879435 16.5138887,21.4326243 15.125,22 C14.7083333,22 14.5,21.787234 14.5,21.3617021 L14.5,20.4042553 L14.5,18.5957447 C14.5,17.7446809 14.2916667,17.106383 13.875,16.6808511 C16.9305553,16.3971629 18.4583333,14.6950352 18.4583333,11.5744681 C18.4583333,10.5815605 18.1111113,9.73049668 17.4166667,9.0212766 C17.6944447,8.17021277 17.625,7.24822672 17.2083333,6.25531915 C16.652778,6.1134754 15.75,6.46808511 14.5,7.31914894 C13.6666667,7.03546077 12.8333333,6.89361702 12,6.89361702 C11.1666667,6.89361702 10.3333333,7.03546077 9.5,7.31914894 C8.94444467,6.89361702 8.42361133,6.60992885 7.9375,6.46808511 C7.45138867,6.32624136 7.13888867,6.25531915 7,6.25531915 L6.79166667,6.25531915 C6.375,7.24822672 6.30555533,8.17021277 6.58333333,9.0212766 C6.027778,9.73049668 5.75,10.5815605 5.75,11.5744681 C5.75,14.6950352 7.20833333,16.3971629 10.125,16.6808511 C9.847222,16.9645392 9.63888867,17.4609927 9.5,18.1702128 C8.25,18.7375884 7.277778,18.4539009 6.58333333,17.3191489 C6.16666667,16.6099289 5.68055533,16.2553191 5.125,16.2553191 C4.70833333,16.2553191 4.534722,16.3262414 4.60416667,16.4680851 C4.67361133,16.6099289 4.847222,16.7517733 5.125,16.893617 C5.54166667,17.1773052 5.88888867,17.6737586 6.16666667,18.3829787 C6.58333333,19.5177307 7.69444467,19.8723404 9.5,19.4468085 L9.5,20.7234043 L9.5,21.3617021 C9.5,21.787234 9.29166667,22 8.875,22 C6.79166667,21.2907799 5.125,20.0496456 3.875,18.2765957 C2.625,16.5035459 2,14.4822693 2,12.212766 C2,9.3758863 2.972222,6.96453923 4.91666667,4.9787234 C6.86111133,2.99290757 9.222222,2 12,2 L12,2 Z"}]))))

(defn bitbucket
  "Represents Bitbucket, or denotes that an org name refers to a Bitbucket org."
  []
  (component
    (icon
     (html
      [:path {:d "M12.0000614,3 L12.0000614,3.00025488 L11.9999387,3 C7.8713004,3 4.5,4.15386084 4.5,5.58659586 C4.5,5.96399367 5.40041933,11.3750186 5.75757094,13.5207435 C5.91769452,14.4831652 8.30998505,15.8942326 11.9980996,15.8942326 L12.0019004,15.8827616 L12.0019004,15.8942326 C15.6900149,15.8942326 18.0824281,14.4831652 18.2425517,13.5207435 C18.5997033,11.3750186 19.5,5.96399367 19.5,5.58659586 C19.5,4.15386084 16.1286997,3 12.0000614,3 L12.0000614,3 Z M17.3905618,15.6715667 C17.2765381,15.6715667 17.185074,15.7554328 17.185074,15.7554328 C17.185074,15.7554328 15.3381354,17.2757303 12.0000614,17.2758577 C8.6618646,17.2757303 6.81492609,15.7554328 6.81492609,15.7554328 C6.81492609,15.7554328 6.7235845,15.6715667 6.60956086,15.6715667 C6.47334541,15.6715667 6.34424117,15.766649 6.34424117,15.9764418 C6.34424117,15.9986192 6.34632547,16.0207966 6.3502489,16.0424641 C6.63677939,17.6373234 6.84631321,18.7690069 6.88309503,18.9413277 C7.13333412,20.1145619 9.34110251,20.9998726 11.9998161,21 L12.0001839,21 C14.6590201,20.9998726 16.8667885,20.1145619 17.1170276,18.9413277 C17.1536868,18.7690069 17.3632206,17.6373234 17.6498737,16.0424641 C17.6536745,16.0207966 17.6558815,15.9986192 17.6558815,15.9764418 C17.6558815,15.766649 17.5266546,15.6715667 17.3905618,15.6715667 L17.3905618,15.6715667 Z M11.9987126,6.3861285 C9.34600669,6.38166756 7.19623109,5.90255976 7.19721192,5.31575148 C7.19807022,4.72881576 9.34943971,4.2568455 12.002023,4.26130644 C14.654729,4.26576738 16.804382,4.74487518 16.8035237,5.3318109 C16.8026655,5.91861918 14.6514186,6.390462 11.9987126,6.3861285 L11.9987126,6.3861285 Z M12.0000614,14.1558577 C10.6832716,14.1558577 9.61586277,13.0460966 9.61586277,11.6774721 C9.61586277,10.3084652 10.6832716,9.19895907 12.0000614,9.19895907 C13.3167284,9.19895907 14.3841372,10.3084652 14.3841372,11.6774721 C14.3841372,13.0460966 13.3167284,14.1558577 12.0000614,14.1558577 L12.0000614,14.1558577 Z M13.1925284,11.6767074 C13.1925284,12.362804 12.6575979,12.9187679 11.9977318,12.9187679 C11.3377431,12.9187679 10.8029352,12.362804 10.8029352,11.6767074 C10.8029352,10.9906108 11.3377431,10.4346468 11.9977318,10.4346468 C12.6575979,10.4346468 13.1925284,10.9906108 13.1925284,11.6767074 L13.1925284,11.6767074 Z"}]))))

(defn project
  "Represents the notion of a project in the CircleCI domain."
  []
  (component
    (icon
     (html
      [:path {:d "M18,2 L6,2 C4.9,2 4,2.9 4,4 L4,20 C4,21.1 4.9,22 6,22 L18,22 C19.1,22 20,21.1 20,20 L20,4 C20,2.9 19.1,2 18,2 L18,2 Z M6,4 L11,4 L11,12 L8.5,10.5 L6,12 L6,4 L6,4 Z"}]))))

(defn insights
  "Repesents Insights"
  []
  (component
    (icon
     (html
      [:path {:d "M19,3 L5,3 C3.9,3 3,3.9 3,5 L3,19 C3,20.1 3.9,21 5,21 L19,21 C20.1,21 21,20.1 21,19 L21,5 C21,3.9 20.1,3 19,3 L19,3 Z M9,17 L7,17 L7,10 L9,10 L9,17 L9,17 Z M13,17 L11,17 L11,7 L13,7 L13,17 L13,17 Z M17,17 L15,17 L15,13 L17,13 L17,17 L17,17 Z"}]))))

(defn team
  "Represents the notion of a team or org in the CircleCI domain."
  []
  (component
    (icon
     (html
      [:path {:d "M15.6363636,11.5714286 C17.1454545,11.5714286 18.3545455,10.3271429 18.3545455,8.78571429 C18.3545455,7.24428571 17.1454545,6 15.6363636,6 C14.1272727,6 12.9090909,7.24428571 12.9090909,8.78571429 C12.9090909,10.3271429 14.1272727,11.5714286 15.6363636,11.5714286 L15.6363636,11.5714286 Z M8.36363636,11.5714286 C9.87272727,11.5714286 11.0818182,10.3271429 11.0818182,8.78571429 C11.0818182,7.24428571 9.87272727,6 8.36363636,6 C6.85454545,6 5.63636364,7.24428571 5.63636364,8.78571429 C5.63636364,10.3271429 6.85454545,11.5714286 8.36363636,11.5714286 L8.36363636,11.5714286 Z M8.36363636,13.4285714 C6.24545455,13.4285714 2,14.515 2,16.6785714 L2,19 L14.7272727,19 L14.7272727,16.6785714 C14.7272727,14.515 10.4818182,13.4285714 8.36363636,13.4285714 L8.36363636,13.4285714 Z M15.6363636,13.4285714 C15.3727273,13.4285714 15.0727273,13.4471429 14.7545455,13.475 C15.8090909,14.255 16.5454545,15.3042857 16.5454545,16.6785714 L16.5454545,19 L22,19 L22,16.6785714 C22,14.515 17.7545455,13.4285714 15.6363636,13.4285714 L15.6363636,13.4285714 Z"}]))))

(defn key
  "Represents a key or credential."
  []
  (component
    (icon
     (html
      [:path {:d "M19.4957143,5.53 C18.5314286,4.54923077 17.3228571,4.03923077 15.8571429,4 C14.4042857,4.03923077 13.1828571,4.54923077 12.2185714,5.53 C11.2542857,6.51076923 10.7657143,7.74 10.7271429,9.23076923 C10.7271429,9.62307692 10.7657143,10.0023077 10.8428571,10.3946154 L3,18.3846154 L3,19.6923077 L4.28571429,21 L6.85714286,21 L8.14285714,19.6923077 L8.14285714,18.3846154 L9.42857143,18.3846154 L9.42857143,17.0769231 L10.7142857,17.0769231 L10.7142857,15.7692308 L13.2857143,15.7692308 L14.6871429,14.3176923 C15.0728571,14.4223077 15.4457143,14.4615385 15.8571429,14.4615385 C17.3228571,14.4223077 18.5314286,13.9123077 19.4957143,12.9315385 C20.46,11.9507692 20.9614286,10.7215385 21,9.23076923 C20.9614286,7.74 20.46,6.51076923 19.4957143,5.53 L19.4957143,5.53 Z M17.1428571,9.72769231 C16.1528571,9.72769231 15.3685714,8.93 15.3685714,7.92307692 C15.3685714,6.91615385 16.1528571,6.11846154 17.1428571,6.11846154 C18.1328571,6.11846154 18.9171429,6.91615385 18.9171429,7.92307692 C18.9171429,8.93 18.1328571,9.72769231 17.1428571,9.72769231 L17.1428571,9.72769231 Z"}]))))

(defn settings
  "Represents navigation to a settings page."
  []
  (component
    (icon
     (html
      [:path {:d "M19.43,12.98 C19.47,12.66 19.5,12.34 19.5,12 C19.5,11.66 19.47,11.34 19.43,11.02 L21.54,9.37 C21.73,9.22 21.78,8.95 21.66,8.73 L19.66,5.27 C19.54,5.05 19.27,4.97 19.05,5.05 L16.56,6.05 C16.04,5.65 15.48,5.32 14.87,5.07 L14.49,2.42 C14.46,2.18 14.25,2 14,2 L10,2 C9.75,2 9.54,2.18 9.51,2.42 L9.13,5.07 C8.52,5.32 7.96,5.66 7.44,6.05 L4.95,5.05 C4.72,4.96 4.46,5.05 4.34,5.27 L2.34,8.73 C2.21,8.95 2.27,9.22 2.46,9.37 L4.57,11.02 C4.53,11.34 4.5,11.67 4.5,12 C4.5,12.33 4.53,12.66 4.57,12.98 L2.46,14.63 C2.27,14.78 2.22,15.05 2.34,15.27 L4.34,18.73 C4.46,18.95 4.73,19.03 4.95,18.95 L7.44,17.95 C7.96,18.35 8.52,18.68 9.13,18.93 L9.51,21.58 C9.54,21.82 9.75,22 10,22 L14,22 C14.25,22 14.46,21.82 14.49,21.58 L14.87,18.93 C15.48,18.68 16.04,18.34 16.56,17.95 L19.05,18.95 C19.28,19.04 19.54,18.95 19.66,18.73 L21.66,15.27 C21.78,15.05 21.73,14.78 21.54,14.63 L19.43,12.98 L19.43,12.98 Z M12,15.5 C10.07,15.5 8.5,13.93 8.5,12 C8.5,10.07 10.07,8.5 12,8.5 C13.93,8.5 15.5,10.07 15.5,12 C15.5,13.93 13.93,15.5 12,15.5 L12,15.5 Z"}]))))

(defn add-jira-issue
  "Icon for adding a new JIRA issue."
  []
  (component
    (icon
      (html
        [:path {:d "M14.7646959,2.53999996 C15.1162585,2.53999996 15.4144586,2.66332606 15.6592966,2.9099776 C15.9041351,3.15662979 16.0265545,3.4570389 16.0265545,3.81120556 C16.0265545,4.16537223 15.9041351,4.46894366 15.6592966,4.72191985 C15.4144586,4.97489604 15.1162585,5.10138381 14.7646959,5.10138381 C14.4005778,5.10138381 14.0960994,4.97489604 13.8512609,4.72191985 C13.6064229,4.46894366 13.4840037,4.16537223 13.4840037,3.81120556 C13.4840037,3.4570389 13.609562,3.15662979 13.8606781,2.9099776 C14.1117942,2.66332606 14.4131334,2.53999996 14.7646959,2.53999996 L14.7646959,2.53999996 L14.7646959,2.53999996 Z M9.0298323,4.14323661 C9.27467087,3.89658507 9.57287109,3.77325897 9.92443358,3.77325897 C10.2759961,3.77325897 10.5741963,3.89658507 10.8190349,4.14323661 C11.0638728,4.3898888 11.1862921,4.69029791 11.1862921,5.04446457 C11.1862921,5.39863124 11.0638728,5.69904034 10.8190349,5.94569188 C10.5741963,6.19234408 10.2759961,6.31566952 9.92443358,6.31566952 C9.57287109,6.31566952 9.27467087,6.19234408 9.0298323,5.94569188 C8.78499437,5.69904034 8.66257509,5.39863124 8.66257509,5.04446457 C8.66257509,4.69029791 8.78499437,4.3898888 9.0298323,4.14323661 L9.0298323,4.14323661 L9.0298323,4.14323661 Z M18.6726894,4.16220991 C18.917528,3.91555836 19.2157282,3.79223227 19.5672907,3.79223227 C19.9188532,3.79223227 20.2170534,3.91555836 20.461892,4.16220991 C20.7067299,4.40886145 20.8291492,4.7092712 20.8291492,5.06343787 C20.8291492,5.41760454 20.7067299,5.71801364 20.461892,5.96466518 C20.2170534,6.21131737 19.9188532,6.33464282 19.5672907,6.33464282 C19.2157282,6.33464282 18.917528,6.21131737 18.6726894,5.96466518 C18.4278515,5.71801364 18.3054322,5.41760454 18.3054322,5.06343787 C18.3054322,4.7092712 18.4278515,4.40886145 18.6726894,4.16220991 L18.6726894,4.16220991 L18.6726894,4.16220991 Z M19.0776142,21.456295 L16.6668999,21.456295 C16.5664535,21.456295 16.4785627,21.3930505 16.4032282,21.2665627 C16.3278937,21.1400743 16.283948,21.0135865 16.2713923,20.8870981 C16.2462805,20.5076341 16.1678069,20.1408188 16.035971,19.7866521 C15.9041351,19.4324855 15.7566046,19.1194271 15.5933786,18.8474776 C15.4301534,18.5755281 15.194732,18.2656327 14.8871152,17.91779 C14.5794978,17.569948 14.312687,17.2790252 14.0866822,17.0450223 C13.8606781,16.8110194 13.540505,16.491637 13.1261637,16.0868751 C12.7118223,15.6821132 12.3790929,15.3532445 12.1279769,15.1002677 C11.5880778,14.5437207 11.1988477,14.1389588 10.9602873,13.885982 C10.7217269,13.6330064 10.4015544,13.2693528 9.99976873,12.7950223 C9.59798301,12.3206919 9.25897615,11.8874704 8.98274815,11.4953571 C8.04106273,10.1292857 7.50744116,8.80116082 7.38188344,7.51098194 C7.3693278,7.35919688 7.41955101,7.24535711 7.53255308,7.16946457 C7.60788758,7.10622004 7.68950087,7.0745981 7.77739101,7.0745981 C7.81505858,7.0745981 7.85900366,7.08724739 7.90922687,7.11254468 C8.7755778,7.44141406 9.61681615,7.70071425 10.4329439,7.89044654 C10.6087248,7.92839316 10.728005,8.02958362 10.7907839,8.19401796 C10.9037866,8.49758939 11.0638728,8.82329648 11.2710438,9.17113848 C11.4782142,9.51898048 11.6665514,9.81306562 11.8360548,10.0533932 C12.0055582,10.2937207 12.2755081,10.6194271 12.6459037,11.0305136 C13.0163,11.4415996 13.2831108,11.7356846 13.4463367,11.9127683 C13.609562,12.0898513 13.9234569,12.412396 14.3880215,12.8804018 C14.4633566,12.9815923 14.5575249,13.0321876 14.670527,13.0321876 C14.7960854,13.0321876 14.8965318,12.9815923 14.9718663,12.8804018 C15.3987639,12.4376933 15.7095198,12.1151493 15.9041351,11.9127683 C16.0987499,11.7103873 16.3718388,11.4131399 16.7234013,11.0210266 C17.0749638,10.6289141 17.3417746,10.303207 17.5238337,10.0439062 C17.7058927,9.78460596 17.9005081,9.48735854 18.1076785,9.15216516 C18.3148494,8.81697179 18.4686582,8.49126476 18.5691046,8.17504471 C18.6444391,8.01061031 18.7637193,7.90941985 18.9269446,7.87147328 C19.8560743,7.64379501 20.6910352,7.39081882 21.4318278,7.11254468 C21.5071623,7.08724739 21.5573855,7.0745981 21.5824974,7.0745981 C21.6578319,7.0745981 21.7394446,7.10622004 21.8273354,7.16946457 C21.9403374,7.2580064 21.9905606,7.37816952 21.978005,7.52995524 C21.8524473,8.83278276 21.3188251,10.1545836 20.3771403,11.4953571 C20.1134679,11.8874704 19.7776002,12.3238542 19.3695369,12.8045093 C18.9614731,13.2851637 18.6413,13.6488174 18.4090177,13.8954689 C18.1767354,14.1421205 17.7843663,14.5437207 17.2319116,15.1002677 C17.1816877,15.1635122 17.1000751,15.252054 16.987073,15.3658932 C16.9494054,15.4038391 16.9274332,15.460759 16.9211551,15.5366521 C16.9148769,15.6125447 16.9305723,15.6884378 16.9682392,15.7643304 C17.0686857,15.8908188 17.3198017,16.2323362 17.7215874,16.7888838 C18.0229267,17.2189437 18.2269586,17.5225151 18.3336832,17.6995981 C18.4404071,17.8766817 18.5879377,18.120171 18.7762749,18.430067 C18.9646122,18.7399631 19.0933089,18.9929393 19.1623659,19.1889956 C19.2314229,19.3850519 19.2973409,19.6190554 19.3601197,19.8910043 C19.4228992,20.1629538 19.4605662,20.4507142 19.4731225,20.7542857 C19.4856781,20.8807741 19.4542886,21.0072618 19.3789535,21.1337503 C19.2282839,21.3487799 19.1278374,21.456295 19.0776142,21.456295 L19.0776142,21.456295 L19.0776142,21.456295 Z M16.5538979,8.09915214 C16.5538979,8.40272356 16.462868,8.74424094 16.2808089,9.12370556 C16.0987499,9.50316951 15.8633285,9.83203888 15.5745449,10.1103124 C15.2857619,10.3885865 15.015812,10.5277236 14.7646959,10.5277236 C14.4884679,10.5277236 14.2059625,10.3854242 13.9171794,10.1008261 C13.6283958,9.81622791 13.3929745,9.48735854 13.2109154,9.11421859 C13.0288563,8.74107928 12.9378264,8.40272356 12.9378264,8.09915214 L16.5538979,8.09915214 L16.5538979,8.09915214 Z M12.6741547,21.456295 L10.2634404,21.456295 C10.1881053,21.456295 10.093937,21.3487799 9.98093494,21.1337503 C9.9055998,21.0072618 9.86793223,20.8491521 9.86793223,20.6594198 C9.86793223,20.4949855 9.87734944,20.3431998 9.89618323,20.2040627 C9.91501701,20.0649256 9.94640644,19.9194646 9.99035151,19.7676789 C10.0342966,19.6158932 10.0688251,19.492567 10.093937,19.3977012 C10.1190483,19.3028348 10.1692715,19.1731846 10.2446067,19.0087503 C10.3199412,18.8443153 10.3764425,18.7273138 10.4141101,18.657746 C10.451777,18.5881774 10.5271122,18.4585266 10.6401142,18.268795 C10.7531163,18.0790627 10.8315905,17.9525743 10.8755356,17.8893304 C10.9194813,17.8260865 11.0199277,17.6774631 11.1768749,17.4434602 C11.3338227,17.2094567 11.4374082,17.0481846 11.4876314,16.9596428 C11.5629659,16.833155 11.6696904,16.7699112 11.8078044,16.7699112 C11.9082509,16.7699112 12.0024192,16.8141817 12.0903099,16.9027236 C12.6804322,17.5098664 13.2140545,18.135982 13.6911746,18.7810714 C13.7413979,18.8443153 13.7790654,18.9328571 13.8041767,19.0466962 C13.8292886,19.160536 13.8104549,19.2870238 13.747676,19.4261608 C13.6472296,19.6032445 13.5373659,19.7803275 13.4180857,19.9574105 C13.2988055,20.1344942 13.2140545,20.2831176 13.1638306,20.4032813 C13.113608,20.5234451 13.0822179,20.6847172 13.0696623,20.8870981 C13.0571067,21.0135865 13.0100225,21.1400743 12.9284099,21.2665627 C12.8467966,21.3930505 12.7620449,21.456295 12.6741547,21.456295 L12.6741547,21.456295 L12.6741547,21.456295 Z M6.15503363,13.6066703 L6.15503363,15.9030656 L8.45142869,15.9030656 L8.45142869,17.0245607 L6.15503363,17.0245607 L6.15503363,19.320956 L5.03353803,19.320956 L5.03353803,17.0245607 L2.73714297,17.0245607 L2.73714297,15.9030656 L5.03353803,15.9030656 L5.03353803,13.6066703 L6.15503363,13.6066703 Z"}]))))

(defn git-pull-request
  "Represents a pull request."
  []
  (component
    (icon
      (html
       [:path {:d "M18.6666667,17.04 L18.6666667,8.66666667 C18.6266667,7.62666667 18.2133333,6.70666667 17.4133333,5.92 C16.6133333,5.13333333 15.7066667,4.70666667 14.6666667,4.66666667 L13.3333333,4.66666667 L13.3333333,2 L9.33333333,6 L13.3333333,10 L13.3333333,7.33333333 L14.6666667,7.33333333 C15.0266667,7.36 15.3066667,7.48 15.5866667,7.74666667 C15.8666667,8.01333333 15.9866667,8.30666667 16,8.66666667 L16,17.04 C15.2133333,17.4933333 14.6666667,18.3466667 14.6666667,19.3333333 C14.6666667,20.8133333 15.8533333,22 17.3333333,22 C18.8133333,22 20,20.8133333 20,19.3333333 C20,18.36 19.4533333,17.4933333 18.6666667,17.04 L18.6666667,17.04 L18.6666667,17.04 Z M17.3333333,20.9333333 C16.4533333,20.9333333 15.7333333,20.2 15.7333333,19.3333333 C15.7333333,18.4666667 16.4666667,17.7333333 17.3333333,17.7333333 C18.2,17.7333333 18.9333333,18.4666667 18.9333333,19.3333333 C18.9333333,20.2 18.2,20.9333333 17.3333333,20.9333333 L17.3333333,20.9333333 L17.3333333,20.9333333 Z M9.33333333,6 C9.33333333,4.52 8.14666667,3.33333333 6.66666667,3.33333333 C5.18666667,3.33333333 4,4.52 4,6 C4,6.97333333 4.54666667,7.84 5.33333333,8.29333333 L5.33333333,17.04 C4.54666667,17.4933333 4,18.3466667 4,19.3333333 C4,20.8133333 5.18666667,22 6.66666667,22 C8.14666667,22 9.33333333,20.8133333 9.33333333,19.3333333 C9.33333333,18.36 8.78666667,17.4933333 8,17.04 L8,8.29333333 C8.78666667,7.84 9.33333333,6.98666667 9.33333333,6 L9.33333333,6 L9.33333333,6 Z M8.26666667,19.3333333 C8.26666667,20.2133333 7.53333333,20.9333333 6.66666667,20.9333333 C5.8,20.9333333 5.06666667,20.2 5.06666667,19.3333333 C5.06666667,18.4666667 5.8,17.7333333 6.66666667,17.7333333 C7.53333333,17.7333333 8.26666667,18.4666667 8.26666667,19.3333333 L8.26666667,19.3333333 L8.26666667,19.3333333 Z M6.66666667,7.6 C5.78666667,7.6 5.06666667,6.86666667 5.06666667,6 C5.06666667,5.13333333 5.8,4.4 6.66666667,4.4 C7.53333333,4.4 8.26666667,5.13333333 8.26666667,6 C8.26666667,6.86666667 7.53333333,7.6 6.66666667,7.6 L6.66666667,7.6 L6.66666667,7.6 Z"}]))))

(defn status-canceled
  "Represents a canceled status."
  []
  (component
    (icon
     (html
      [:path {:d "M12,2 C6.48,2 2,6.48 2,12 C2,17.52 6.48,22 12,22 C17.52,22 22,17.52 22,12 C22,6.48 17.52,2 12,2 L12,2 Z M17,13 L7,13 L7,11 L17,11 L17,13 L17,13 Z"}]))))

(defn status-failed
  "Represents a failed status."
  []
  (component
    (icon
     (html
      [:path {:d "M12,2 C6.48,2 2,6.48 2,12 C2,17.52 6.48,22 12,22 C17.52,22 22,17.52 22,12 C22,6.48 17.52,2 12,2 L12,2 Z M13,17 L11,17 L11,15 L13,15 L13,17 L13,17 Z M13,13 L11,13 L11,7 L13,7 L13,13 L13,13 Z"}]))))

(defn status-passed
  "Represents a passed status."
  []
  (component
    (icon
     (html
      [:path {:d "M12,2 C6.48,2 2,6.48 2,12 C2,17.52 6.48,22 12,22 C17.52,22 22,17.52 22,12 C22,6.48 17.52,2 12,2 L12,2 Z M10,17 L5,12 L6.41,10.59 L10,14.17 L17.59,6.58 L19,8 L10,17 L10,17 Z"}]))))

(defn status-queued
  "Represents a queued status."
  []
  (component
    (icon
     (html
      [:path {:fill-rule "evenodd"
              :d "M2,12 C2,17.52 6.48,22 12,22 C17.52,22 22,17.52 22,12 C22,6.48 17.52,2 12,2 C6.48,2 2,6.48 2,12 Z M7,10.5 C6.17,10.5 5.5,11.17 5.5,12 C5.5,12.83 6.17,13.5 7,13.5 C7.83,13.5 8.5,12.83 8.5,12 C8.5,11.17 7.83,10.5 7,10.5 Z M17,10.5 C16.17,10.5 15.5,11.17 15.5,12 C15.5,12.83 16.17,13.5 17,13.5 C17.83,13.5 18.5,12.83 18.5,12 C18.5,11.17 17.83,10.5 17,10.5 Z M12,10.5 C11.17,10.5 10.5,11.17 10.5,12 C10.5,12.83 11.17,13.5 12,13.5 C12.83,13.5 13.5,12.83 13.5,12 C13.5,11.17 12.83,10.5 12,10.5 Z"}]))))

(defn status-running
  "Represents a queued status."
  []
  (component
    (icon
     (html
      [:path {:fill-rule "evenodd"
              :d "M2,12 C2,17.52 6.48,22 12,22 C17.52,22 22,17.52 22,12 C22,6.48 17.52,2 12,2 C6.48,2 2,6.48 2,12 Z M9,12 C9,13.65 10.35,15 12,15 C13.65,15 15,13.65 15,12 C15,10.35 13.65,9 12,9 C10.35,9 9,10.35 9,12 Z"}]))))


(defn engine-1
  "Represents Kirk."
  []
  (component
    (icon
     (html
      [:path {:d "M17.7777778,0 L2.22222222,0 C0.994444444,0 0,0.994444444 0,2.22222222 L0,17.7777778 C0,19.0055556 0.994444444,20 2.22222222,20 L17.7777778,20 C19.0055556,20 20,19.0055556 20,17.7777778 L20,2.22222222 C20,0.994444444 19.0055556,0 17.7777778,0 Z M7.31924805,14.0120312 L5.98480469,14.0120312 L5.98480469,7.58344727 L3.925,8.33649414 L3.925,7.17370117 L7.23619141,5.95 L7.31924805,5.95 L7.31924805,14.0120312 Z M9.47350031,13.34125 C9.47350031,12.9498182 9.7880895,12.6325 10.1822503,12.6325 C10.5736821,12.6325 10.8910003,12.9470892 10.8910003,13.34125 C10.8910003,13.7326818 10.5764111,14.05 10.1822503,14.05 C9.79081849,14.05 9.47350031,13.7354108 9.47350031,13.34125 Z M15.007016,9.75126836 L12.9090187,11.3085447 C12.9270428,11.8276394 13.0225692,12.2124487 13.1956008,12.462984 C13.3686324,12.7135193 13.6245711,12.838785 13.9634246,12.838785 C14.3166974,12.838785 14.5789444,12.7018038 14.7501736,12.4278371 C14.9214027,12.1538705 15.007016,11.7339147 15.007016,11.1679573 L15.007016,9.75126836 Z M12.9090187,10.2919893 L15.007016,8.72930574 C14.9962015,8.19939655 14.9042799,7.80647658 14.7312483,7.55053405 C14.5582168,7.29459151 14.2986733,7.16662216 13.9526101,7.16662216 C13.6029422,7.16662216 13.3415963,7.30180105 13.1685648,7.57216288 C12.9955332,7.84252472 12.9090187,8.25887569 12.9090187,8.8212283 L12.9090187,10.2919893 Z M16.5210347,10.9408545 C16.5210347,11.4491347 16.4624572,11.8970274 16.3453004,12.2845461 C16.2281436,12.6720647 16.0596206,12.996494 15.8397263,13.2578438 C15.619832,13.5191936 15.3512766,13.7165547 15.0340521,13.8499332 C14.7168275,13.9833117 14.3599553,14.05 13.9634246,14.05 C13.5704987,14.05 13.2154288,13.9833117 12.8982043,13.8499332 C12.5809797,13.7165547 12.3115231,13.5191936 12.0898264,13.2578438 C11.8681297,12.996494 11.6969031,12.6720647 11.5761415,12.2845461 C11.4553799,11.8970274 11.395,11.4491347 11.395,10.9408545 L11.395,9.05914553 C11.395,8.55086528 11.4544787,8.10297257 11.5734379,7.71545394 C11.6923971,7.32793531 11.8627225,7.00350598 12.0844192,6.74215621 C12.3061159,6.48080644 12.5746713,6.28344526 12.8900935,6.15006676 C13.2055156,6.01668825 13.5596843,5.95 13.9526101,5.95 C14.3491408,5.95 14.7060131,6.01668825 15.0232377,6.15006676 C15.3404622,6.28344526 15.6099188,6.48080644 15.8316155,6.74215621 C16.0533122,7.00350598 16.2236376,7.32793531 16.3425968,7.71545394 C16.461556,8.10297257 16.5210347,8.55086528 16.5210347,9.05914553 L16.5210347,10.9408545 Z"
              :transform "translate(2 2)"}]))))

(defn engine-2
  "Represents Picard."
  []
  (component
    (icon
     (html
      [:path {:d "M17.7777778,0 L2.22222222,0 C0.994444444,0 0,0.994444444 0,2.22222222 L0,17.7777778 C0,19.0055556 0.994444444,20 2.22222222,20 L17.7777778,20 C19.0055556,20 20,19.0055556 20,17.7777778 L20,2.22222222 C20,0.994444444 19.0055556,0 17.7777778,0 Z M8.72902439,14.05 L3.27963415,14.05 L3.27963415,13.0073171 L5.86439024,10.2304878 C6.06561076,10.0109745 6.23573101,9.81158626 6.3747561,9.63231707 C6.51378118,9.45304788 6.62628006,9.28933001 6.7122561,9.14115854 C6.79823214,8.99298706 6.86042664,8.85487869 6.89884146,8.72682927 C6.93725629,8.59877985 6.95646341,8.47439085 6.95646341,8.35365854 C6.95646341,8.17438935 6.93085391,8.0152446 6.87963415,7.87621951 C6.82841438,7.73719443 6.756159,7.6192078 6.66286585,7.5222561 C6.5695727,7.42530439 6.45798845,7.35121977 6.32810976,7.3 C6.19823106,7.24878023 6.05463493,7.22317073 5.89731707,7.22317073 C5.47658326,7.22317073 5.16286689,7.34024273 4.95615854,7.57439024 C4.74945019,7.80853776 4.64609756,8.13597351 4.64609756,8.55670732 L3.115,8.55670732 C3.115,8.20182749 3.18268225,7.86616012 3.31804878,7.54969512 C3.45341531,7.23323012 3.64457194,6.95609875 3.89152439,6.71829268 C4.13847684,6.48048662 4.43664459,6.29298849 4.78603659,6.15579268 C5.13542858,6.01859687 5.52231495,5.95 5.94670732,5.95 C6.35280691,5.95 6.71225453,6.00670675 7.02506098,6.12012195 C7.33786742,6.23353715 7.59945017,6.3926819 7.80981707,6.59756098 C8.02018398,6.80244005 8.18024335,7.04847417 8.29,7.33567073 C8.39975665,7.62286729 8.45463415,7.94024216 8.45463415,8.28780488 C8.45463415,8.55122083 8.41347602,8.8027427 8.33115854,9.04237805 C8.24884105,9.28201339 8.13176905,9.51890127 7.97993902,9.75304878 C7.828109,9.98719629 7.64609862,10.2259134 7.43390244,10.4692073 C7.22170626,10.7125012 6.98573301,10.9676816 6.72597561,11.2347561 L5.22231707,12.8262195 L8.72902439,12.8262195 L8.72902439,14.05 Z M9.47350031,13.34125 C9.47350031,12.9498182 9.7880895,12.6325 10.1822503,12.6325 C10.5736821,12.6325 10.8910003,12.9470892 10.8910003,13.34125 C10.8910003,13.7326818 10.5764111,14.05 10.1822503,14.05 C9.79081849,14.05 9.47350031,13.7354108 9.47350031,13.34125 Z M15.007016,9.75126836 L12.9090187,11.3085447 C12.9270428,11.8276394 13.0225692,12.2124487 13.1956008,12.462984 C13.3686324,12.7135193 13.6245711,12.838785 13.9634246,12.838785 C14.3166974,12.838785 14.5789444,12.7018038 14.7501736,12.4278371 C14.9214027,12.1538705 15.007016,11.7339147 15.007016,11.1679573 L15.007016,9.75126836 Z M12.9090187,10.2919893 L15.007016,8.72930574 C14.9962015,8.19939655 14.9042799,7.80647658 14.7312483,7.55053405 C14.5582168,7.29459151 14.2986733,7.16662216 13.9526101,7.16662216 C13.6029422,7.16662216 13.3415963,7.30180105 13.1685648,7.57216288 C12.9955332,7.84252472 12.9090187,8.25887569 12.9090187,8.8212283 L12.9090187,10.2919893 Z M16.5210347,10.9408545 C16.5210347,11.4491347 16.4624572,11.8970274 16.3453004,12.2845461 C16.2281436,12.6720647 16.0596206,12.996494 15.8397263,13.2578438 C15.619832,13.5191936 15.3512766,13.7165547 15.0340521,13.8499332 C14.7168275,13.9833117 14.3599553,14.05 13.9634246,14.05 C13.5704987,14.05 13.2154288,13.9833117 12.8982043,13.8499332 C12.5809797,13.7165547 12.3115231,13.5191936 12.0898264,13.2578438 C11.8681297,12.996494 11.6969031,12.6720647 11.5761415,12.2845461 C11.4553799,11.8970274 11.395,11.4491347 11.395,10.9408545 L11.395,9.05914553 C11.395,8.55086528 11.4544787,8.10297257 11.5734379,7.71545394 C11.6923971,7.32793531 11.8627225,7.00350598 12.0844192,6.74215621 C12.3061159,6.48080644 12.5746713,6.28344526 12.8900935,6.15006676 C13.2055156,6.01668825 13.5596843,5.95 13.9526101,5.95 C14.3491408,5.95 14.7060131,6.01668825 15.0232377,6.15006676 C15.3404622,6.28344526 15.6099188,6.48080644 15.8316155,6.74215621 C16.0533122,7.00350598 16.2236376,7.32793531 16.3425968,7.71545394 C16.461556,8.10297257 16.5210347,8.55086528 16.5210347,9.05914553 L16.5210347,10.9408545 Z"
              :transform "translate(2 2)"}]))))

(defn engine-new
  "Represents Picard as a new product."
  []
  (component
    (icon
      (html
        [:path {:d "M11.9993276,18.6970663 L10.3336733,19.8174514 C9.41375789,20.436223 8.42191546,20.0713806 8.119384,19.0062594 L7.58345837,17.1194283 L5.55025821,16.9244959 C4.4533655,16.8193317 3.94303113,15.9150572 4.40388241,14.9188197 L5.23382342,13.1247086 L3.82051518,11.709129 C3.0399666,10.927326 3.21562597,9.9137191 4.21785328,9.44282927 L6.04984307,8.58208107 L5.89600343,6.62911895 C5.80902525,5.52494905 6.60653248,4.84894504 7.67118749,5.11768245 L9.64969266,5.6170915 L10.8245101,4.00508072 C11.4733439,3.11479175 12.5324962,3.12465033 13.1741451,4.00508072 L14.3489626,5.6170915 L16.3274677,5.11768245 C17.394853,4.84825587 18.1894947,5.52666659 18.1026518,6.62911895 L17.9488122,8.58208107 L19.7808019,9.44282927 C20.7807943,9.91266902 20.9641305,10.9218754 20.17814,11.709129 L18.7648318,13.1247086 L19.5947728,14.9188197 C20.0585397,15.9213598 19.542484,16.8196007 18.448397,16.9244959 L16.4151969,17.1194283 L15.8792712,19.0062594 C15.5762684,20.07304 14.5913108,20.440537 13.6649819,19.8174514 L11.9993276,18.6970663 Z M10.2866954,13.9036147 L10.2866954,13.3465723 L8.69050654,13.3465723 L9.37494431,12.6221674 C9.49318112,12.5005999 9.60059181,12.3844465 9.69717962,12.2737036 C9.79376743,12.1629607 9.87661521,12.054301 9.94572545,11.9477214 C10.0148357,11.8411417 10.0681247,11.7333147 10.1055941,11.6242371 C10.1430635,11.5151595 10.161798,11.4006713 10.161798,11.2807692 C10.161798,11.1225651 10.1368187,10.9781018 10.0868595,10.8473752 C10.0369003,10.7166486 9.96404422,10.6046584 9.86828906,10.5114012 C9.77253391,10.418144 9.65346624,10.3457043 9.51108249,10.2940797 C9.36869873,10.2424552 9.20508477,10.2166434 9.02023569,10.2166434 C8.82706007,10.2166434 8.65095649,10.2478674 8.49191966,10.3103164 C8.33288284,10.3727654 8.19716235,10.4581111 8.08475413,10.5663561 C7.9723459,10.674601 7.88533491,10.8007462 7.82371855,10.9447952 C7.76210219,11.0888443 7.73129447,11.2416339 7.73129447,11.4031687 L8.42822199,11.4031687 C8.42822199,11.2116584 8.47526621,11.0626156 8.56935606,10.956036 C8.6634459,10.8494563 8.80624384,10.7961673 8.99775415,10.7961673 C9.06936236,10.7961673 9.13472468,10.8078243 9.19384308,10.8311386 C9.25296148,10.8544529 9.30375258,10.8881748 9.34621791,10.9323055 C9.38868324,10.9764361 9.42157256,11.0301415 9.44488686,11.0934231 C9.46820116,11.1567048 9.47985813,11.2291446 9.47985813,11.3107446 C9.47985813,11.3656997 9.4711154,11.4223193 9.45362968,11.4806051 C9.43614396,11.5388908 9.40783416,11.6017552 9.36869944,11.6692002 C9.32956473,11.7366451 9.2783573,11.8111665 9.21507564,11.8927665 C9.15179397,11.9743666 9.07435835,12.0651244 8.98276646,12.1650429 L7.80623291,13.4290046 L7.80623291,13.9036147 L10.2866954,13.9036147 Z M11.3363967,13.5014451 C11.3363967,13.5647268 11.3472211,13.6238443 11.36887,13.6787994 C11.390519,13.7337545 11.4221594,13.7816314 11.4637921,13.8224314 C11.5054248,13.8632314 11.5562159,13.8952881 11.6161669,13.9186024 C11.676118,13.9419167 11.7435619,13.9535737 11.8185007,13.9535737 C11.8934395,13.9535737 11.9608834,13.9419167 12.0208345,13.9186024 C12.0807856,13.8952881 12.1311603,13.8632314 12.1719604,13.8224314 C12.2127604,13.7816314 12.2444007,13.7337545 12.2668824,13.6787994 C12.289364,13.6238443 12.3006047,13.5647268 12.3006047,13.5014451 C12.3006047,13.4364981 12.289364,13.3761316 12.2668824,13.3203439 C12.2444007,13.2645561 12.2127604,13.2162629 12.1719604,13.1754629 C12.1311603,13.1346628 12.0807856,13.1021898 12.0208345,13.0780429 C11.9608834,13.0538959 11.8934395,13.0418226 11.8185007,13.0418226 C11.7435619,13.0418226 11.676118,13.0538959 11.6161669,13.0780429 C11.5562159,13.1021898 11.5054248,13.1346628 11.4637921,13.1754629 C11.4221594,13.2162629 11.390519,13.2645561 11.36887,13.3203439 C11.3472211,13.3761316 11.3363967,13.4364981 11.3363967,13.5014451 Z M15.7283526,12.5197515 L15.7283526,11.6504656 C15.7283526,11.4156573 15.7008755,11.208746 15.6459203,11.0297255 C15.5909652,10.8507049 15.5122806,10.7008296 15.4098642,10.5800948 C15.3074479,10.45936 15.182968,10.3681858 15.036421,10.3065695 C14.889874,10.2449531 14.7250111,10.2141454 14.5418273,10.2141454 C14.3603088,10.2141454 14.1966948,10.2449531 14.0509805,10.3065695 C13.9052661,10.3681858 13.7812026,10.45936 13.6787862,10.5800948 C13.5763698,10.7008296 13.4976853,10.8507049 13.4427301,11.0297255 C13.387775,11.208746 13.3602978,11.4156573 13.3602978,11.6504656 L13.3602978,12.5197515 C13.3602978,12.7545598 13.3881913,12.9614711 13.4439791,13.1404916 C13.4997669,13.3195121 13.5788678,13.4693875 13.6812842,13.5901222 C13.7837005,13.710857 13.9081804,13.8020312 14.0547274,13.8636476 C14.2012744,13.9252639 14.3653047,13.9560716 14.5468232,13.9560716 C14.730007,13.9560716 14.8948699,13.9252639 15.0414169,13.8636476 C15.1879639,13.8020312 15.3120274,13.710857 15.4136112,13.5901222 C15.5151949,13.4693875 15.5930468,13.3195121 15.6471693,13.1404916 C15.7012918,12.9614711 15.7283526,12.7545598 15.7283526,12.5197515 Z M14.0597233,12.2199977 L14.0597233,11.5405558 C14.0597233,11.2807679 14.0996901,11.0884279 14.1796248,10.9635298 C14.2595595,10.8386318 14.3802925,10.7761837 14.5418273,10.7761837 C14.7016968,10.7761837 14.8215971,10.8353012 14.9015318,10.953538 C14.9814665,11.0717748 15.0239312,11.2532906 15.0289272,11.4980907 L14.0597233,12.2199977 Z M15.0289272,11.9702029 L15.0289272,12.6246653 C15.0289272,12.8861185 14.9893767,13.0801239 14.9102746,13.2066872 C14.8311725,13.3332506 14.7100233,13.3965313 14.5468232,13.3965313 C14.3902843,13.3965313 14.2720493,13.3386627 14.1921145,13.2229239 C14.1121798,13.107185 14.0680498,12.9294162 14.0597233,12.689612 L15.0289272,11.9702029 Z"}]))))

(dc/do
  (defcard-doc
    (ns-docstring))

  (defn icon-card
    "Given a collection of icon component function vars, creates a React element
    suitable for showing off those icons as a devcard."
    [icon-vars]
    (html
     [:div
      (for [icon icon-vars]
        [:div {:style {:margin-bottom "30px"}}
         [:div {:style {:font-size "24px"
                        :display "flex"
                        :align-items "center"
                        :margin-bottom "5px"}}
          [:div {:style {:width "1em"
                         :margin-right "10px"}}
           (icon)]
          (-> icon meta :name name)]
         [:div (-> icon meta :doc)]])]))

  (defcard actions
    (icon-card [#'cancel-circle
                #'add-jira-issue
                #'rebuild]))

  (defcard brand
    (icon-card [#'github
                #'bitbucket
                #'engine-1
                #'engine-2
                #'engine-new]))

  (defcard domain
    (icon-card [#'project
                #'team
                #'key]))

  (defcard metadata
    (icon-card [#'git-pull-request]))

  (defcard navigation
    (icon-card [#'settings
                #'insights]))

  (defcard status
    (icon-card [#'status-canceled
                #'status-failed
                #'status-passed
                #'status-queued
                #'status-running])))
