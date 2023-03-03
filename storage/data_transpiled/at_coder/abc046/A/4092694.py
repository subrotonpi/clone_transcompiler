def main ( ) :
    import sys
    from numpy.testing import assert_array_almost_equal
    with open ( 'test.txt' , 'r' ) as sc :
        map = [ True for i in range ( 101 ) ]
        ans = 0
        for b in map :
            ans += 1 if b else 0
        print ( ans )
