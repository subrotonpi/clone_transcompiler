def import _main
class Main ( object ) :
    def __init__ ( self ) :
        s = _main ( )
        n , take = s.__next__ ( ) , s.__next__ ( )
        for i in range ( 0 , n ) :
            n -= take [ i % 2 ]
            if n <= 0 :
                print ( 'Ant' if i % 2 == 0 else 'Bug' )
                return
