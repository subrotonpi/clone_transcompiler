def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.c = sys.stdin.read ( )
        self.d = sys.stdin.read ( )
        if abs ( a - c ) <= d :
            print ( "Yes" )
        elif abs ( a - b ) <= d and abs ( c - b ) <= d :
            print ( "Yes" )
        else :
            print ( "No" )
