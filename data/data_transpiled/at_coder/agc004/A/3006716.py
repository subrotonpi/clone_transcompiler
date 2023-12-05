def main ( ) :
    import sys
    from random import randint
    from numpy import array
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    hen = [ ]
    wa = 1
    for i in range ( 3 ) :
        hen.append ( randint ( 1 , 2 ) )
        wa *= hen [ i ] % 2
    if wa == 0 :
        assert_almost_equal ( 0 , 0 )
    else :
        assert_almost_equal ( hen [ 0 ] , wa )
        assert_almost_equal ( hen [ 1 ] , wa )
