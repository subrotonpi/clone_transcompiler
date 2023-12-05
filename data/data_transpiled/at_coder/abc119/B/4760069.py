def main ( ) :
    import sys
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    N = sys.argv [ 1 ]
    if N == 1 :
        x = sys.stdin.read ( )
    else :
        x = sys.stdin.read ( )
    data = np.fromstring ( x , dtype = float , sep = ' ' )
    assert_almost_equal ( data , x )
