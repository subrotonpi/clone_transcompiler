def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        S = sc.next ( )
        S = S.split ( )
        min_dif = sys.maxint
        for i in range ( 0 , S.__len__ ( ) - 3 ) :
            min_dif = min ( min_dif , abs ( int ( S [ i : i + 3 ] ) - 753 ) )
        print ( min_dif )
