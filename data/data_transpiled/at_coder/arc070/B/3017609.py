def _import ( ) : return _import ( )
import sys
import math
import numpy as np
import collections
class Main ( object ) :
    mod = 1000000007
    def main ( self ) :
        sc = Reader ( sys.stdin )
        out = sys.stdout
        n = sc.randint ( 0 , n )
        k = sc.randint ( 0 , n )
        a = [ ]
        max = 5000
        s , ans = 0 , 0
        dp = [ False ] * ( n + 2 )
        pd = [ False ] * ( n + 2 )
        for i in range ( n ) :
            a [ i ] = sc.randint ( 0 , n )
            a [ i ] = min ( a [ i ] , max )
        for i in range ( n + 2 ) :
            dp [ i ] [ 0 ] = True
            pd [ i ] [ 0 ] = True
        for i in range ( 1 , n ) :
            dp [ i ] [ 0 ] |= dp [ i - 1 ] [ t ]
            if t + a [ i - 1 ] <= max :
                dp [ i ] [ t + a [ i - 1 ] ] = dp [ i - 1 ] [ t ] | dp [ i - 1 ] [ t + a [ i - 1 ] ]
        for i in range ( n ) :
            pd [ i ] [ 0 ] = True
            for t in range ( 1 , max ) :
                pd [ i ] [ t ] = 1 + ( pd [ i ] [ t ] if t + a [ i - 1 ] <= max else 0 )
    c = np.array ( [ 1 ] * n + 2 )
    for i in range ( 1 , n + 2 ) :
        c [ i ] = 1
        for t in range ( 0 , max ) :
            c [ i ] = c [ i ] + ( pd [ i ] [ t ] if t + a [ i - 1 ] <= max )
