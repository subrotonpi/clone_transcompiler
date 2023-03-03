def main ( ) :
    import numpy
    import sys
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    N = int ( sys.argv [ 1 ] )
    K = int ( sys.argv [ 2 ] )
    nacl = [ [ float ( i ) / 100 for i in range ( N ) ] for i in range ( N ) ]
    EPS = 0.001d
    for i in range ( N ) :
        nacl [ i , 0 ] = np.random.random ( N )
        nacl [ i , 1 ] = np.random.random ( N )
    lower = 0.
    upper = 100d
    sio = [ ]
    for h in range ( 60 ) :
        middle = ( lower + upper ) / 2
        for i in range ( N ) :
            sio.append ( ( nacl [ i , 1 ] - middle ) * nacl [ i , 0 ] )
        sio.sort ( )
        sio = [ ]
        for i in range ( K ) :
            sio.append ( sio [ N - 1 - i ] )
        if sio [ N - 1 - i ] > EPS :
            lower = middle
        elif sio [ N - 1 - i ] < - EPS :
            upper = middle
        else :
            pass
    assert_almost_equal ( ( upper + lower ) / 2 , np.nan )
    def pl ( x ) :
        print ( x )
    def p ( x ) :
        print ( x , end = '' )
    return p
