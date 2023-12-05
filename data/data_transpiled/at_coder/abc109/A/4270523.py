def import import sys
class Main ( object ) :
    def __init__ ( self , * args ) :
        s = sys.stdin
        a = s.read ( )
        b = s.read ( )
        print ( "No" if ( a % 2 == 0 or b % 2 == 0 ) else "Yes" )
