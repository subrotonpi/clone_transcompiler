def main ( ) :
    import sys
    from numpy import zeros
    from numpy.testing import assert_almost_equal
    with open ( 'test.txt' , 'r' ) as sc :
        A = sc.read ( )
        B = sc.read ( )
        print ( '100 100' )
        ans = zeros ( ( 100 , 100 ) )
        for i in range ( 100 ) :
            for j in range ( 100 ) :
                if i < 50 :
                    ans [ i , j ] = True
                else :
                    ans [ i , j ] = False
        for i in range ( B - 1 ) :
            ans [ 2 * ( i / 50 ) ] [ 2 * ( i % 50 ) ] = False
        for i in range ( A - 1 ) :
            ans [ 2 * ( i / 50 ) + 51 ] [ 2 * ( i % 50 ) ] = True
        for i in range ( 100 ) :
            for j in range ( 100 ) :
                if ans [ i , j ] :
                    print ( '.' , end = '' )
                else :
                    print ( '#' , end = '' )
            print ( )
    assert_almost_equal ( ans [ 0 ] , 0 )
