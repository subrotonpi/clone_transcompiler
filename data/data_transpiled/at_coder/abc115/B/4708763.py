def main ( ) :
    import sys
    from numpy import zeros
    from numpy import arange
    from numpy.core import zeros
    from numpy.core import dot
    from numpy.random import choice
    sc = zeros ( ( n , n ) )
    n = int ( sc.shape [ 0 ] )
    yen = [ int ( i ) for i in range ( n ) ]
    yen = [ i for i in yen if i > 0 ]
    yen [ n - 1 ] = yen [ n - 1 ] / 2
    print ( sum ( yen ) )
