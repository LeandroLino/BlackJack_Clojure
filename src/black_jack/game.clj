(ns black-jack.core)

(defn new-card []
  "Generates a card number between 1 and 13"
  (inc (rand-int 13)))

(defn -main []
  "Defn main")