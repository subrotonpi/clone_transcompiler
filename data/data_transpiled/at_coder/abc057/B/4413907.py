def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.read ( ) )
        self.m = int ( sys.stdin.read ( ) )
        self.p = [ [ ] for _ in range ( self.n ) ]
        self.h = [ [ ] for _ in range ( self.m ) ]
        for i in range ( self.n ) :
            point , plen = 0 , 1000000000
            for j in range ( self.m ) :
                len = abs ( self.p [ i ] [ 0 ] - self.h [ j ] [ 0 ] ) + abs ( self.p [ i ] [ 1 ] - self.h [ j ] [ 1 ] )
                if plen > len :
                    point , plen = j , plen
            print ( point + 1 )
