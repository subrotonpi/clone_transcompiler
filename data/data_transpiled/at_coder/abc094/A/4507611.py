def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
        self.m = sys.maxint
        self.l = sys.maxint
        if self.n <= self.l and self.n + self.m >= self.l :
            print ( "YES" )
        else :
            print ( "NO" )
