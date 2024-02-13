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

if [ -z "$1" ]; then
    $y_cardsperpack = 15
else
    $y_cardsperpack = $1
fi

if [ -z "$2" ]; then
    $z_packsperplayer = 3 
else
    $z_packsperplayer = $2
fi


echo "Calculating ..."
sleep 3


cardsperplayer=$(( $x_totalcards / $n_numplayers ))
cardsremaining=$(($x_totalcards % $n_numplayers ))
echo "Total Cards in Cube: $totalcards"
echo "y = $y_cardsperpack"
echo "z = $z_packsperplayer"
echo "Each Player will draft: $cardsperplayer cards with $cardsremaining cards remaining"
