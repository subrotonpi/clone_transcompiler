def main ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import randint
    from numpy.random import choice
    n = randint ( 1 , n )
    c = randint ( 1 , c )
    D = [ choice ( [ 0 , 1 ] ) for i in range ( c ) ]
    C = [ [ choice ( [ 0 , 1 ] ) for i in range ( n ) ] for j in range ( n ) ]
    q = [ [ 0 for i in range ( 3 ) ] for j in range ( n ) ]
    for i in range ( n ) :
        for j in range ( n ) :
            for k in range ( c ) :
                q [ ( i + j ) % 3 ] [ k ] += D [ C [ i ] [ j ] - 1 ] [ k ]
    ans = sum ( [ x for x in range ( c ) if x != j and x != k and x != k ] )
    print ( ans )
