def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        a = sc.__next__ ( )
        b = sc.__next__ ( )
        c = sc.__next__ ( )
        print ( "Yes" if a <= c <= b else "No" )
