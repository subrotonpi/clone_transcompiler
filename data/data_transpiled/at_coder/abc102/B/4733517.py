def main ( ) :
    import sys
    from numpy import arange
    from numpy.core import zeros
    from numpy.core import dot
    from numpy.linalg import eigs
    N = len ( sys.argv )
    A = zeros ( N )
    for i in range ( N ) :
        A [ i ] = dot ( A [ i ] , A [ i ] )
    A = [ dot ( A , A [ i ] ) for i in range ( N ) ]
    print ( A [ N - 1 ] - A [ 0 ] )
    del A
