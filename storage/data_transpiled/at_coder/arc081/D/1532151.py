def main ( ) :
    import sys
    from itertools import chain
    from itertools import chain
    def __main__ ( ) :
        sc = sys.stdin
        h = sc.__next__ ( )
        w = sc.__next__ ( )
        mat = [ [ ] for _ in range ( h ) ]
        max = max ( h , w )
        for i in range ( h ) :
            tmp = sc.__next__ ( ).split ( )
            for j in range ( w ) :
                if tmp [ j ] == '#' :
                    mat [ i ] [ j ] = 1
                else :
                    mat [ i ] [ j ] = 0
        if not stack :
            for tmp in stack :
                max = max ( max , long ( tmp [ 0 ] + 1 ) * ( w - tmp [ 1 ] ) )
        print ( max )
    def __main__ ( ) :
        n_mat = [ [ ] for _ in range ( h - 1 ) ]
        for i in range ( h - 1 ) :
            for j in range ( w - 1 ) :
                if ( mat [ i ] [ j ] + mat [ i + 1 ] [ j ] + mat [ i ] [ j + 1 ] + mat [ i + 1 ] [ j + 1 ] ) % 2 == 0 :
                    n_mat [ i ] [ j ] = 1
                else :
                    n_mat [ i ] [ j ] = 0
        hist = [ [ ] for _ in range ( h - 1 ) ]
        for i in range ( h - 1 ) :
            for j in range ( w - 1 ) :
                if n_mat [ i ] [ j ] :
                    if i == 0 :
                        hist [ i ] [ j ] = 1
                    else :
                        hist [ i ] [ j ] = hist [ i - 1 ] [ j ] + 1
                else :
                    hist [ i ] [ j ] = 0
        stack = chain ( * [ [ ] ] )
        for i in range ( h - 1 ) :
            if not stack :
                for tmp in stack :
                    max = max ( max , long ( tmp [ 0 ] + 1 ) * ( w - tmp [ 1 ] ) )
        print ( max )
