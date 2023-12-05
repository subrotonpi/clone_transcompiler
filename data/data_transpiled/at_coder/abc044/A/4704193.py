def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.maxint
        self.K = sys.maxint
        self.X = sys.maxint
        self.Y = sys.maxint
        if self.N >= K :
            print ( self.X * self.K + ( self.N - K ) * self.Y )
        else :
            print ( self.N * self.X )
