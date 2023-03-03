def import import sys
import os
import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.f = sys.stdin
        self.abc = sys.stdin.readline ( ).split ( )
        a = int ( self.abc [ 0 ] )
        b = int ( self.abc [ 1 ] )
        print ( a - b + 1 )
