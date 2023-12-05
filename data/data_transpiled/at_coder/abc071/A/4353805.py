def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        x = sc.__next__ ( )
        a = sc.__next__ ( )
        b = sc.__next__ ( )
        diff_xa = ( x - a ).sum ( )
        diff_xb = ( x - b ).sum ( )
        print ( ( diff_xa < diff_xb ).sum ( ) )
