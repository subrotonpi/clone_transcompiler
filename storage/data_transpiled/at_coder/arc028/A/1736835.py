def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
        self.a = sys.maxint
        self.b = sys.maxint
        self.k = self.n // ( self.a + self.b )
        r = self.n - self.k * ( self.a + self.b )
        ans = "Bug"
        if ( r > 0 ) :
            ans = "Ant"
        print ( ans )
