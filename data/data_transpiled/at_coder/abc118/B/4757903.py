def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.__next__ ( )
        M = sc.__next__ ( )
        t = [ 0 ] * M
        for i in range ( N ) :
            K = sc.__next__ ( )
            for j in range ( K ) :
                t [ sc.__next__ ( ) - 1 ] += 1
        ans = 0
        for i in range ( M ) :
            if t [ i ] == N :
                ans += 1
        print ( ans )
