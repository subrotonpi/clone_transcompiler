def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = sc.read ( )
        b = sc.read ( )
        h = sc.read ( )
        ans = ( a + b ) * h / 2
        print ( ans )
