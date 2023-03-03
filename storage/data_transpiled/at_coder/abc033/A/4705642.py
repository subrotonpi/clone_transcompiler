def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( )
        if N [ 0 ] == N [ 1 ] and N [ 1 ] == N [ 2 ] and N [ 2 ] == N [ 3 ] :
            print ( "SAME" )
        else :
            print ( "DIFFERENT" )
