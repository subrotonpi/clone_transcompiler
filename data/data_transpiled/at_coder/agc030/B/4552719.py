def main ( ) :
    import sys
    from numpy.linalg import solve
    L = solve ( )
    N = len ( sys.argv )
    x = range ( N )
    y = [ L - x [ i ] for i in range ( N ) ]
    x2 = [ x [ i - 1 ] + x [ i - 1 ] * 2L for i in range ( 1 , N + 1 ) ]
    y2 = [ x [ i - 1 ] + y [ i - 1 ] * 2L for i in range ( 1 , N + 1 ) ]
    max = x [ N - 1 ]
    for n in range ( N - 1 , 0 , - 1 ) :
        m = N - n
        if n > m :
            max = max + max + max + max + max + max + max + x2 [ n - m - 1 ] + y2 [ m ] - y2 [ 0 ] + x [ n - 1 ] , x2 [ n ] - x2 [ n - m ] + y2 [ m - 1 ] - y2 [ 0 ] + y [ m - 1 ]
        else :
            max = max + max + max + max + max + x2 [ n - 1 ] - x2 [ 0 ] + y2 [ m ] - y2 [ m - n ] + x [ n - 1 ] , x2 [ n ] - x2 [ 0 ] + y2 [ m - 1 ] - y2 [ max ( m - n - 1 , 0 ) ] + y [ m - 1 ]
    max = max + max + y [ N - 1 ]
    print ( max )
