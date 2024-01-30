#!/bin/bash

# METHOD 1
#name=$1

# METHOD 2
#echo "What is your name?"
#read name

# METHOD 3
name="Josh"

user=$(whoami)
date=$(date)
whereami=$(pwd)

echo "Good Morning $name"
sleep 1
echo "Nice hair $name"
sleep 1
#echo "you like jazz $name?"
echo "you like $1 $name?"
sleep 2

echo "User: $user"
echo "Current Directory $whereami" 
echo "Date: $date"

#give private ip address
privateip=$(ifconfig | grep -Eo 'inet (addr:)?([0-9]*\.){3}[0-9]*' | grep -Eo '([0-9]*\.){3}[0-9]*' | grep -v '127.0.0.1')
echo "your private IP Address is $privateip"

#give puplic ip address
publicip=$(dig +short myip.opendns.com @resolver1.opendns.com)
echo "your public IP Address is $publicip"

#wttr for Pittsburgh
curl wttr.in?0
