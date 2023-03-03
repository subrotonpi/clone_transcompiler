def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.__next__ ( )
        s = sc.__next__ ( )
        t = sc.__next__ ( )
        ans = 2 * N
        for start in range ( N ) :
            if s [ start : N ] == t [ : N - start ] :
                ans = N + start
                break
        print ( ans )
