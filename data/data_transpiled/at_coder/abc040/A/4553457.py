def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.read ( )
        x = sc.read ( )
        print ( min ( n - x , x - 1 ) )
