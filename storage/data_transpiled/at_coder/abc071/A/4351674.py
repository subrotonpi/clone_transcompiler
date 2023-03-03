def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.c = sys.stdin.read ( )
        print ( ( 'A' if abs ( a - b ) < abs ( a - c ) else 'B' ) )
