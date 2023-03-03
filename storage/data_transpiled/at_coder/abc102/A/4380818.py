def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.read ( )
        if N % 2 == 0 :
            print ( N )
        else :
            print ( 2 * N )
