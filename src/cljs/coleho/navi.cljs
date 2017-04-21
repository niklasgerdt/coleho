(ns coleho.navi
  (:require [coleho.styles :as s]
            [reagent.core :as r]))

(defn navi-width []
  {:style {:width "200px"}})

(defn navi []
  [:div#navi.w3-sidebar.w3-bar-block.w3-collapse.w3-card-2 (navi-width)
   [:button.w3-bar-item.w3-button.w3-hide-large "Close"]
   [:a.w3-bar-item.w3-button "Link"]])

