def import import sys
import math
import random
import sys
eps = 1e-9
def main ( ) :
    with open ( sys.argv [ 1 ] ) as sc :
        n = int ( sc.readline ( ) )
        h = [ int ( i ) for i in sc.readlines ( ) ]
        s = [ int ( i ) for i in sc.readlines ( ) ]
    left = 0
    right = 1000000000000000L
    for t in range ( 50 ) :
        mid = ( left + right ) / 2
        cost_time = [ float ( mid - h [ i ] ) / s [ i ] for i in range ( n ) ]
        cost_time = [ x for x in cost_time if x - h [ i ] < - eps ]
        ok = True
        for i in range ( n ) :
            if cost_time [ i ] - i < - eps :
                ok = False
        if ok :
            right = mid
        else :
            left = mid
    print ( right )
