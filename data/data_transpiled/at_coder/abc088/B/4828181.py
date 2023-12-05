def main ( ) :
    import sys
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    reader = sys.stdin
    N = sys.argv [ 1 ]
    arr = [ ]
    a = b = 0
    for i in range ( N ) :
        arr.append ( reader.read ( ) )
    arr.sort ( )
    for i in range ( N - 1 , - 1 , - 2 ) :
        a += arr [ i ]
        if i > 0 :
            b += arr [ i - 1 ]
    assert_almost_equal ( a - b , 0 )
    reader.close ( )
