def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        a = sc.__next__ ( )
        b = sc.__next__ ( )
        print ( ( b - a ) * ( b - a + 1 ) / 2 - b )
