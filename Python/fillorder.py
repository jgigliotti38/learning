# fillorder.py 

import pymysql
# Open Database connection
db = pymysql.connect( 
        host='localhost', 
        user='testuser',
        password = 'password', 
        db='first_database',
	cursorclass=pymysql.cursors.DictCursor,
        )

# Create a cursor object
cursor = db.cursor()
cursor2 = db.cursor()

# Fetch all rows and iterate through each of them
rowcount = cursor.execute("SELECT id,firstname,lastname,coffee_order from avengers")

secret_word = "python"
counter = 1
while True:
	pointerrow = cursor.fetchone()
	counter+=1
	print(pointerrow)
	flag = input('Next Row? ')
	if flag == secret_word or counter > rowcount:
		break

print("Number of rows: %s\n" % rowcount)






# edit a row value
def edit_rowvalue():
	cursor2.execute("SELECT * from avengers")
	row = cursor2.fetchone()
	identifier = row.get("id")
	x = row.get("firstname")
	y = row.get("coffee_order")
	print(f"{x}'s coffee order is {y}\n")
	
	# get new value for coffee_order from user prompt
	newvalue = int(input("What would you like to change his order to ?\n"))
	cursor2.execute( "UPDATE avengers SET coffee_order = %s WHERE id LIKE %s", [newvalue, identifier] )
	db.commit()
	
	# print change
	cursor2.execute( "SELECT * FROM avengers" )
	ver = cursor2.fetchone()
	print(ver)


edit_rowvalue()




## find first one with null entry in coffee_order column

## prompt user with row information and ask what to fill in for null value?

## if value is acceptable, then modify that row's value

## find next rull with null entry and repeat until there are no more null entries in coffee_order


print("Closing Database...\n")

# Close database
db.close()
