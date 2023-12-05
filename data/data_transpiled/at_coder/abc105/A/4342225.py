def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
        self.k = sys.maxint
        if self.n % self.k == 0 :
            self.print ( 0 )
            return
        self.print ( 1 )
