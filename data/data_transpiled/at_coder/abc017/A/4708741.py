def main ( ) :
    import sys
    from numpy.testing import assert_almost_equal
    with open ( '../data/data/' , 'r' ) as sc :
        s1 = sc.read ( )
        e1 = sc.read ( )
        s2 = sc.read ( )
        e2 = sc.read ( )
        s3 = sc.read ( )
        e3 = sc.read ( )
        sum = 0
        sum = s1 * 0.1 * e1 + s2 * 0.1 * e2 + s3 * 0.1 * e3
        ans = int ( sum )
        assert_almost_equal ( ans , sum )
