def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.A = sys.stdin.read ( )
        self.B = sys.stdin.read ( )
        self.cnt = 0
        if self.N * self.A >= self.B :
            print ( self.B )
        else :
            print ( self.N * self.A )
