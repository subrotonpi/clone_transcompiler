def import import sys , string , count , out
from itertools import count
from random import randint
from itertools import chain
from itertools import chain
n = int ( sys.stdin.readline ( ) )
m = int ( sys.stdin.readline ( ) )
a = [ ]
b = [ ]
count = { }
for i in range ( m ) :
    a.append ( sc.randint ( 1 , n ) )
    b.append ( sc.randint ( 1 , n ) )
    count [ a [ i ] ] += 1
    count [ b [ i ] ] += 1
ans = 0
bre = True
while bre :
    bre = False
    out :
    for i in range ( 0 , n ) :
        if count [ i ] == 1 :
            count [ i ] -= 1
            ans += 1
            for j in range ( m ) :
                if a [ j ] == i :
                    count [ b [ j ] ] -= 1
                    a [ j ] = 0
                    b [ j ] = 0
                    bre = True
                    break
                elif b [ j ] == i :
                    count [ a [ j ] ] -= 1
                    a [ j ] = 0
                    b [ j ] = 0
                    bre = True
                    break
    print ( ans )
