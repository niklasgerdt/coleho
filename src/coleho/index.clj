(ns coleho.index
  (:require [hiccup.core :as h]
            [coleho.index :as s]))

(defn index-page []
  (h/html [:body 
           [:h1 {:style (s/header-color)}HELLO]]))
