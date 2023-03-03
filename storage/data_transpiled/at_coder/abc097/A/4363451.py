def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.argv [ 1 ]
        self.b = sys.argv [ 2 ]
        self.c = sys.argv [ 3 ]
        self.d = sys.argv [ 4 ]
        if abs ( a - c ) <= d :
            print ( "Yes" )
        elif ( abs ( a - b ) <= d and abs ( b - c ) <= d ) :
            print ( "Yes" )
        else :
            print ( "No" )
