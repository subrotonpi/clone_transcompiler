def test_solve ( ) :
    import sys
    from sympy.polys.polyutils import solve
    solve ( )
    a , b = symbols ( 'a b' )
    fa = 0
    fb = 0
    for i in range ( 50 ) :
        x = int ( pow ( 2 , i ) )
        count = ( a - 1 ) / ( 2 * x )
        count = count * x
        count += int ( max ( 0 , ( a - 1 ) - ( a - 1 ) / ( 2 * x ) ** 2 - ( x - 1 ) ) )
        if count % 2 == 1 :
            fa += x
    for i in range ( 50 ) :
        x = int ( pow ( 2 , i ) )
        count = b / ( 2 * x )
        count = count * x
        count += int ( max ( 0 , b - b / ( 2 * x ) ** 2 - ( x - 1 ) ) )
        if count % 2 == 1 :
            fb += x
    print ( fa ^ fb )
