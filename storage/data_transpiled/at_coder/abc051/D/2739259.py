def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
        self.m = sys.maxint
        self.a = [ ]
        self.b = [ ]
        self.c = [ ]
        for i in range ( self.m ) :
            self.a.append ( self.a [ i ] - 1 )
            self.b.append ( self.b [ i ] - 1 )
            self.c.append ( self.c [ i ] )
    dist = [ [ ] for i in range ( self.n ) ]
    for i in range ( self.n ) :
        for j in range ( self.n ) :
            if i == j :
                dist [ i ] [ j ] = 0
            else :
                dist [ i ] [ j ] = sys.maxint >> 1
    for i in range ( self.m ) :
        dist [ a [ i ] ] [ b [ i ] ] = min ( dist [ a [ i ] ] [ b [ i ] ] , c [ i ] )
        dist [ b [ i ] ] [ a [ i ] ] = min ( dist [ b [ i ] ] [ a [ i ] ] , c [ i ] )
    for k in range ( self.n ) :
        for i in range ( self.n ) :
            for j in range ( self.n ) :
                dist [ i ] [ j ] = min ( dist [ i ] [ j ] , dist [ i ] [ k ] + dist [ k ] [ j ] )
    count = 0
    for i in range ( self.m ) :
        if dist [ a [ i ] ] [ b [ i ] ] != c [ i ] :
            count += 1
    print ( count )
