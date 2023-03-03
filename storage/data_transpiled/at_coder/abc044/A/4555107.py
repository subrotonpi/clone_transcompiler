def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
        self.k = sys.maxint
        self.x = sys.maxint
        self.y = sys.maxint
        if self.n <= self.k :
            print ( self.x * self.n )
        else :
            print ( self.x * self.k + self.y * ( self.n - self.k ) )
