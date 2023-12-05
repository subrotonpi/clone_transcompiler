def test_A_as ( ) :
    import locale
    import random
    class A_as ( object ) :
        def __init__ ( self ) :
            self.test_no = random.randint ( 1 , 100 )
            for test in range ( 1 , test_no + 1 ) :
                w = random.randint ( 0 , 100 )
                l = random.randint ( 0 , 100 )
                u = random.randint ( 0 , 100 )
                g = random.randint ( 0 , 100 )
                s = 0
                xl = [ ]
                yl = [ ]
                for i in range ( l ) :
                    xl.append ( random.randint ( 0 , 100 ) )
                    yl.append ( random.randint ( 0 , 100 ) )
                    if i > 0 :
                        s -= ( xl [ i ] - xl [ i - 1 ] ) * ( yl [ i ] + yl [ i - 1 ] ) / 2.0
                xu = [ ]
                yu = [ ]
                for i in range ( u ) :
                    xu.append ( random.randint ( 0 , 100 ) )
                    yu.append ( random.randint ( 0 , 100 ) )
                    if i > 0 :
                        s += ( xu [ i ] - xu [ i - 1 ] ) * ( yu [ i ] + yu [ i - 1 ] ) / 2.0
                s /= g
            print ( "Case #%d:" % test , file = sys.stderr )
    for p in range ( 1 , g ) :
        needs = s * p
        L = 0
        R = w
        for iter in range ( 100 ) :
            m = ( L + R ) / 2
            sm = 0
            for i in range ( 1 , l ) :
                xp = random.randint ( 0 , 100 )
                yp = yl [ i ]
                if i >= 0 :
                    xp = m
                    yp = yl [ i - 1 ] + ( yl [ i ] - yl [ i - 1 ] ) * ( xp - xl [ i - 1 ] ) / ( 0.0 + xl [ i ] - xl [ i - 1 ] )
                sm -= ( xp - xl [ i ] ) * ( yp + yl [ i - 1 ] ) / 2.0
                if i > 0 :
                    break
    