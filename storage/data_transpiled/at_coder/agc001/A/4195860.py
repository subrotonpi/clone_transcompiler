def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = 2 * sc.getmaxyx ( )
        ar = [ sc.get ( i ) for i in range ( n ) ]
        ar.sort ( )
        ans = 0
        for i in range ( 0 , n - 1 , 2 ) :
            ans += min ( ar [ i ] , ar [ i + 1 ] )
        print ( ans )
