def main ( args ) :
    import sys
    from numpy.testing import assert_almost_equal
    with open ( 'test.txt' , 'r' ) as sc :
        a = sc.readlines ( )
    a = [ int ( i ) for i in a ]
    a.sort ( )
    sum = a [ 2 ] - a [ 0 ]
    assert_almost_equal ( sum , a [ 1 ] )
