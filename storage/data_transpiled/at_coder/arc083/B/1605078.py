def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import seed
    sc = seed ( )
    n = sc.shape [ 0 ]
    min_d = [ [ ] for i in range ( n ) ]
    ansd_d = [ [ ] for i in range ( n ) ]
    ans = - 1
    flg = True
    for i in range ( n ) :
        for j in range ( n ) :
            for k in range ( n ) :
                if ( i != j ) :
                    if ( min_d [ i ] [ j ] > ( min_d [ i ] [ k ] + min_d [ k ] [ j ] ) ) :
                        flg = False
    if flg :
        for i in range ( n ) :
            for j in range ( n ) :
                for k in range ( n ) :
                    if ( i != j ) :
                        if min_d [ i ] [ j ] == ( min_d [ i ] [ k ] + min_d [ k ] [ j ] ) :
                            ans += ans
                if min_d [ i ] [ j ] == ( min_d [ i ] [ k ] + min_d [ k ] [ j ] ) :
                    ans += ans
    for i in range ( n ) :
        for j in range ( i + 1 ) :
            for k in range ( n ) :
                if ( i != j ) :
                    if min_d [ i ] [ j ] == ( min_d [ i ] [ k ] + min_d [ k ] [ j ] ) :
                        ans += ans
    for i in range ( n ) :
        for j in range ( i + 1 ) :
            for k in range ( n ) :
                if ( min_d [ i ] [ j ] == ( min_d [ i ] [ k ] + min_d [ k ] [ j ] ) ) :
                    ans += ans
    print ( ans )
