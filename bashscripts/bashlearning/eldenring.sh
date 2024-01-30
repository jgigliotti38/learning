#!/bin/bash
clear

echo "You Died"

sleep 2

# First Beast encounter

beast=$(( $RANDOM % 2 ))

echo "Your first beast approaches. Prepare to battle. Pick a number between 0-1. (0/1)"

read tarnished

if [[ $beast == $tarnished ]]; then
	echo "Beast VANQUISHED!! Well done fellow tarnished"
else
	echo "You Died"
	exit 1
fi

sleep 2

echo "."
sleep 1
echo ".."
sleep 1
echo "..."
sleep 1

echo "Boss Battle. Foul tarnished, Margit has arrived. Pick a number between 0-9. (0-9)"

read tarnished

margit=$(( RANDOM % 10 ))

if [[ $beast == $tarnished || $tarnished == "cheat" ]]; then
	echo "Great One  VANQUISHED!! Well done fellow tarnished"
else
	echo "You Died"
fi
