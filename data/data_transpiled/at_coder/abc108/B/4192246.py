def main ( ) :
    import sys
    from numpy.testing import assert_almost_equal
    x = np.arange ( 4 )
    y = np.arange ( 4 )
    x [ 2 ] = y [ 0 ] - y [ 1 ] + x [ 1 ]
    y [ 2 ] = - x [ 0 ] + x [ 1 ] + y [ 1 ]
    x [ 3 ] = y [ 1 ] - y [ 2 ] + x [ 2 ]
    y [ 3 ] = - x [ 1 ] + x [ 2 ] + y [ 2 ]
    print ( x [ 2 ] , y [ 2 ] , x [ 3 ] , y [ 3 ] )
