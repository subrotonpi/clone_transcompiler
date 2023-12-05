def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.k = sys.stdin.read ( )
        self.l = sys.stdin.read ( )
        self.s = self.k / self.l
        self.t = self.k % self.l
        if not t :
            print ( self.s * b )
        else :
            if self.t * a < b :
                print ( self.s * b + self.t * a )
            else :
                print ( ( self.s + 1 ) * b )
