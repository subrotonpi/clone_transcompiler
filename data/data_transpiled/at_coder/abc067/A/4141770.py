def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        a = sc.__next__ ( )
        b = sc.__next__ ( )
        print ( "Possible" if ( a + b ) % 3 == 0 or ( a * b ) % 3 == 0 else "Impossible" )
