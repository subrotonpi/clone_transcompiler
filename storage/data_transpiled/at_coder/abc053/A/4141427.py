def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.__next__ ( )
        print ( 'ABC' if n < 1200 else 'ARC' )
