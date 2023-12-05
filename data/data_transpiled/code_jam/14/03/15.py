def qualC ( ) :
    import sys
    import os
    import os
    import sys
    import os
    import os
    import sys
    class C :
        def __init__ ( self ) :
            self.prblm = 'C'
            self.fl = True
            filein = "%s-%s.in.txt" % ( self.prblm , ( self.fl ) )
            fileout = "%s-%s.out.txt" % ( self.prblm , ( self.fl ) )
    if not mt [ 0 ] :
        s = "Impossible\n"
    else :
        mt [ 0 ] [ 0 ] = 'c'
        s = ""
        for j in range ( R ) :
            for k in range ( C ) :
                s += mt [ j ] [ k ]
    sys.stdout.write ( s )
    fr.close ( )
    fw = open ( fileout , 'w' )
    s = fr.read ( )
    T = int ( s )
    for i in range ( 1 , T + 1 ) :
        s = fr.read ( )
        tok = s.split ( )
        R = int ( tok [ 0 ] )
        C = int ( tok [ 1 ] )
        M = int ( tok [ 2 ] )
        MR = R * C - M
        mt = [ [ '*' ] * ( C - M ) for j in range ( R ) ]
        b = ( R >= C )
        if MR > 1 :
            if min ( R , C ) == 1 :
                for j in range ( 1 , R * C - M ) :
                    if b : mt [ j ] [ 0 ] = '.'
                    else : mt [ j ] [ 0 ] = '.'
            elif ( min ( R , C ) == 2 and MR % 2 != 0 ) or MR < 4 or MR == 5 or MR == 7 :
                mt [ 0 ] [ 0 ] = 0
            else :
                if MR >= min ( R , C ) * 2 + 2 :
                    nn = MR // min ( R , C )
                    nr = MR % min ( R , C )
                    for j in range ( ( ( b ) , M ) ) :
                        mt [ j ] [ 0 ] = '.'
                