def import import sys
from math import sin , cos , tan
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
        self.t = sys.maxint
        self.p = [ ]
        for x , y in zip ( sys.stdin.readline ( ).split ( ) , sys.stdin.readline ( ).split ( ) ) :
            self.p.append ( ( x , y ) )
    ans = float ( 'inf' )
    for i in range ( n ) :
        for j in range ( n ) :
            for k in range ( n ) :
                for l in range ( n ) :
                    count = 0
                    for u in range ( n ) :
                        if p [ u ] [ 0 ] <= p [ i ] [ 0 ] and p [ u ] [ 0 ] >= p [ j ] [ 0 ] and p [ u ] [ 1 ] <= p [ k ] [ 1 ] and p [ u ] [ 1 ] >= p [ l ] [ 1 ] :
                            count += 1
                    if count >= t :
                        ans = min ( ans , ( p [ i ] [ 0 ] - p [ j ] [ 0 ] ) * ( p [ k ] [ 1 ] - p [ l ] [ 1 ] ) )
    print ( ans )
    class Point ( object ) :
        def __init__ ( self , x , y ) :
            self.x = x
            self.y = y
