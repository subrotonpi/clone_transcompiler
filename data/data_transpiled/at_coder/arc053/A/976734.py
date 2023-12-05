def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        self.h = sys.maxint
        self.w = sys.maxint
        print ( ( self.h - 1 ) * self.w + self.h * ( self.w - 1 ) )
