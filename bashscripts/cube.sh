#!/bin/bash

echo "How many total cards in cube?"
read x_totalcards 
#echo "Total Cards in Cube: $totalcards"

echo "How many players?"
read n_numplayers 
#echo "Total Players: $players"

if [ -z $1 ]; then
        y_cardsperpack=15
else
        y_cardsperpack=$1
fi

if [ -z $2 ]; then
        z_packsperplayer=3
else
        z_packsperplayer=$2
fi

echo "Calculating ..."
sleep 3


cardsperplayer=$(( $y_cardsperpack * $z_packsperplayer ))
cardsremaining=$(($x_totalcards % $n_numplayers ))
echo "Total Cards in Cube: $x_totalcards"

echo "Each Pack will contain $y_cardsperpack cards"
echo "Each Player will have a max of $z_packsperplayer packs"

echo "Each Player will draft: $cardsperplayer cards for a total of $(( $cardsperplayer * $n_numplayers)) cards drafted"
sleep 3

a_remainingcardpool=$(( $x_totalcards - ($z_packsperplayer * $y_cardsperpack * $n_numplayers)))
b_remainingpacks=$(( $a_remainingcardpool / $y_cardsperpack ))
c_remainingcards=$(( $a_remainingcardpool % $y_cardsperpack ))

echo "Remaining Card Pool: $a_remainingcardpool"
echo "Remaining Packs After Draft: $b_remainingpacks"
echo "Remaining Cards Unpacked: $c_remainingcards"



# === NOTES ===

# x_totalcards
# y_cardsperpack=$1
# z_packsperplayer=$2
# n_numplayers

# a_remainingcardpool
# b_remainingpacks
# c_remainingcards



# a = x - (z * y * n)
# b = a / y
# c = a % y
~                       
