(ns hello-world.server-handler
  (:require [compojure.core :refer :all]
            [compojure.route :as route]
            [ring.middleware.defaults :refer [wrap-defaults site-defaults]]
            [ring.util.response :refer [response content-type]]
            [rum.core :as rum]
            [selmer.parser :as parser]
            [hello-world.components.counter :refer [counter]]))

(parser/set-resource-path! (clojure.java.io/resource "public"))

(defroutes app-routes
  (route/resources "/" {:root "public"})
  (GET "/" []
       (parser/render-file "index.html"
                           {:rendered-string (rum/render-html (counter))}))
  (GET "/hello" [] "Hello World!")
  (route/not-found "Not Found"))

(def app (wrap-defaults app-routes site-defaults))
(def dev-app (wrap-defaults #'app-routes site-defaults))