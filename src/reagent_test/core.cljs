(ns reaction-test.core
  (:require [reagent.core :as reagent :refer [atom]]
            [reagent.ratom :refer-macros [reaction run!]]))


(def app-state (atom {:val 0 }))


(enable-console-print!)

(defn page1
   []
   (let [val (reaction (:val @app-state))]
     (println "Here page1")
     (when (< 100000 (:val @app-state)) 
        (swap! app-state update-in [:val] inc))
     [:div 
        (str "Val: " @val)]))



(defn page 
  []
  [:div "hello"])



(defn pageX
  []
  [:div "hello"])


(reagent/render [:div "hello"] (.getElementById js/document "app"))

