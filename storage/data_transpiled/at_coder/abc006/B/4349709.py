def import import sys , os , sys
from time import sleep
try :
    sc = sys.stdin
except :
    print ( 'out' )
    return
n = int ( sys.stdin.readline ( ) )
t = [ 0 ] * ( n + 1 )
if n >= 2 :
    t [ 2 ] = 0
    if n >= 3 :
        t [ 3 ] = 1
        if n >= 4 :
            for i in range ( 4 , n + 1 ) :
                t [ i ] = t [ i - 1 ] + t [ i - 2 ] + t [ i - 3 ]
                if t [ i ] > 10007 :
                    t [ i ] = t [ i ] % 10007
    print ( t [ n ] )
