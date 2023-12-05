def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.K = sys.stdin.read ( )
        self.X = sys.stdin.read ( )
        self.Y = sys.stdin.read ( )
        self.total = ( self.N * self.X ) + self.Y * ( self.N - K )
        print ( self.total )
