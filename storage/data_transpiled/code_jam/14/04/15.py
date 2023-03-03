def qualD ( ) :
    import os
    import csv
    import csv
    import csv
    import csv
    import csv
    import csv
    import sys
    class D :
        def __init__ ( self ) :
            self.tol = 1e-6
    prblm = 'D'
    fl = True
    filein = '%s-%s.in.txt' % ( prblm , ( 'large' if fl else 'small' ) )
    fileout = '%s-%s.out.txt' % ( prblm , ( 'large' if fl else 'small' ) )
    with open ( filein , 'r' ) as fr :
        with open ( fileout , 'w' ) as fw :
            s = fr.readline ( )
            T = int ( s )
            for i in range ( 1 , T + 1 ) :
                s = fr.readline ( )
                N = int ( s )
                nw = [ ]
                kw = [ ]
                s = fr.readline ( )
                tok = s.split ( )
                for j in tok :
                    nw.append ( float ( j ) )
                s = fr.readline ( )
                tok = s.split ( )
                for j in tok :
                    kw.append ( float ( j ) )
                nw.sort ( )
                kw.sort ( )
                ws , pk = 0 , 0
                for j in range ( N - 1 , - 1 , - 1 ) :
                    if nw [ j ] > kw [ j + pk ] :
                        ws += 1
                        pk += 1
                dws , pk = 0 , 0
                for j in range ( N - 1 , - 1 , - 1 ) :
                    if nw [ j + pk ] > kw [ j ] :
                        dws += 1
                    else :
                        pk += 1
                    print ( dws , ws )
                    fw.write ( 'Case #%d: %d %d\n' % ( i , dws , ws ) )
