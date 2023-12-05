def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.x = sys.argv [ 0 ]
        self.y = sys.argv [ 1 ]
        if self.x < self.y :
            print ( "Better" )
        else :
            print ( "Worse" )
