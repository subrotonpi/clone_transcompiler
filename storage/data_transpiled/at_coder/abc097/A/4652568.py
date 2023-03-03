def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.c = sys.stdin.read ( )
        self.d = sys.stdin.read ( )
        self.ab = int ( abs ( a - b ) )
        self.bc = int ( abs ( b - c ) )
        self.ca = int ( abs ( c - a ) )
        if self.ca <= self.d :
            print ( "Yes" )
            return
        if self.ab <= self.d and self.bc <= self.d :
            print ( "Yes" )
            return
        print ( "No" )
