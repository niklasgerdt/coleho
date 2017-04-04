(defproject my-stuff "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/clojurescript "1.9.494"]
                 [cljs-http "0.1.42"]
                 [reagent "0.6.1"]
                 [hiccup "1.0.5"]
                 [garden "1.3.2"]
                 [compojure "1.5.2"]
                 [ring/ring-defaults "0.2.3"]]
  :source-paths ["src/clj"]
  :plugins [[lein-cljsbuild "1.1.5"]
            [lein-ring "0.8.7"]]
  :cljsbuild {
              :builds [{:source-paths ["src/cljs"]
                        :compiler     {:output-dir "resources/public/"
                                       :output-to "resources/public/core.js"
                                       :optimizations :whitespace
                                       :source-map "resources/public/core.js.map"}}]}
  :ring {:handler coleho.routes/routemap :auto-reload? true :auto-refresh? true})
