def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.x = sys.stdin.read ( )
        self.y = sys.stdin.read ( )
        self.k = sys.stdin.read ( )
        if self.y >= self.k :
            print ( self.x + self.k )
        else :
            print ( self.y + self.x - ( self.k - self.y ) )
