def import import _sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = _sys.stdin
        a = sc.read ( )
        b = sc.read ( )
        print ( ( a + b ) % 24 )
