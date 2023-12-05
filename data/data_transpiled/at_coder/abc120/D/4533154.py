def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import randint
    from numpy.core import zeros
    from numpy.core import linalg
    N = randint ( 1 , N )
    M = randint ( 1 , M )
    A = [ [ randint ( - 1 , N ) for _ in range ( M ) ] for _ in range ( M ) ]
    B = [ [ randint ( - 1 , N ) for _ in range ( N ) ] for _ in range ( N ) ]
    inconv = zeros ( M + 1 )
    inconv [ M ] = long ( N * ( N - 1 ) / 2 )
    for v1 , v2 in zip ( A , B ) :
        l1 = find_root ( B , v1 )
        l2 = find_root ( B , v2 )
        inconv [ i ] = inconv [ i + 1 ]
        if l1 != l2 :
            s1 = B [ l1 ] [ 1 ]
            s2 = B [ l2 ] [ 1 ]
            inconv [ i ] -= s1 * s2
            if s1 < s2 :
                temp = l1
                l1 = l2
                l2 = temp
            B [ l1 ] [ 1 ] += B [ l2 ] [ 1 ]
            B [ l2 ] [ 0 ] = l1
            B [ l2 ] [ 1 ] = 0
    for i in range ( 1 , M + 1 ) :
        print ( inconv [ i ] )
