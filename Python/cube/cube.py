import time


# cube.py
"""
Welcome,
The goal for this program is to create
a suitable cube based on various inputs
and customization options.
"""

print("========== CUBE TIME ==========")

# Get User Inputs for Cube Size and Number of players
x_totalcards = int(input("Enter the Number of Cards in your cube\n"))

n_numplayers = int(input("How many Players will be participating in your cube?\n"))

y_numcardsperpack = int(input("Awesome! How Many cards will be in each pack?\n"))

z_numpacksperplayer = int(input("Finally, How Many Packs per player?\n"))

print("Thank you for your input!")
print("Calculating...")
time.sleep(3)

# Perform Calculations
o_totalcardsperplayer = y_numcardsperpack * z_numpacksperplayer

p_totalcardsdrafted = o_totalcardsperplayer * n_numplayers

a_remainingcardpool = x_totalcards - (z_numpacksperplayer * y_numcardsperpack * n_numplayers)

b_remainingpacks = a_remainingcardpool / y_numcardsperpack

c_remainingunpackedcards = a_remainingcardpool % y_numcardsperpack

print(f'Total Cards in Cube: {x_totalcards}'  )
print(f'Total Players: {n_numplayers}' )
print(f'Total Cards Per Pack: {y_numcardsperpack}' )
print(f'Total Packs Per Player: {z_numpacksperplayer}' )

print(f'Each Player will draft: {o_totalcardsperplayer} cards for a total of\n {p_totalcardsdrafted} cards drafted')
