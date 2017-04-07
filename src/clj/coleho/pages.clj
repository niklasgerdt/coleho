(ns coleho.pages
  (:require
    [hiccup
     [page :refer [html5]]
     [page :refer [include-js]]
     [page :refer [include-css]]]))

(defn index [a] 
  (html5
    [:head
     [:title "Coleho Tools"]
     (include-css "w3.css")]
    [:body
     [:h1 "Coleho Tools"]
     [:div#tool]
     (include-js "core.js")]))
