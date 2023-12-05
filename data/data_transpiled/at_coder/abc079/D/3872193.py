def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sys = sys
        self.sys.argv = [ ]
        self.H = self.sys.maxsize
        self.W = self.sys.maxsize
        self.c = [ [ ] for i in range ( 10 ) ]
        for k in range ( 10 ) :
            for i in range ( 10 ) :
                for j in range ( 10 ) :
                    if self.c [ i ] [ j ] > self.c [ i ] [ k ] + self.c [ k ] [ j ] :
                        self.c [ i ] [ j ] = self.c [ i ] [ k ] + self.c [ k ] [ j ]
    count = 0
    for i in range ( self.H ) :
        for j in range ( self.W ) :
            if ( self.c [ i ] [ j ] != - 1 ) :
                count += self.c [ x ] [ 1 ]
    print ( count )
