def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = sc.read ( )
        b = sc.read ( )
        print ( ( a + b ) % 24 )
