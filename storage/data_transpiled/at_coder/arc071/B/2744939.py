def test_solve ( ) :
    import sys
    from sympy.utilities.iterables import solve
    solve ( )
    from sympy.utilities.iterables import iterables
    with open ( 'test.txt' , 'r' ) as f :
        n , m = map ( int , f.read ( ).split ( ) )
        x = [ ]
        y = [ ]
        etc = int ( math.pow ( 10 , 9 ) ) + 7
        for i in range ( n ) :
            x.append ( i )
        for i in range ( m ) :
            y.append ( i )
        x.sort ( )
        y.sort ( )
        xcount = ycount = 0
        ans = 0
        for i in range ( n ) :
            xcount += long ( i ) * long ( x [ i ] ) - ( long ( n ) - long ( i - 1 ) ) * long ( x [ i ] )
        for i in range ( m ) :
            ycount += long ( i ) * long ( y [ i ] ) - ( long ( m ) - long ( i - 1 ) ) * long ( y [ i ] )
        xcount = xcount % etc
        ycount = ycount % etc
        ans = xcount * ycount % etc
        print ( ans % etc )
