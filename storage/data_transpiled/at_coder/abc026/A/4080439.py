def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.argv [ 1 ]
        self.half = self.n // 2
        print ( self.half * ( self.n - self.half ) )
