def main ( ) :
    import sys
    from numpy.linalg import eigs
    from numpy.random import randint
    from numpy.random import rand
    N = rand ( )
    C = rand ( )
    D = [ rand ( ) for i in range ( C ) ]
    c = [ rand ( ) for i in range ( N ) ]
    for i in range ( N ) :
        for j in range ( N ) :
            c [ i ] [ j ] = rand ( ) - 1
    g = [ [ 0 for i in range ( C ) ] for j in range ( 3 ) ]
    for i in range ( C ) :
        for j in range ( N ) :
            for k in range ( N ) :
                if c [ j ] [ k ] != i :
                    g [ i ] [ ( j + k ) % 3 ] += D [ c [ j ] [ k ] ] [ i ]
    min = sum ( [ g [ i ] [ 0 ] + g [ j ] [ 1 ] + g [ k ] [ 2 ] for j in range ( C ) ] )
    print ( min )
