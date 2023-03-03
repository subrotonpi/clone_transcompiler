def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        a = sys.argv [ 1 ]
        print ( "Yes" if ( a / 100 == a % 10 ) else "No" )
