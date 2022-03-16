(ns black-jack.core)

(defn new-card []
  "Generates a card number between 1 and 13"
  (inc (rand-int 13)))

(defn player [player-name]
  (def card-1 (new-card))
  (def card-2 (new-card))
  {:player player-name
   :cards [card-1 card-2]})

(defn -main []
  "Defn main")