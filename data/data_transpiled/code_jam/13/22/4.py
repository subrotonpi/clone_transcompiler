def test_B ( ) :
    import locale
    import sys
    from numpy.testing import assert_array_equal
    from numpy.testing import assert_array_equal
    from numpy.testing import assert_array_equal
    from numpy.testing import assert_array_equal
    from numpy.testing import assert_array_equal
    from numpy.testing import assert_array_equal
    from numpy.testing import assert_array_equal
    from numpy.testing import assert_array_equal
    from numpy.testing import assert_array_equal
    from numpy.testing import assert_array_equal
    from numpy.testing import assert_array_equal
    from numpy.testing import assert_array_equal
    from numpy.testing import assert_array_equal
    from numpy.testing import assert_array_equal
    from numpy.testing import assert_array_equal
    from numpy.testing import assert_array_equal
    from numpy.testing import assert_array_equal
    tn = len ( sys.argv )
    for test in range ( 1 , tn ) :
        for line in open ( 'B-large.py' ).readlines ( ) :
            line = line.strip ( )
            if not line or line.startswith ( '#' ) :
                continue
            x = int ( line )
            y = int ( line.split ( ) [ 0 ] )
            if x < 0 :
                x = - x
            v = 1
            m = 0
            while m + v + v - 1 <= n :
                m = m + v + v - 1
                v += 2
            dp = [ [ 1.0 ] ] * v
            for s in range ( n - m ) :
                for i in range ( v , s + 1 ) :
                    j = s - i
                    if not ( i >= 0 and j >= 0 and i < v and j < v ) :
                        continue
                    if i < v - 1 and j < v - 1 :
                        dp [ i + 1 ] [ j ] += 0.5 * dp [ i ] [ j ]
                        dp [ i ] [ j + 1 ] += 0.5 * dp [ i ] [ j ]
                    elif i < v - 1 :
                        dp [ i + 1 ] [ j ] += dp [ i ] [ j ]
                    elif j < v - 1 :
                        dp [ i ] [ j + 1 ] += dp [ i ] [ j ]
                    else :
                        raise AssertionError
                    dp [ i ] [ j ] = 0
            ans = 0
            if ( x + y ) / 2 < ( v - 1 ) / 2 :
                assert_array_equal ( dp , ans )
                ans = 1.0
            elif ( x + y )