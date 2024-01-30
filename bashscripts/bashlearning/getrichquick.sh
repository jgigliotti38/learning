#!/bin/bash

echo "What is your name?"
read name

echo "What is your age?"
read age

echo "Hello, $name, you are $age years old."

sleep 2

echo "Calculating"
echo ".........."
sleep 1
echo "**........"
sleep 1
echo "****......"
sleep 1
echo "******...."
sleep 1
echo "********.."
sleep 1
echo "**********"
sleep 2

getrich=$((( $RANDOM % 20 ) + age ))

echo "You will be a millionaire at $getrich"
