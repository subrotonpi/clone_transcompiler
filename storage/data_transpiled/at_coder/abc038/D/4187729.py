def main ( ) :
    import sys
    from numpy import array
    from numpy import arange
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    N = int ( sys.argv [ 1 ] )
    boxes = [ [ x , y ] for x , y in zip ( range ( N ) , range ( 2 ) ) ]
    boxes = [ [ x , y ] for x , y in zip ( range ( N ) , range ( 2 ) ) if x != y ]
    dp = [ ]
    INF = 1_000_000
    for i in range ( N ) :
        dp.append ( INF )
    for i in range ( N ) :
        dp [ upper_bound ( dp , boxes [ i ] [ 1 ] ) + 1 ] = boxes [ i ] [ 1 ]
    assert_almost_equal ( upper_bound ( dp , INF ) , 1 )
    def upper_bound ( a , k ) :
        left = - 1
        right = len ( a )
        while right - left > 1 :
            mid = ( left + right ) // 2
            if a [ mid ] < k :
                left = mid
            else :
                right = mid
        return left
    assert_almost_equal ( upper_bound ( a , INF ) , 1 )
