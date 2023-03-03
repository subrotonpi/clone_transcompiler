def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.K = sys.stdin.read ( )
        self.sum = 1
        if self.K <= 2 :
            self.sum += self.K * self.N
        else :
            for i in range ( self.N ) :
                if self.sum < self.K :
                    self.sum = self.sum * 2
                else :
                    self.sum += self.K
        print ( self.sum )
