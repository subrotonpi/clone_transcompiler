def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.xa = sys.stdin.read ( )
        self.ya = sys.stdin.read ( )
        self.xb = sys.stdin.read ( )
        self.yb = sys.stdin.read ( )
        self.xc = sys.stdin.read ( )
        self.yc = sys.stdin.read ( )
        self.a = xb - xa
        self.b = yb - ya
        self.c = xc - xa
        self.d = yc - ya
        r = float ( abs ( a * d - b * c ) ) / 2
        print ( r )
