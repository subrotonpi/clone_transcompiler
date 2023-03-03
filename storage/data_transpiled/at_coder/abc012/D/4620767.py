def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ).strip ( ) )
    def __init__ ( self ) :
        self.dist = [ ]
        for i in range ( self.n ) :
            [ dist [ i ] , dist [ i ] ] = [ ]
    def m ( self ) :
        for a , b , t in self.dist :
            dist [ a - 1 ] [ b - 1 ] , dist [ b - 1 ] [ a - 1 ] = t , t
    def f ( self ) :
        for k in range ( self.n ) :
            for i in range ( self.n ) :
                for j in range ( self.n ) :
                    dist [ i ] [ j ] = min ( dist [ i ] [ j ] , dist [ i ] [ k ] + dist [ k ] [ j ] )
                    dist [ j ] [ i ] = dist [ i ] [ j ]
    min = sys.maxsize
    for i in range ( self.n ) :
        max = 0
        for j in range ( self.n ) :
            if max < dist [ i ] [ j ] :
                max = dist [ i ] [ j ]
        if min > max :
            min = max
    print ( min )
