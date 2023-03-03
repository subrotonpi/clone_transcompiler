def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        x = sc.__next__ ( )
        a = sc.__next__ ( )
        b = sc.__next__ ( )
        print ( 'A' if abs ( x - a ) < abs ( x - b ) else 'B' )
