def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.c = sys.stdin.read ( )
        print ( "Yes" if ( self.a + self.b == self.c or self.a + self.c == self.b or self.a == self.b + self.c ) else "No" )
