def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = sc.readline ( )
        b = sc.readline ( )
        if a [ 0 ] == b [ 2 ] and a [ 1 ] == b [ 1 ] and a [ 2 ] == b [ 0 ] :
            print ( "YES" )
        else :
            print ( "NO" )
