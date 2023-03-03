def qualA ( ) :
    import os
    import csv
    import csv
    import csv
    import csv
    import csv
    import csv
    import csv
    import csv
    import sys
    class A ( ) :
        prblm = 'A'
        fl = not True
        filein = '%s-%s.in.txt' % ( prblm , ( 'large' if fl else 'small' ) )
        fileout = '%s-%s.out.txt' % ( prblm , ( 'large' if fl else 'small' ) )
        try :
            fr = csv.reader ( filein )
            fw = csv.writer ( open ( fileout , 'w' ) )
            s = fr.next ( )
            T = int ( s )
            for i in range ( 1 , T + 1 ) :
                s = fr.next ( )
                crd = [ False ] * 16
                f = int ( s )
                for j in range ( 1 , 4 ) :
                    s = fr.next ( )
                    if j == f :
                        tok = s.split ( )
                        for k in tok :
                            crd [ int ( k ) - 1 ] = True
                s = fr.next ( )
                c = int ( s )
                nc , res = 0 , - 1
                for j in range ( 1 , 4 ) :
                    s = fr.next ( )
                    if j == c :
                        tok = s.split ( )
                        for k in tok :
                            if crd [ int ( k ) - 1 ] :
                                nc += 1
                                res = int ( tok [ k ] )
                if nc == 0 :
                    s = 'Volunteer cheated!'
                elif nc > 1 :
                    s = 'Bad magician!'
                else :
                    s = '%d' % res
                print ( nc , res , s )
                fw.write ( 'Case #%d: %s\n' % ( i , s ) )
            fr.close ( )
            fw.close ( )
        except :
            pass
