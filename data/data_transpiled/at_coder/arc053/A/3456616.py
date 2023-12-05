def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.H = sys.maxint
        self.W = sys.maxint
        print ( ( self.H - 1 ) * self.W + ( self.W - 1 ) * self.H )
