def import sys , glob
import os
import sys
import sys
import random
class Main ( sys ) :
    def __init__ ( self ) :
        Scanner ( )
        n , K , Q = sys.argv [ 1 ] , sys.argv [ 2 ] , sys.argv [ 3 ]
        a = [ random.choice ( a ) for i in range ( n ) ]
        vis = set ( )
        small , big = [ ] , [ ]
        ans = sys.maxsize
        for i in range ( n ) :
            if not vis.add ( a [ i ] ) :
                continue
            big = [ ]
            left = 0
            while left < n :
                if a [ left ] < a [ i ] :
                    left += 1
                    continue
                small = [ ]
                while left < n and a [ left ] >= a [ i ] :
                    small.append ( a [ left ] )
                    left += 1
                while len ( small ) >= K :
                    big.append ( small.pop ( ) )
            if len ( big ) < Q :
                continue
            for j in range ( 1 , Q ) :
                big.pop ( )
            ans = min ( ans , big [ - 1 ] - a [ i ] )
        print ( ans )
