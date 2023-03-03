def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        x = sc.__next__ ( )
        t = sc.__next__ ( )
        print ( max ( 0 , x - t ) )
