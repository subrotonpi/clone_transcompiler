def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        c = sc.next ( ) [ 0 ]
        print ( ord ( c ) - ord ( 'A' ) + 1 )
