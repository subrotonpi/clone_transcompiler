def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.maxD = [ ]
        for i in range ( self.N ) :
            d = [ ]
            for j in range ( 3 ) :
                d.append ( sys.stdin.read ( ) )
            d.sort ( )
            for k in range ( 3 ) :
                self.maxD.append ( max ( self.maxD [ k ] , d [ k ] ) )
        print ( self.maxD [ 0 ] * self.maxD [ 1 ] * self.maxD [ 2 ] )
