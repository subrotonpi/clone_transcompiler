def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        s = sc.split ( )
        t = sc.split ( )
        N = len ( s )
        M = len ( t )
        S = [ s [ i ] for i in range ( N ) ]
        T = [ t [ i ] for i in range ( M ) ]
        S = [ s [ i ] for i in range ( N ) ]
        T = [ t [ i ] for i in range ( M ) ]
        S = [ s [ i ] for i in range ( N ) ]
        T = [ t [ i ] for i in range ( M ) ]
        loop = 0
        if N <= M :
            loop = N
        else :
            loop = M
        for i in loop :
            if S [ i ] < T [ ( M - 1 ) - i ] :
                print ( "Yes" )
                return
            elif S [ i ] > T [ i ] :
                print ( "No" )
                return
            else :
                continue
        print ( "Yes" if N < M else "No" )
