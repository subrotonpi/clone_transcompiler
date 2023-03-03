def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.x = sys.argv [ 0 ]
        self.y = sys.argv [ 1 ]
        self.k = sys.argv [ 2 ]
        if self.y >= self.k :
            print ( self.x + self.k )
        else :
            print ( self.x + self.y - ( self.k - self.y ) )
