def main ( args ) :
    from numpy import array
    from numpy.linalg import solve
    from numpy.random import seed
    from numpy.random import seed
    seed ( 1 )
    N = len ( args )
    W = args [ 0 ]
    Wsum = 0
    for i in range ( 0 , N ) :
        for j in range ( 0 , N ) :
            for k in range ( 0 , N ) :
                for l in range ( 0 , N ) :
                    wsum = long ( w [ i ] ) * long ( i + k + l ) + long ( j + k + l )
                    if wsum <= W :
                        max = max ( W0 [ i ] + W1 [ j ] + W2 [ k ] + W3 [ l ] )
    print ( max )
