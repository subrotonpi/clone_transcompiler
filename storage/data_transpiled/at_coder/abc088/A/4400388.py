def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint % 500
        self.a = sys.maxint
        print ( "Yes" if self.a >= self.n else "No" )
