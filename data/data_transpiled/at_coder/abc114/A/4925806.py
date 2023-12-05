def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        self.x = sys.stdin.read ( )
        if self.x in [ 3 , 5 , 7 ] :
            print ( "YES" )
        else :
            print ( "NO" )
