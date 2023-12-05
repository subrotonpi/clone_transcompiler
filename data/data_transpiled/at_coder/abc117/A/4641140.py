def import import sys
import math
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.out = sys.stdout
    def __call__ ( self , * args , ** kwargs ) :
        s = self.out.split ( )
        ans = float ( s [ 0 ] ) / float ( s [ 1 ] )
        print ( ans )
