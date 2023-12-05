def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.K = sys.stdin.read ( )
        self.X = sys.stdin.read ( )
        self.Y = sys.stdin.read ( )
        self.ans = 0
        self.ans += self.K * self.X if self.N - self.K >= 0 else self.N * self.X
        if self.N <= K :
            print ( self.ans )
            return
        else :
            self.N -= self.K
        print ( self.ans + self.N * self.Y )
