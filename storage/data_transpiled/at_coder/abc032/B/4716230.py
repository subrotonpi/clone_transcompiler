def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        s = sc.next ( )
        k = sc.__next__ ( )
        if len ( s ) == k :
            print ( 1 )
        elif len ( s ) < k :
            print ( 0 )
        else :
            s = set ( s [ i : i + k ] for i in range ( len ( s ) - ( k - 1 ) ) )
            print ( len ( s ) )
