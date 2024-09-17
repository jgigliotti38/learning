# testing python for sql

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
cursor.execute("SELECT * from avengers")

# Fetch all rows
rows = cursor.fetchall()

for row in rows:
	print(row)

# Close database
db.close()
