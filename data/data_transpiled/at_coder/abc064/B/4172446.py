def main ( ) :
    import sys
    from numpy.linalg import eigs
    from numpy.random import rand
    N = rand ( )
    map = [ rand ( ) for _ in range ( N ) ]
    map.sort ( )
    print ( map [ - 1 ] - map [ 0 ] )
