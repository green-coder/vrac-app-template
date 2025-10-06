(ns org.example.core
  (:require [signaali.reactive :as sr]
            [vrac.web :as vw :refer [$]]))

(defn root-ui []
  (let [counter (sr/create-signal 0)]
    ($ :<>
       ($ :h1 "Hello, world!")
       ($ :p
          ($ :button {:data-testid "counter-button"
                      :on/click (fn [] (swap! counter inc))}
             "Increment the counter"))
       ($ :p "count = " ($ :span {:data-testid "counter-value"} counter)))))

;; -- Entry Point -------------------------------------------------------------

(defn mount-ui []
  (vw/render (js/document.getElementById "app")
             ($ root-ui)))

(defn ^:dev/after-load clear-cache-and-render! []
  (mount-ui))

(defn ^:dev/before-load shutdown! []
  (vw/dispose-render-effects))

(defn start []
  (mount-ui))
