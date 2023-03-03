def main ( ) :
    import sys
    from itertools import repeat
    from itertools import chain
    N = len ( sys.stdin.readline ( ) )
    M = len ( sys.stdin.readline ( ) )
    graph = [ 0 ] * N
    for i in range ( M ) :
        x , y = next ( chain ( range ( N ) , N ) ) - 1
        graph [ y ] ^= ( 1 << x )
    dp = [ 1 ] * ( 1 << N )
    dp [ 0 ] = 1
    for i in range ( 1 , ( 1 << N ) ) :
        for j in range ( N ) :
            if ( ( i >> j ) & 1 ) == 1 and ( ( i ^ ( 1 << j ) ) & graph [ j ] ) == 0 :
                dp [ i ] += dp [ i ^ ( 1 << j ) ]
    print ( dp [ ( 1 << N ) - 1 ] )
