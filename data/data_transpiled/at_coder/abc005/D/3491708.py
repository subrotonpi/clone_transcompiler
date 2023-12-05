def import _main
import sys
import random
import numpy
class Main ( object ) :
    def __init__ ( self ) :
        self.n = n
        self.d = [ ]
        self.cum = [ ]
    def f ( x , y ) :
        return _main ( x , y )
    def n ( self ) :
        return self.n
    def d ( self ) :
        return [ ]
    def cum ( self ) :
        return [ ]
    sc = Scanner ( )
    n = sc.n
    d = [ ]
    cum = [ ]
    for i in range ( n ) :
        for j in range ( n ) :
            d.append ( sc.randint ( 0 , n ) )
    for i in range ( n ) :
        for j in range ( n ) :
            cum [ i + 1 ] [ j + 1 ] = cum [ i + 1 ] [ j ] + cum [ i ] [ j + 1 ] + d [ i ] [ j ] - cum [ i ] [ j ]
    q = sc.q
    for i in range ( q ) :
        p = sc.p
        best = 0
        for j in range ( p ) :
            x = p - j
            y = p / x
            y = min ( y , n )
            best = max ( best , f ( x , y ) )
        print ( best )
    def f ( x , y ) :
        best = 0
        for i in range ( n - x + 1 ) :
            for j in range ( n - y + 1 ) :
                best = max ( best , cum [ i + x ] [ j + y ] - cum [ i + x ] [ j ] - cum [ i ] [ j + y ] + cum [ i ] [ j ] )
        return best
