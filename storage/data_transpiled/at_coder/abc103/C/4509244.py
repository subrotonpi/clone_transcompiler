def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.recv_args ( ) [ 0 ]
        values = [ sc.recv_args ( ) [ 1 ] for _ in range ( N ) ]
        ans = 0
        for i in range ( N ) :
            ans += ( values [ i ] - 1 )
        print ( ans )
