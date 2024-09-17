# cube.py

import time
from decimal import Decimal, getcontext
import os

os.system('clear')

"""
The goal for this program is to create
a suitable cube based on various inputs
and customization options.
"""
print("\nWelcome to...")
print("========================================")
print(
"""
  _                                   _         
 /_/_     _  _  _ | |._ _/__  _  _   / `   /_ _ 
/  /_|/_//_//_'/  |/// // /_|/_//_' /_,/_//_//_'
        /                    _/
"""
)
print("========================================")

# GET USER INPUTS FOR CUBE SIZE AND NUMBER OF PLAYERS
x_totalcards = int(input("Enter the Number of Cards in your cube\n"))

n_numplayers = int(
    input("How many Players will be participating in your cube?\n"))

y_numcardsperpack = int(
    input("Awesome! How Many cards will be in each pack?\n"))

z_numpacksperplayer = int(input("Finally, How Many Packs per player?\n"))



print("Thank you for your input!")
print("Calculating...\n")
time.sleep(3)

# PERFORM CALCULATIONS
def perform_calculation(
    x_totalcards,
    n_numplayers,
    y_numcardsperpack,
    z_numpacksperplayer
):
    r_totalpacks = int(x_totalcards / y_numcardsperpack)
    o_totalcardsperplayer = y_numcardsperpack * z_numpacksperplayer
    p_totalcardsdrafted = o_totalcardsperplayer * n_numplayers
    m_totalpacksdrafted = int(z_numpacksperplayer * n_numplayers)

    getcontext().prec = 4
    s_percentcardpoolused = round((p_totalcardsdrafted / x_totalcards), 2) * 100
    s_percentcardpoolused = Decimal(s_percentcardpoolused)/Decimal(1)


    a_remainingcardpool = x_totalcards - (z_numpacksperplayer * y_numcardsperpack *
                                      n_numplayers)
    q_percentcardpoolremain = round((a_remainingcardpool / x_totalcards), 2) * 100
    b_remainingpacks = int(a_remainingcardpool / y_numcardsperpack)
    c_remainingunpackedcards = a_remainingcardpool % y_numcardsperpack

    # DISPLAY RESULTS
    print("\n============ RESULTS ============")
    
    if a_remainingcardpool < 0 or b_remainingpacks < 0:
        print("Error Calculating, Negative Card Pool/Remaining Packs Found")
        exit()
    else:
        print(f'Total Cards in Cube: {x_totalcards}')
        print(f'Total Players: {n_numplayers}')
        print(f'Total Cards Per Pack: {y_numcardsperpack}')
        print(f'Total Packs Per Player: {z_numpacksperplayer}')
    
        print(f'\nTotal Packs in Cube: {r_totalpacks}')
        print(f'Total Packs Drafted: {m_totalpacksdrafted}')
        print(f'Each Player will draft: {o_totalcardsperplayer} cards '
              f'for a total of {p_totalcardsdrafted} cards drafted')
        print(f'Percent of Card Pool Drafted: {s_percentcardpoolused}%')
    
        print("\n******************************\n")
        time.sleep(2)
    
        print(f'Remaining Card Pool (COUNT): {a_remainingcardpool}')
        print(f'Remaining Card Pool (%): {q_percentcardpoolremain}%')
        print(f'Remaining Unopened Packs in Cube: {b_remainingpacks}')
        print(f'Remaind Cards Unpacked: {c_remainingunpackedcards}')

#print("******************************")

perform_calculation(
    x_totalcards,
    n_numplayers,
    y_numcardsperpack,
    z_numpacksperplayer
)    

print("============ END ============")
