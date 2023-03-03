def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        s = sc.split ( )
        for i in range ( ( len ( s ) - 1 ) / 2 , 0 , - 1 ) :
            if s [ : i ] == s [ i : i * 2 ] :
                print ( i * 2 )
                return
