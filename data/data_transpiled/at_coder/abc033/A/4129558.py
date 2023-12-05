def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.read ( )
        if s [ 0 ] == s [ 1 ] and s [ 2 ] == s [ 3 ] and s [ 0 ] == s [ 2 ] :
            print ( "SAME" )
        else :
            print ( "DIFFERENT" )
