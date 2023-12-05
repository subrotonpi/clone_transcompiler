def import _sys
import os
import sys
import itertools
class Main ( object ) :
    def __init__ ( self ) :
        self.graph = [ ]
    def main ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        a = [ sc.readline ( ).strip ( ) for i in range ( 1 , n + 1 ) ]
        pos = [ a [ i ] for i in range ( 1 , n + 1 ) ]
        ts = sorted ( [ 0 , n + 1 ] )
        ans = 0
        for i in range ( 1 , n + 1 ) :
            lo = ts.lower ( pos [ i ] )
            hi = ts.higher ( pos [ i ] )
            ans += ( long ( pos [ i ] - lo ) ) * ( long ( hi - pos [ i ] ) ) * i
            ts.append ( pos [ i ] )
        print ( ans )
