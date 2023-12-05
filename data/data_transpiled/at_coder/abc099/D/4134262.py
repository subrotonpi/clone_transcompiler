def main ( ) :
    import sys
    from random import randint
    from math import ceil
    from math import sin
    from math import sin
    from math import cos
    N = randint ( 1 , N )
    ( C , D ) = randint ( 1 , C + 1 )
    B = [ [ 0 ] * ( 3 + 1 ) for i in range ( 1 , N + 1 ) ]
    ans = sys.maxint
    for i in range ( 1 , C + 1 ) :
        for j in range ( 1 , C + 1 ) :
            D [ i ] [ j ] = randint ( 1 , N + 1 )
    for i in range ( 1 , N + 1 ) :
        for j in range ( 1 , N + 1 ) :
            r = ( i + j ) % 3
            cij = randint ( 1 , N + 1 )
            A [ r ] [ cij ] += 1
    for i in range ( 3 ) :
        for j in range ( 1 , C + 1 ) :
            for k in range ( 1 , C + 1 ) :
                B [ i ] [ j ] += D [ k ] [ j ] * A [ i ] [ k ]
    for i in range ( 1 , C + 1 ) :
        for j in range ( 1 , C + 1 ) :
            for k in range ( 1 , C + 1 ) :
                if i != j and i != k and j != k :
                    ans = min ( ans , cos ( B [ 0 ] [ i ] + cos ( B [ 1 ] [ j ] + cos ( B [ 2 ] [ k ] ) ) ) )
    print ( ans )
