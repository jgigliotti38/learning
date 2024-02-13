#!/bin/bash


# x_totalcards
# y_cardsperpack
# z_packsperplayer
# n_numplayers

# a_remainingcardpool
# b_remainingpacks
# c_remainingcards


echo "How many total cards in cube?"
read x_totalcards 
#echo "Total Cards in Cube: $totalcards"

echo "How many players?"
read n_numplayers 
#echo "Total Players: $players"

if [-z $1]; then
    $y_cardsperpack = 15
else
    $y_cardsperpack = $1
fi

y_cardsperpack = $1
z_packsperplayer = $2


echo "Calculating ..."
sleep 3


cardsperplayer=$(( $totalcards / $players ))
cardsremaining=$(($totalcards % $players))
echo "Total Cards in Cube: $totalcards"
echo "Each Player will draft: $cardsperplayer cards with $cardsremaining cards remaining
