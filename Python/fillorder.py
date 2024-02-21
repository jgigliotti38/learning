# fillorder.py 

import pymysql
# Open Database connection
db = pymysql.connect(
        host='localhost',
        user='testuser',
        password = 'password',
        db='first_database',
        )

# Create a cursor object
cursor = db.cursor()

# Execute SQL query

## iterate through rows

# Fetch all rows
secret_word = "python"
counter = 0
while True:
        pointerrow = cursor.fetchone()
        print(pointerrow)
        flag = input('Next Row? ')
        if flag == secret_word or pointerrow == None:
                break





## find first one with null entry in coffee_order column

## prompt user with row information and ask what to fill in for null value?

## if value is acceptable, then modify that row's value

## find next rull with null entry and repeat until there are no more null entries in coffee_order

cursor.execute("SELECT * from avengers")


# Close database
db.close()
