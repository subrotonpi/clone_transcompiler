def main ( ) :
    import sys
    from numpy.testing import assert_equal
    from numpy.testing import assert_equal
    with open ( '../examples/test_basic.py' , 'r' ) as sc :
        a = sc.read ( )
        b = [ abs ( a [ 0 ] - a [ 1 ] ) , abs ( a [ 1 ] - a [ 2 ] ) , abs ( a [ 2 ] - a [ 0 ] ) ]
        b = [ abs ( a [ 2 ] - a [ 0 ] ) , abs ( a [ 1 ] - a [ 1 ] ) , abs ( a [ 2 ] - a [ 1 ] ) , abs ( a [ 2 ] - a [ 0 ] ) ]
        ans = b [ 0 ] + b [ 1 ]
        assert_equal ( ans , 0 )
