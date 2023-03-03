def import import sys , max
import random
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        self.n , self.v , self.max = [ ] , [ ] , [ 0 , 0 , 0 ]
        for i in range ( self.n ) :
            for j in range ( 3 ) :
                self.v [ i ].append ( self.s.read ( ) )
            self.v.sort ( )
            for j in range ( 3 ) :
                self.max [ j ] = max [ j ]
        print ( self.max [ 0 ] * self.max [ 1 ] * self.max [ 2 ] )
