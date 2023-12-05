def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        r = sc.read ( )
        g = sc.read ( )
        print ( g * 2 - r )
