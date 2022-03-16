(ns black-jack.core
  (:require [card-ascii-art.core :as card]))

(defn new-card []
  "Generates a card number between 1 and 13"
  (inc (rand-int 13)))

(defn player [player-name]
  (let [card1 (new-card)
        card2 (new-card)
        cards [card1 card2]]
    {:player-name player-name
     :cards cards}))

(card/print-player (player "Lino"))
(card/print-player (player "Dealer"))
