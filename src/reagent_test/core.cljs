(ns reaction-test.core
  (:require [reagent.core :as reagent ]
            [reagent.ratom :refer-macros [reaction run!]]))


(enable-console-print!)

(def counter (reagent/atom 0))

(defn inc-counter
  []
  (if (> 5000 @counter)
     (swap! counter inc)))


;; ----------------------

(defn has-reaction1
  []
  (let [val      (reaction (+ 1 @counter -1))
        val-str  (reaction (str @val))]
    (fn []
      (inc-counter)
      [:div  @val-str])))


(defn has-reaction2    ;; same as has-reaction1
  []
  (let [val      (reaction (+ 1 @counter -1))
        val-str  (reaction (str @val))]
    (fn []
      (inc-counter)
      [:div  @val-str])))


;; ----------------------

(defn page 
  []
  [:div "This counter will turn over about every 16ms (60 times a second) and stop at 5000: "
   [(if (odd? @counter) has-reaction1 has-reaction2)]           ;; Thrash backwards and forwards
  ])


(reagent/render [page] (.getElementById js/document "app"))

