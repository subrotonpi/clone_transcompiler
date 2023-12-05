def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.a = sys.argv [ 1 ]
        self.b = sys.argv [ 2 ]
        self.c = sys.argv [ 3 ]
        if ( a >= c and a <= b ) or ( a <= c and a >= b ) :
            print ( a )
        elif ( b >= a and b <= c ) or ( b <= a and b >= c ) :
            print ( b )
        else :
            print ( c )
