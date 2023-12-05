def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.W = sys.stdin.read ( )
        self.H = sys.stdin.read ( )
        if self.W % 16 == 0 and self.H % 9 == 0 :
            print ( "16:9" )
        else :
            print ( "4:3" )
