(ns coleho.pages
  (:require
    [hiccup
     [page :refer [html5]]
     [page :refer [include-js]]]))

(defn index [a] 
  (html5
    [:head
     [:title "Coleho Tools"]]
    [:body
     [:h1 "Coleho Tools"]
     [:div#tool]
     (include-js "core.js")]))
