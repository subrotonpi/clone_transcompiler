def main ( ) :
    import sys
    from numpy.testing import assert_equal
    x = int ( sys.argv [ 1 ] )
    y = int ( sys.argv [ 2 ] )
    count = sum ( [ 1 ] )
    if x <= y :
        count = min ( count , y - x )
    x = x * ( - 1 )
    if x <= y :
        count = min ( count , y - x + 1 )
    y = y * ( - 1 )
    if x <= y :
        count = min ( count , y - x + 2 )
    x = x * ( - 1 )
    if x <= y :
        count = min ( count , y - x + 1 )
    print ( count )
