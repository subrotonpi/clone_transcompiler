def import import sys
class z ( ) :
    def __init__ ( self ) :
        self.t = sys.stdin.read ( )
    for i in range ( 1 , t + 1 ) :
        n = int ( i )
        m = int ( i )
        F = [ False ] * m
        q = [ False ] * m
        c = [ False ] * m
        Qu = [ False ] * m
        qh , qt = 0 , 0
        [ q , qt ] = [ - 1 ] * m
        for j in range ( m ) :
            s = int ( i )
            for k in range ( s ) :
                x , y = i
                if y == 1 :
                    q [ j ] = x - 1
                else :
                    F [ j ] [ x - 1 ] = True
            for k in range ( n ) :
                if F [ j ] [ k ] : c [ j ] += 1
                if c [ j ] == 0 :
                    Qu [ qt ] = j
                    qt += 1
        ok = True
        B = [ False ] * n
        while qh < qt :
            v = Qu [ qh ]
            qh += 1
            if q [ v ] < 0 :
                ok = False
                break
            if not B [ q [ v ] ] :
                for j in range ( m ) :
                    if F [ j ] [ q [ v ] ] :
                        del c [ j ]
                        if c [ j ] == 0 :
                            Qu [ qt ] = j
                            qt += 1
                B [ q [ v ] ] = True
        if not ok :
            print ( "Case #%d: IMPOSSIBLE" % i )
        else :
            print ( "Case #%d:" % i )
            for j in range ( n ) :
                if B [ j ] : print ( " 1" )
                else : print ( " 2" )
