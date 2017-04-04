(ns coleho.styles
  (:require [garden.core :as g]))

(defn style [f] 
  {:style (f)})

(defn color []
  (style (fn [] {:color "#0000FF"})))
