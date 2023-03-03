def import import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        a = int ( self.sc.read ( ) )
        b = int ( self.sc.read ( ) )
        c = int ( self.sc.read ( ) )
        if a + b >= c :
            print ( "Yes" )
        else :
            print ( "No" )
