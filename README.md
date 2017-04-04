# coleho
Coleho

Spike setup of using clojure for full stack web development.

run server:
lein ring server-headless

autocompile clojurescript:
lein cljsbuild auto

included:
Routing Server (Compojure)
React/Raegent/Hiccup
HTTP Client
Code based inline styling
JS source mapping

missing:
Client side routing (secretary)
Data access

main componenents explained:
server -> routes.clj
index page -> pages.clj

spa -> core.cljs
app -> tool.cljs
styling -> styles.cljs
