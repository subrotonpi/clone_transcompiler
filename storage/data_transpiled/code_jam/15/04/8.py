def test_omino ( ) :
    import sys
    from sympy.utilities.misc import get_filesystem_encoding
    from sympy.matrices.expressions import T
    f = get_filesystem_encoding ( )
    f.write ( "\n" )
    T = int ( f.readline ( ) )
    for t in range ( 1 , T + 1 ) :
        line = f.readline ( ).split ( )
        x = int ( line [ 0 ] )
        r = int ( line [ 1 ] )
        c = int ( line [ 2 ] )
        if r > c :
            tmp = r
            r , c = c , tmp
        bad = r * c % x != 0
        if not bad :
            if x == 3 :
                if r == 1 :
                    bad = True
            elif x == 4 :
                if r <= 2 :
                    bad = True
            elif x == 5 :
                if r <= 2 or r == 3 and c == 5 :
                    bad = True
            elif x == 6 :
                if r <= 3 :
                    bad = True
            elif x >= 7 :
                bad = True
        print ( "Case #%d: %s" % ( t , "RICHARD" if bad else "GABRIEL" ) , end = ' ' )
    f.write ( "\n" )
