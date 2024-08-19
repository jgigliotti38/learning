# Cube.py

Purpose of this program is to calculate the optimal and Ultimate Cube for Drafting
Will be based on numerous inputs from User

## Main Variables

These will be input Values
- x_totalcards -> Total Number of Cards for a Given Cube
- n_numplayers -> Total Number of Players participating in draft
- y_numcardsperpack -> Total Number of Cards in a given Pack
- z_numpacksperplayer -> Max Amount of Packs a single Player should Open

## Other Variables

These values will be calculated
- o_totalcardsperplayer -> Number of Cards each Player will have after Draft
- p_totalcardsdrafted -> Number of Cards Drafted in Total by all players

- a_remainingcardpool -> Total Remaining Cards after Draft
- b_remainingpacks -> Remaining Unopened Packs after Draft, based on alloted Pack limit
- c_remainingunpackedcards -> Total Remaining cards that Have not been drafted and are not in a Pack

## Equations

List of equations that will be used in this python program

> a = x - (z * y * n)

> b = a / y

> c = a % y

> o = y * z

> cards remaining = x % n

> Total Cards Drafted = o * n