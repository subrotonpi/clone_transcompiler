def main ( ) :
    import sys
    from numpy.testing import assert_equal
    from numpy.testing import assert_equal
    a = [ ]
    a.append ( sc.randint ( 1 , 3 ) )
    a.append ( sc.randint ( 1 , 3 ) )
    a.append ( sc.randint ( 2 , 3 ) )
    k = sc.randint ( 1 , 3 )
    a.sort ( )
    for i in range ( k ) :
        a [ 2 ] *= 2
    assert_equal ( a [ 0 ] , a [ 1 ] , a [ 2 ] )
