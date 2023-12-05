def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        arr = sc.next ( ).split ( )
        for i in range ( 1 , 4 ) :
            if arr [ 0 ] != arr [ i ] :
                print ( "DIFFERENT" )
                return
        print ( "SAME" )
