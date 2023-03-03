def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.c = sys.stdin.read ( )
        self.d = sys.stdin.read ( )
        if abs ( a - c ) <= d or ( abs ( b - a ) <= d and abs ( b - c ) <= d ) :
            print ( "Yes" )
        else :
            print ( "No" )
