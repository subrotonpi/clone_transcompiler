def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos , pi
    from math import cos , pi , sin , pi , pi , pi
    from os.path import join
    from os import path
    N = randint ( 1 , N )
    n = N - 1
    ary = [ [ sin ( i ) for i in range ( n ) ] for j in range ( 3 ) ]
    ans = [ 0 for i in range ( N ) ]
    for i in range ( n ) :
        ans [ i ] = ary [ i ] [ 1 ] + ary [ i ] [ 0 ]
        for j in range ( i + 1 , n ) :
            ans [ i ] = max ( ans [ i ] , ary [ j ] [ 1 ] )
            ans [ i ] = ( ( ans [ i ] - 1 ) / ary [ j ] [ 2 ] + 1 ) * ary [ j ] [ 2 ]
            ans [ i ] += ary [ j ] [ 0 ]
    for num in ans :
        print ( num )
