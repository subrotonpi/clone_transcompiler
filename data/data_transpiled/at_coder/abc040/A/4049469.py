def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.read ( )
        x = sc.read ( )
        print ( min ( x - 1 , n - x ) )
