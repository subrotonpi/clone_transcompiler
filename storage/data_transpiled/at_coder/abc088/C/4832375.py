def main ( ) :
    import sys
    from numpy import array
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    reader = sys.stdin
    arr = array ( [ [ ] for i in range ( 3 ) ] )
    A = [ ]
    B = [ ]
    A.append ( 101 )
    B.append ( 101 )
    ans = 'Yes'
    for i in range ( 3 ) :
        for j in range ( 3 ) :
            arr [ i ] [ j ] = reader.read ( )
    A [ 0 ] = arr [ 0 ] [ 0 ] - arr [ 1 ] [ 0 ]
    A [ 1 ] = arr [ 1 ] [ 0 ] - arr [ 2 ] [ 0 ]
    B [ 0 ] = arr [ 0 ] [ 0 ] - arr [ 0 ] [ 1 ]
    B [ 1 ] = arr [ 0 ] [ 1 ] - arr [ 0 ] [ 2 ]
    for i in range ( 1 , 3 ) :
        for j in range ( 1 , 3 ) :
            if arr [ i - 1 ] [ j ] - A [ i - 1 ] != arr [ i ] [ j ] or arr [ i ] [ j - 1 ] - B [ j - 1 ] != arr [ i ] [ j ] :
                ans = 'No'
    assert_almost_equal ( ans , arr [ 0 ] )
    reader.close ( )
