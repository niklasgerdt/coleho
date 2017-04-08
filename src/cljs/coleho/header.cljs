(ns coleho.header
  (:require [reagent.core :as r]))

(defn header-style []
  {:style {:background-color "#24292e" :padding-top "12px" :padding-bottom "12px"}})

(defn header []
  [:div#header (header-style) "Colejo Tools"])
