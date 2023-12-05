def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        s = sc.split ( )
        print ( s [ 0 ] == s [ 1 ] and s [ 1 ] == s [ 2 ] or s [ 1 ] == s [ 2 ] and s [ 2 ] == s [ 3 ] )
