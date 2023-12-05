def main ( ) :
    import sys
    from numpy import linspace
    from numpy.linalg import norm
    with open ( sys.argv [ 1 ] ) as f :
        N = int ( f.read ( ) )
        A = norm ( f.read ( ) )
        B = norm ( f.read ( ) )
        S = [ norm ( s ) for s in f.readlines ( ) ]
        S = [ s for s in S if s != - 1 ]
        min = S [ 0 ]
        max = S [ N - 1 ]
        S = [ s for s in S if s != - 1 ]
        P = - 1
        Q = - 1
        if min != max :
            P = B / ( max - min )
            Q = A - ( P * S ) / N
            print ( P , Q )
        elif min == max :
            print ( - 1 )
