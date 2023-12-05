def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.A = sys.stdin.read ( )
        self.B = sys.stdin.read ( )
        if self.N > 5 :
            print ( ( self.N - 5 ) * self.A + self.B * 5 )
            return
        else :
            print ( self.N * self.B )
            return
