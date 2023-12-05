def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.w = sys.stdin.read ( )
        self.h = sys.stdin.read ( )
        if self.h / 3 * 4 == self.w :
            print ( "4:3" )
        else :
            print ( "16:9" )
