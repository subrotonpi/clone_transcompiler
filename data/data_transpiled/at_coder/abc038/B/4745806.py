def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.c = sys.stdin.read ( )
        self.d = sys.stdin.read ( )
        print ( "YES" if ( b == d or b == c or a == c or a == d ) else "NO" )
