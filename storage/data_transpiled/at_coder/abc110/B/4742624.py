def main ( ) :
    import sys
    from random import randint
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    n , m , X , Y = map ( int , sys.stdin.read ( ).split ( ) )
    x = [ randint ( 0 , n ) for i in range ( n ) ]
    y = [ randint ( 0 , m ) for i in range ( m ) ]
    assert_almost_equal ( x , y )
    x = [ x [ i ] for i in range ( n ) ]
    y = [ y [ i ] for i in range ( m ) ]
    x.sort ( )
    y.sort ( )
    ans = False
    if x [ n - 1 ] > y [ 0 ] :
        ans = True
    else :
        for i in range ( X + 1 , Y + 1 ) :
            if x [ n - 1 ] < i <= y [ 0 ] :
                ans = True
                break
        ans = not ans
    assert_almost_equal ( ans , 0 )
