def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import randint
    from numpy.random import choice
    N = randint ( 1 , N )
    M = randint ( 1 , N )
    A = [ choice ( range ( M ) ) for i in range ( M ) ]
    B = [ choice ( range ( M ) ) for i in range ( M ) ]
    Adj = solve ( A , B )
    count = [ 0 for i in range ( N ) ]
    visited = [ False for i in range ( N ) ]
    for i in range ( N ) :
        for l in range ( N ) :
            visited [ l ] = True
        visited [ i ] = True
        for j in range ( N ) :
            if Adj [ i ] [ j ] == 1 :
                visited [ j ] = True
                for k in range ( N ) :
                    if visited [ k ] == False and Adj [ j ] [ k ] == 1 and k != j and Adj [ i ] [ k ] == 0 :
                        visited [ k ] = True
                        count [ i ] += 1
    for i in range ( N ) :
        print ( count [ i ] )
