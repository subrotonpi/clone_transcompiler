def import _main
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = _main ( args )
        R = sc.get_float ( )
        G = sc.get_float ( )
        print ( int ( G + ( G - R ) ) )
