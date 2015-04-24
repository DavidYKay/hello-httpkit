(ns hello-http.core
  (:require [org.httpkit.server :refer [run-server]])
)


(defn app [req]
  {:status  200
   :headers {"Content-Type" "text/html"}
   :body    "hello HTTP!"})

(defn -main[]
  (run-server app {:port 8080}))
