def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        K = sc.read ( )
        if K % 2 == 0 :
            print ( K / 2 * K / 2 )
        else :
            print ( K / 2 * ( K / 2 + 1 ) )
