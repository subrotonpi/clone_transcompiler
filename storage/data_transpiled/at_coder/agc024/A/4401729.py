def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        a , b , c = sc.__next__ ( )
        k = sc.__next__ ( )
        print ( b - a if k % 2 == 1 else a - b )
