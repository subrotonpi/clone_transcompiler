def main ( ) :
    import sys
    from random import randint
    from numpy import array
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    N = randint ( 1 , N )
    M = randint ( 1 , M )
    x = array ( range ( M ) )
    abc117C = assert_almost_equal ( np.array ( x ) , np.array ( x ) )
    print ( abc117C ( N , x ) )
    def solve ( N , x ) :
        x = sorted ( x )
        diffs = [ x [ i + 1 ] - x [ i ] for i in range ( len ( x ) - 1 ) ]
        diffs.sort ( )
        ans = 0
        for i in range ( len ( diffs ) - N + 1 ) :
            ans += diffs [ i ]
        return ans
    return solve
