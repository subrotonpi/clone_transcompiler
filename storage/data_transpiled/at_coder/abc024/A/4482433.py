def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.c = sys.stdin.read ( )
        self.k = sys.stdin.read ( )
        self.s = sys.stdin.read ( )
        self.t = sys.stdin.read ( )
        base = self.a * self.s + self.b * self.t
        if self.s + self.t >= self.k :
            base = base - self.c * ( self.s + self.t )
        print ( base )
