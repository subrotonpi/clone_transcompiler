def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.stdin.read ( )
        self.b = sys.stdin.read ( )
        self.c = sys.stdin.read ( )
        self.d = sys.stdin.read ( )
        print ( 'Yes' if abs ( a - c ) <= d or ( abs ( a - b ) <= d and abs ( b - c ) <= d ) else 'No' )
