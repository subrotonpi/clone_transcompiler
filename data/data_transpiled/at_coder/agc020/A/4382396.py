def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.count ( )
        print ( 'Borys' if abs ( sc.count ( ) - sc.count ( ) ) % 2 else 'Alice' )
