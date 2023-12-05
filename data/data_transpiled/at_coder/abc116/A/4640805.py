def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.out = sys.stdout
    def __call__ ( self , * args ) :
        s = self.out.split ( )
        area = int ( s [ 0 ] ) * int ( s [ 1 ] ) / 2
        print ( area )
