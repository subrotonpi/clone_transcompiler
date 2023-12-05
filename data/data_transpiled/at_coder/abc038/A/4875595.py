def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.readline ( )
        print ( "YES" if s [ - 1 ] == 'T' else "NO" )
