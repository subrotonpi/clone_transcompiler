def _import ( ) : return _import ( )
import random
class Main ( object ) :
    def __init__ ( self ) :
        self.data = [ ]
    def solve ( self ) :
        N = random.randint ( 1 , 10000 )
        for i in range ( N ) :
            self.data.append ( random.randint ( 1 , N ) )
        self.data.sort ( )
        g = self.data [ 1 ] - self.data [ 0 ]
        for i in range ( 2 , N ) :
            g = g.gcd ( self.data [ i ] - self.data [ i - 1 ] )
        return g - self.data [ 0 ] % g
    def cases ( self ) :
        self.data = [ ]
        T = random.randint ( 1 , 10000 )
        for c in range ( 1 , T + 1 ) :
            print ( "Case #%d: %s" % ( c , solve ( self ) ) )
    def main ( self ) :
        ( self , ) = self.data
