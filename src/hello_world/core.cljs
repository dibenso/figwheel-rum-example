(ns hello-world.core
    (:require [rum.core :as rum]
              [hello-world.state :as state]))

(enable-console-print!)

(println "This text is printed from src/hello-world/core.cljs. Go ahead and edit it and see reloading in action.")

(rum/defc counter < rum/reactive []
  [:div { :on-click (fn [_] (swap! state/count inc)) }
    "Clicks: " (rum/react state/count)])

(rum/hydrate (counter) (. js/document (getElementById "app")))

(defn on-js-reload []
  ;; optionally touch your app-state to force rerendering depending on
  ;; your application
  ;; (swap! app-state update-in [:__figwheel_counter] inc)
)
