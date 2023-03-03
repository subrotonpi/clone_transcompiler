def main ( args ) :
    import sys
    from numpy import zeros
    from numpy.linalg import solve
    from numpy.random import seed
    from numpy.random import seed
    seed ( )
    N = len ( args )
    K = len ( args )
    a = [ seed ( i ) for i in range ( N ) ]
    s = zeros ( N + 1 )
    bla = [ ]
    for i in range ( N ) :
        s [ i + 1 ] = s [ i ] + a [ i ]
        if a [ i ] > 0 :
            bla [ i + 1 ] = bla [ i ] + a [ i ]
        else :
            bla [ i + 1 ] = bla [ i ]
    max = 0
    for i in range ( N - K + 1 ) :
        max = max ( max , bla [ i ] - bla [ 0 ] + max ( s [ i + K ] - s [ i ] , 0 ) + bla [ N ] - bla [ i + K ] )
    print ( max )
