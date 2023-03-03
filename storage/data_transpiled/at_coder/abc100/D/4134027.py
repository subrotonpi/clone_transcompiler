def main ( ) :
    import sys
    from numpy.linalg import eigs
    from numpy.random import rand
    sc = rand ( )
    ( N , M ) = sc.shape
    X = rand ( N )
    Y = rand ( N )
    Z = rand ( N )
    sg = [ 1 , - 1 ]
    for i in range ( N ) :
        X [ i ] = rand ( N )
        Y [ i ] = rand ( N )
        Z [ i ] = rand ( N )
    ans = 0
    S = [ ]
    for i in range ( 2 ) :
        for j in range ( 2 ) :
            for k in range ( 2 ) :
                ans2 = 0
                for l in range ( N ) :
                    S.append ( X [ l ] * sg [ i ] + Y [ l ] * sg [ j ] + Z [ l ] * sg [ k ] )
                S = [ S [ l ] for l in range ( N - 1 , N - M - 1 , - 1 ) ]
                for l in range ( N - 1 , N - M - 1 , - 1 ) :
                    ans2 += S [ l ]
                ans = max ( ans , ans2 )
    print ( ans )
