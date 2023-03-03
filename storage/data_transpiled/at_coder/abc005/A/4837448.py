def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.x = sys.argv [ 1 ]
        self.y = sys.argv [ 2 ]
        if self.x < self.y :
            print ( self.y / self.x )
        else :
            print ( 0 )
