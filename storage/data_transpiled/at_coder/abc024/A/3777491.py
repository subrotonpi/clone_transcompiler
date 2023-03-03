def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.c = sys.stdin.read ( )
        self.k = sys.stdin.read ( )
        self.s = sys.stdin.read ( )
        self.t = sys.stdin.read ( )
        self.sum = 0
        if self.s + self.t >= self.k :
            self.sum = self.sum + ( self.s * ( self.a - self.c ) + self.t * ( self.b - self.c ) )
        else :
            self.sum = self.sum + ( self.s * a + self.t * b )
        print ( self.sum )
