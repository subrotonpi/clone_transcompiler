def main ( ) :
    import sys
    from numpy.testing import assert_almost_equal
    try :
        x1 = int ( sys.argv [ 1 ] )
        y1 = int ( sys.argv [ 1 ] )
        x2 = int ( sys.argv [ 2 ] )
        y2 = int ( sys.argv [ 3 ] )
        x3 = None
        y3 = None
        x4 = None
        y4 = None
        if x1 >= x2 :
            y3 = y2 - abs ( x1 - x2 )
            y4 = y1 - abs ( x1 - x2 )
        else :
            y3 = y2 + abs ( x1 - x2 )
            y4 = y1 + abs ( x1 - x2 )
        if y1 >= y2 :
            x3 = x2 + abs ( y1 - y2 )
            x4 = x1 + abs ( y1 - y2 )
        else :
            x3 = x2 - abs ( y1 - y2 )
            x4 = x1 - abs ( y1 - y2 )
        assert_almost_equal ( x3 , y3 , x4 , y4 )
    except ValueError :
        print ( "%s %s %s %s" % ( sys.argv [ 0 ] , sys.argv [ 1 ] , sys.argv [ 2 ] , sys.argv [ 3 ] ) )
