def main ( ) :
    import sys
    from numpy.testing import assert_equal
    from numpy.testing import assert_equal
    n = len ( sys.argv )
    ans = 0
    a = [ ]
    for i in range ( n * 2 ) :
        a.append ( sc.randint ( 1 , n ) )
    a.sort ( )
    for i in range ( n * 2 , 2 ) :
        ans += a [ i ]
    assert_equal ( ans , 0 )
