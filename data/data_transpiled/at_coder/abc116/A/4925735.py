def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        A , B , C = sys.stdin.read ( ).split ( '\n' )
        print ( ( A * B ) / 2 )
