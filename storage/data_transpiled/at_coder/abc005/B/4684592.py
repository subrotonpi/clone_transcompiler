def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        a = sc.read ( N )
        d = sys.maxsize
        for i in range ( N ) :
            d = min ( d , sc.readline ( ).strip ( ) )
        print ( d )
