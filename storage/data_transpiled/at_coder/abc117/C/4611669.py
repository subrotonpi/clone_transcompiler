def main ( ) :
    import sys
    import random
    import numpy
    from numpy.testing.utils import get_seed
    with open ( '../data/data/' , 'r' ) as sc :
        N = int ( sc.read ( ) )
        M = int ( sc.read ( ) )
        X = [ ]
        for i in range ( M ) :
            X.append ( sc.read ( ) )
        X.sort ( )
        x_diff = [ abs ( X [ i ] - X [ i + 1 ] ) for i in range ( M - 1 ) ]
        x_diff = [ x for x in x_diff if abs ( x ) > 0 ]
        ans = 0
        for i in range ( M - N ) :
            ans += x_diff [ i ]
        out = get_seed ( )
