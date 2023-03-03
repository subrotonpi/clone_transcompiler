def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
        self.k = sys.stdin.read ( )
        self.sum = 0
        for i in range ( self.n ) :
            x = sys.stdin.read ( )
            self.sum += min ( x , k - x ) * 2
        print ( self.sum )
