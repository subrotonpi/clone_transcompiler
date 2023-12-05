def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        a , d = sc.split ( )
        if a > d :
            print ( a * ( d + 1 ) )
        else :
            print ( ( a + 1 ) * d )
