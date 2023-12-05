def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.Scanner = sys.stdin
        self.N = self.N
        self.K = self.K
        self.X = self.X
        self.Y = self.Y
        self.price = ( self.N <= self.K ) * self.X + ( ( self.N - self.K ) * self.Y )
        print ( self.price )
