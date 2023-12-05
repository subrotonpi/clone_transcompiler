def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        a = sc.__next__ ( )
        b = sc.__next__ ( )
        h = sc.__next__ ( )
        print ( h * ( a + b ) / 2 )
