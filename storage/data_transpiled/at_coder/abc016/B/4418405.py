def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.n = sys.stdin.read ( )
        print ( ( a + b == n ) and '?' or '+' or '-' or '!' )
