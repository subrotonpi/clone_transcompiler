def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.s = _main ( )
    def __call__ ( self , * args ) :
        sc = _main ( )
        s = sc.next ( )
        arr = s.lower ( ).split ( )
        arr [ 0 ] = chr ( ord ( arr [ 0 ] ) - ord ( 'a' ) + ord ( 'A' ) )
        print ( arr )
