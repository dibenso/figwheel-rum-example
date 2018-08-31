(ns hello-world.components.counter
  (:require [rum.core :as rum]
            [hello-world.state :as state]))

(rum/defc counter < rum/reactive []
  [:div { :on-click (fn [_] (swap! state/*count inc)) }
    "Clicks: " (rum/react state/*count)])
