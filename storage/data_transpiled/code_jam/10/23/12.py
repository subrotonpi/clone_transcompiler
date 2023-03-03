def test_C ( ) :
    import sympy
    from sympy.utilities.lambdify import NUMPY_CASES
    from sympy.utilities.misc import ARCH
    combine = NUMPY_CASES [ : ]
    a = [ ]
    s = [ ]
    for i in range ( 512 ) :
        combine.append ( [ 1 , 1 ] )
        for j in range ( 1 , i ) :
            combine [ i ] [ j ] = combine [ i - 1 ] [ j ] + combine [ i - 1 ] [ j - 1 ]
        for j in range ( 512 ) :
            a [ i ] [ j ] = 0
        s.append ( 0 )
    for n in range ( 2 , 512 ) :
        a [ n ] [ 1 ] = 1
        for m in range ( 2 , n ) :
            a [ n ] [ m ] = 0
            for k in range ( 1 , m ) :
                N = n - m - 1
                M = m - k - 1
                if M >= 0 and M <= N :
                    a [ n ] [ m ] = a [ n ] [ m ] + combine [ N ] [ M ] * a [ m ] [ k ]
        for m in range ( 1 , n ) :
            s.append ( s [ n ] + a [ n ] [ m ] )
    with open ( 'test.txt' , 'r' ) as f :
        tests = NUMPY_CASES [ test ]
        for cas in range ( 1 , tests + 1 ) :
            n = NUMPY_CASES [ test ]
            print ( "Case #%d: %s" % ( cas , s [ n ] % sympy.approx ( 100003 , abs = cas ) ) )
