def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        X = sc.readline ( )
        A = sc.readline ( )
        B = sc.readline ( )
        print ( ( X - A ) % B )
