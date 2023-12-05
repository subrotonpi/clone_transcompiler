def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
        self.a = sys.maxint
        self.b = sys.maxint
        if ( self.n == 1 and self.a != self.b ) or self.a > self.b :
            self.print ( 0 )
        elif self.n == 2 :
            self.print ( 1 )
        else :
            self.print ( b * ( self.n - 1 ) + a - ( a * ( self.n - 1 ) + self.b ) + 1 )
