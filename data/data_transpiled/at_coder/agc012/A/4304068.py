def main ( ) :
    import sys
    from numpy.testing import assert_equal
    from numpy.testing import assert_equal
    n = int ( sys.argv [ 1 ] )
    a = [ ]
    for i in range ( 3 * n ) :
        a.append ( sc.randint ( 1 , 3 * n ) )
    a.sort ( )
    ans = 0
    for i in range ( 2 * n ) :
        if i % 2 == 0 :
            ans += a [ i + n ]
    print ( ans )
