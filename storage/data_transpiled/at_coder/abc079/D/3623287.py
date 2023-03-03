def main ( ) :
    import sys
    from random import randint
    from numpy.testing import assert_almost_equal
    from numpy.testing import assert_almost_equal
    H , W = randint ( 1 , 10 ) , randint ( 1 , 10 )
    c = [ [ randint ( 0 , H ) for _ in range ( 10 ) ] for _ in range ( 10 ) ]
    for i in range ( 10 ) :
        for j in range ( 10 ) :
            for k in range ( 10 ) :
                c [ j ] [ k ] = min ( c [ j ] [ k ] , c [ j ] [ i ] + c [ i ] [ k ] )
    ans = 0
    for i in range ( H ) :
        for j in range ( W ) :
            num = randint ( 1 , W )
            if num >= 0 :
                ans += c [ num ] [ 1 ]
    assert_almost_equal ( ans , 0 )
    assert_almost_equal ( ans , 0 )
