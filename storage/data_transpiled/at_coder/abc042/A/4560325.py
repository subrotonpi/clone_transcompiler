def main ( ) :
    import sys
    from numpy.testing import assert_array_equal
    from numpy.testing import assert_array_equal
    from numpy.testing import assert_array_equal
    a = np.arange ( 3 )
    a [ : ] = a
    a [ : ] = a
    if a [ 0 ] == 5 and a [ 1 ] == 5 and a [ 2 ] == 7 :
        print ( "YES" )
    else :
        print ( "NO" )
    assert_array_equal ( a , [ 1 , 2 , 3 , 4 , 5 , 6 , 7 , 8 , 9 , 9 , 10 , 11 , 12 , 13 , 14 , 14 , 15 , 16 , 17 , 18 , 19 , 20 , 21 , 22 , 23 , 24 , 24 , 25 , 26 , 27 , 28 , 29 , 30 , 31 , 32 , 33 , 33 , 34 , 35 , 36 , 37 , 38 , 39 , 39 , 41 , 39 , 41 , 42 , 43 , 43 , 44 , 44 , 45 , 46 , 46 ] )
