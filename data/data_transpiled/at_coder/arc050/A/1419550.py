def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.C = sys.stdin.read ( )
        self.c = sys.stdin.read ( )
        if self.C == self.c.upper ( ) :
            print ( "Yes" )
            return
        else :
            print ( "No" )
