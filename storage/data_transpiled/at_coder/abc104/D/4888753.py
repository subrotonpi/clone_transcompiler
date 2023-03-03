def import import sys
import string
import math
import random
import sys
import time
import sys
sys.stdin = sys.stdout = input
S = sys.stdin.read ( )
dp = [ [ 0 ] * ( len ( S ) + 1 ) for i in range ( 1 , len ( S ) + 1 ) ]
prime = 1000000007
dp [ 0 ] [ 0 ] = 1
for i in range ( 1 , len ( S ) + 1 ) :
    for j in range ( 4 ) :
        dp [ i ] [ j ] = dp [ i - 1 ] [ j ]
        dp [ i ] [ j ] %= prime
    if S [ i - 1 ] == 'A' :
        dp [ i ] [ 1 ] += dp [ i - 1 ] [ 0 ]
        dp [ i ] [ 1 ] %= prime
    elif S [ i - 1 ] == 'B' :
        dp [ i ] [ 2 ] += dp [ i - 1 ] [ 1 ]
        dp [ i ] [ 2 ] %= prime
    elif S [ i - 1 ] == 'C' :
        dp [ i ] [ 3 ] += dp [ i - 1 ] [ 2 ]
        dp [ i ] [ 3 ] %= prime
    else :
        for j in range ( 4 ) :
            dp [ i ] [ j ] += 2 * dp [ i - 1 ] [ j ]
            dp [ i ] [ j ] %= prime
        dp [ i ] [ 1 ] += dp [ i - 1 ] [ 0 ]
        dp [ i ] [ 2 ] += dp [ i - 1 ] [ 1 ]
        dp [ i ] [ 3 ] += dp [ i - 1 ] [ 2 ]
        dp [ i ] [ 1 ] %= prime
        dp [ i ] [ 2 ] %= prime
        dp [ i ] [ 3 ] %= prime
    out.write ( dp [ len ( S ) ] [ 3 ] )
