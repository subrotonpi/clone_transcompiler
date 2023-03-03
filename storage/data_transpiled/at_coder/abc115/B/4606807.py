def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.max = sys.stdin.read ( )
        self.P = self.max
        for i in range ( self.N - 1 ) :
            b = sys.stdin.read ( )
            if b > self.max :
                self.max = b
            self.P += b
        self.max = self.max / 2
        self.P = self.P - self.max
        print ( self.P )
