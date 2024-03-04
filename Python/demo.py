import os
import pypyodbc as odbc

# Step 1. Establish SQL Server Connection

DRIVER_NAME = 'SQL SERVER'
SERVER_NAME = 'ck-godwyn'
DATABASE_NAME = 'financeDB'

# uid=<username>;
# pwd=<password>;
conneection_string = f"""
    DRIVER={{{DRIVER_NAME}}};
    SERVER={SERVER_NAME};
    DATABASE={DATABASE_NAME};
    Trust_Connection=yes;
"""

conn = odbc.connect(conneection_string)
print(conn)

# Step 2. Iterate through data files and upload