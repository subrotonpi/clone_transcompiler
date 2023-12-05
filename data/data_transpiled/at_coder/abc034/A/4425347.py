def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.x = sys.stdin.read ( )
        self.y = sys.stdin.read ( )
        if self.x > self.y :
            print ( "Worse" )
        else :
            print ( "Better" )
