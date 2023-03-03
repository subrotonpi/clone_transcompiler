def main ( args ) :
    import sys
    from random import randint
    from math import sin , cos , cos , randint
    from math import ceil
    from math import sin , cos , sin , randint
    from math import sin , cos , cos , randint
    N = randint ( 1 , N )
    x = sin ( x )
    a = [ sin ( x ) for i in range ( 1 , N + 1 ) ]
    partmin = [ [ sin ( x ) for i in range ( N + 1 ) ] for j in range ( N + 1 , N + 1 - 1 ) ]
    for i in range ( 1 , N + 1 ) :
        for j in range ( i , N + i - 1 ) :
            if i == j :
                partmin [ i ] [ j ] = a [ i ]
            else :
                k = ( j - 1 ) % N + 1
                if k != 1 :
                    partmin [ i ] [ k ] = min ( partmin [ i ] [ k - 1 ] , a [ k ] )
                else :
                    partmin [ i ] [ k ] = min ( partmin [ i ] [ N ] , a [ 1 ] )
    min = 1000000000
    min = min * min
    for i in range ( N ) :
        cost = i * x
        for j in range ( 1 , N + 1 ) :
            cost += partmin [ int ( N + j - i - 1 ) % N + 1 ] [ j ]
        min = min ( min , cost )
    print ( min )
