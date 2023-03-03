def main ( args ) :
    import sys
    from numpy import zeros
    from numpy.linalg import solve
    from numpy.random import randint
    N = randint ( 1 , N )
    C = randint ( 1 , N )
    D = zeros ( ( C + 1 , C + 1 ) )
    c = zeros ( ( N + 1 , N + 1 ) )
    table = zeros ( ( 3 , C + 1 ) )
    for i in range ( 1 , C + 1 ) :
        for j in range ( 1 , C + 1 ) :
            D [ i , j ] = randint ( 1 , N + 1 )
    for i in range ( 1 , N + 1 ) :
        for j in range ( 1 , N + 1 ) :
            col = randint ( 1 , C + 1 )
            table [ ( i + j ) % 3 ] [ col ] += 1
    costable = zeros ( ( 3 , C + 1 ) )
    for i in range ( 3 ) :
        for j in range ( 1 , C + 1 ) :
            for k in range ( 1 , C + 1 ) :
                costable [ i , k ] += D [ j , k ] * table [ i , j ]
    min = 260000000
    for i in range ( 1 , C + 1 ) :
        for j in range ( 1 , C + 1 ) :
            for k in range ( 1 , C + 1 ) :
                if i != j and j != k and k != i :
                    min = min ( min , costable [ 0 , i ] + costable [ 1 , j ] + costable [ 2 , k ] )
    print ( min )
