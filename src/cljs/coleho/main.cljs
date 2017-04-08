(ns coleho.main
  (:require-macros [cljs.core.async.macros :refer [go]])
  (:require [coleho.styles :as s]
            [coleho.header :as h]
            [reagent.core :as r]
            [cljs-http.client :as http]
            [cljs.core.async :refer [<!]]))

(def version-list (r/atom ()))

(defn set-versions! []
  (go (let [response (<! (http/get "/versions"))]
        (swap! version-list conj "V5")
        (swap! version-list conj "V6"))))

(defn version-list-to-option-list [s]
  [:option {:key s :value s}s])

(defn version-dropdown [] 
  (map version-list-to-option-list @version-list))

(defn versions []
  [:div#versions (s/color) "Versions "
   [:select
    (version-dropdown)]])

(defn canvas []
  (versions))

(defn main []
  (set-versions!)
  (r/render [canvas] (js/document.getElementById "main")))
