def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
        self.m = sys.stdin.read ( )
        self.a = 0
        for i in range ( self.n ) :
            po = sys.stdin.read ( )
            self.a += min ( po , m - po )
        print ( self.a * 2 )
