def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        A , B = os.read ( self.s )
        if B % A == 0 :
            print ( A + B )
        else :
            print ( B - A )
