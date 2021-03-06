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
     [:meta {:name "viewport" :content="width=device-width, initial-scale=1"}]
     (include-css "w3.css")]
    [:body
     [:div#tool]
     (include-js "core.js")]))
