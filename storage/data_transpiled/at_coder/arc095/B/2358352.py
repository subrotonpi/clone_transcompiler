def main ( ) :
    import sys
    from numpy import abs
    from numpy.linalg import solve
    from numpy.random import seed
    from numpy.random import seed
    seed ( )
    N = seed ( )
    X = solve ( seed ( ) , X )
    X = [ x for x in X if x != 0 ]
    n = X [ N - 1 ]
    m = n / 2.0
    d = float ( 'inf' )
    r = X [ N - 1 ]
    for x in X [ N - 1 : ] :
        s = abs ( x - m )
        if d > s :
            d = s
            r = X [ N - 1 ]
    print ( n , r )
