def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        h = sc.readline ( )
        m = sc.readline ( )
        ans = ( 17 - h ) * 60 + ( 60 - m )
        print ( ans )
