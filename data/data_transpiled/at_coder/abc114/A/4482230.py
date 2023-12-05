def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        X = sc.__next__ ( )
        print ( 'YES' if X in [ 7 , 5 , 3 ] else 'NO' )
