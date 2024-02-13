#!/bin/bash

echo "How many players?"
read players
echo "Total Players: $players"


echo "How many total cards in cube?"
read totalcards
#echo "Total Cards in Cube: $totalcards"

echo "Calculating ..."
sleep 3


cardsperplayer=$(( $totalcards / $players ))
cardsremaining=$(($totalcards % $players))
echo "Total Cards in Cube: $totalcards"
echo "Each Player will draft: $cardsperplayer cards with $cardsremaining cards remaining"
