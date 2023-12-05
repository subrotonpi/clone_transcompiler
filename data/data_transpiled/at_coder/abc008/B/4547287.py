def import sys , getopt , option , value , parser
from os import urandom
n = int ( sys.argv [ 1 ] )
name = [ ]
vote = [ ]
max = 0
for i in range ( n ) :
    name.append ( os.path.basename ( sys.argv [ 0 ] ) )
for i in range ( n ) :
    for j in range ( i + 1 , n ) :
        if name [ i ] == name [ j ] :
            vote [ i ] += 1
for i in range ( n ) :
    max = max ( vote [ i ] )
for i in range ( n ) :
    if vote [ i ] == max :
        print ( name [ i ] )
        break
