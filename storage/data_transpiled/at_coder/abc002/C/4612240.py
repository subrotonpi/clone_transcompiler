def import import sys
import math
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        self.xy = [ [ ] for _ in range ( 3 ) ]
    def x_move ( self , self ) :
        self.xy [ 0 ] [ 0 ] = self.xy [ 0 ] [ 1 ]
        self.xy [ 1 ] [ 1 ] = self.xy [ 1 ] [ 1 ]
    def y_move ( self , self ) :
        self.xy [ 0 ] [ 0 ] += self.xy [ 0 ] [ 0 ]
        self.xy [ 1 ] [ 1 ] += self.xy [ 0 ] [ 1 ]
    def x_move ( self , self ) :
        self.xy [ 0 ] [ 0 ] += self.xy [ 0 ] [ 0 ]
        self.xy [ 1 ] [ 1 ] += self.xy [ 1 ] [ 1 ]
    def y_move ( self , self ) :
        self.xy [ 0 ] [ 0 ] += self.xy [ 0 ] [ 1 ]
        self.xy [ 1 ] [ 1 ] += self.xy [ 0 ] [ 1 ]
    print ( abs ( self.xy [ 1 ] [ 0 ] * self.xy [ 2 ] [ 1 ] - self.xy [ 1 ] [ 1 ] * self.xy [ 2 ] [ 0 ] ) / 2.0 )
