def main ( ) :
    import sys
    from numpy import arange
    from numpy.linalg import norm
    with open ( '../data/data/' ) as sc :
        N = sc.read ( )
        A = norm ( sc )
        B = norm ( sc )
        X = range ( N )
        ret = 0
        for i in range ( N - 1 ) :
            distance = X [ i + 1 ] - X [ i ]
            ret += min ( distance * A , B )
        print ( ret )
