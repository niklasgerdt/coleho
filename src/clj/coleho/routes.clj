(ns coleho.routes
  (:use coleho.pages)
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer :all]))

(defroutes routemap
  (GET "/" [] index)
  (GET "/versions" [] (list "V3" "V4"))
  (route/resources "/")
  (route/not-found "<h1>Page not found</h1>"))
