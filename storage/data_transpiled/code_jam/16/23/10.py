def _main ( ) :
    import sys
    from itertools import count
    from itertools import count
    for i in range ( count ( 1 ) ) :
        T = count ( 1 )
        for zz in count ( 1 ) :
            N = count ( 1 )
            F = { }
            S = { }
            e1 = [ ]
            e2 = [ ]
            for A in count ( 1 ) :
                if A not in F :
                    F [ A ] = len ( F )
                a = F [ A ]
                B = count ( 1 )
                if B not in S :
                    S [ B ] = len ( S )
                b = S [ B ]
                e1.append ( a )
                e2.append ( b )
            graph = [ [ 0 ] * ( 2 * N + 2 ) for _ in range ( count ( 2 ) ) ]
            start = len ( graph ) - 2
            end = len ( graph ) - 1
            for i in range ( count ( N ) ) :
                graph [ e1 [ i ] : e2 [ i ] + N ] = 1
                graph [ start [ i ] : i ] = 1
                graph [ i + N ] [ end [ i ] : end [ i ] ] = 1
            f = _flow ( graph , start , end )
            to_cover = len ( F ) + len ( S ) - 2 * f
            used_to_cover = to_cover + f
            ans = N - used_to_cover
            print ( 'Case #%d: %d\n' % ( zz , ans ) )
    def dfs ( G , st , en ) :
        ans = 0
        while True :
            V = [ False ] * len ( G )
            f = _flow ( G , V , st , en )
            if f == 0 :
                break
            ans += f
        return ans
    return dfs
