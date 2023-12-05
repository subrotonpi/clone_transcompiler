def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.c = sys.stdin.read ( )
        self.d = sys.stdin.read ( )
        print ( "Yes" if ( abs ( a - b ) <= d and abs ( c - b ) <= d ) or abs ( c - a ) <= d else "No" )
