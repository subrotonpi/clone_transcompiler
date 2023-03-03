def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( )
        M = sc.readline ( )
        a = [ N + M , N - M , N * M ]
        a.sort ( )
        print ( a [ 2 ] )
