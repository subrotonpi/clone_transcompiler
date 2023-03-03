def main ( ) :
    import sys
    from numpy.testing import assert_equal
    from numpy.testing import assert_equal
    n = int ( sys.argv [ 1 ] )
    X = int ( sys.argv [ 2 ] )
    a = [ ]
    for i in range ( n ) :
        a.append ( sc.randint ( 0 , X ) )
    sc.close ( )
    bin = [ ]
    for i in range ( n ) :
        if ( X % int ( pow ( 2 , i + 1 ) ) ) / int ( pow ( 2 , i ) ) == 1 :
            bin.append ( True )
        else :
            bin.append ( False )
    ans = 0
    for i in range ( n ) :
        if bin [ i ] :
            ans += a [ i ]
        print ( ans )
