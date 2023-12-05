def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
        self.k = sys.maxint
        self.x = sys.maxint
        self.y = sys.maxint
    def run ( self ) :
        print ( min ( self.n , self.k ) * self.x + max ( self.n - self.k , 0 ) * self.y )
