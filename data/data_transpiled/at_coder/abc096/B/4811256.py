def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.A = sys.stdin.read ( )
        self.B = sys.stdin.read ( )
        self.C = sys.stdin.read ( )
        self.K = sys.stdin.read ( )
        self.max = max ( max ( A , B ) , C )
        self.sum = A + B + C - self.max
        for i in range ( K ) :
            self.max *= 2
        print ( self.max , self.sum )
