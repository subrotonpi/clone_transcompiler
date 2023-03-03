def import import _sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = _sys.stdin
        N = sc.read ( )
        K = sc.read ( )
        ans = K
        for i in range ( 1 , N ) :
            ans *= ( K - 1 )
        print ( ans )
