def main ( ) :
    import sys
    from numpy import array
    from numpy.linalg import norm
    from numpy.random import seed
    sc = open ( '../data/data/' )
    N = int ( sc.readline ( ) )
    n = 3 * N
    a = [ ]
    s = sc.readline ( ).split ( )
    sc.close ( )
    for i in range ( n ) :
        a.append ( float ( s [ i ] ) )
    a = sorted ( a )
    sum = 0
    for i in range ( N ) :
        sum += a [ n - 2 * i - 2 ]
    print ( sum )
