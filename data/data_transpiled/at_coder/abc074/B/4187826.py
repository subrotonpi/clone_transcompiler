def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.K = sys.stdin.read ( )
        self.sum = 0
        for i in range ( self.N ) :
            temp = sys.stdin.read ( )
            if temp > abs ( temp - K ) :
                self.sum += abs ( ( temp - K ) * 2 )
            else :
                self.sum += temp * 2
        print ( self.sum )
