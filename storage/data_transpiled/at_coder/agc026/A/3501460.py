def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.number
        A = [ sc.number for _ in range ( N ) ]
        ans = 0
        for i in range ( 1 , N ) :
            if A [ i ] == A [ i - 1 ] :
                ans += 1
                A [ i ] = - 1
        print ( ans )
