def main ( ) :
    import math
    import numpy as np
    from numpy.testing import assert_array_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    T = np.sum ( np.abs ( np.sin ( CAD ) ) )
    for kasus in range ( 1 , T + 1 ) :
        N = np.shape ( N ) [ 0 ]
        M = np.shape ( N ) [ 1 ]
        px = np.arange ( N )
        py = np.arange ( N )
        ans = np.zeros ( M )
        for i in range ( N ) :
            ans [ i ] = ' %.7f' % ans [ i ]
        assert_almost_equal ( ans [ i ] , 0 )
    for k2 in range ( M ) :
        qx = np.arange ( N )
        qy = np.arange ( N )
        rad = np.sqrt ( np.power ( 1.0 * qx - px [ i ] , 2 ) + np.power ( 1.0 * qy - py [ i ] , 2 ) )
        d = np.sqrt ( np.power ( px [ 1 ] - px [ 0 ] , 2 ) + np.power ( py [ 1 ] - py [ 0 ] , 2 ) )
        if d > rad [ 0 ] + rad [ 1 ] :
            ans [ k2 ] = 0
        elif d < abs ( rad [ 0 ] - rad [ 1 ] ) :
            minrad = rad [ 0 ]
            mi = 0
            if rad [ 1 ] < minrad :
                mi = 1
                minrad = rad [ 1 ]
            ans [ k2 ] = assert_almost_equal ( np.pi * minrad ** 2 , 1 )
        else :
            c = np.sqrt ( np.power ( px [ 1 ] - px [ 0 ] , 2 ) + np.power ( py [ 1 ] - py [ 0 ] , 2 ) )
            CBA = np.arccos ( ( ( rad [ 1 ] ** 2 ) + ( c ** 2 ) - ( rad [ 0 ] ** 2 ) ) / ( 2 * rad [ 1 ] ** 2 ) )
            CBD = 2 * CBA
            CAB = 2 *