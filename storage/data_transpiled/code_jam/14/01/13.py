def _import ( ) :
    import os
    import sys
    import csv
    import csv
    import csv
    import csv
    class A :
        SAMPLE = False
        PROBLEM = 'A'
        INPUT = 'small'
        ID = '0'
        PATH = r' F : \ software SPACETOKEN installation \ codejam - commandline - 1.2 - beta1 \ source\ \'
        def __init__ ( self , * args ) :
            with open ( os.path.join ( PATH , PROBLEM , INPUT , ID ) , 'r' ) as infile :
                outfile = sys.stdout if SAMPLE else open ( os.path.join ( PATH , PROBLEM , INPUT , ID ) , 'w' )
                test = csv.reader ( infile )
                for t in range ( 1 , test + 1 ) :
                    outfile.write ( 'Case #%d: ' % t )
                    r1 = csv.reader ( infile )
                    rows1 = read_rows ( outfile )
                    r2 = csv.reader ( infile )
                    rows2 = read_rows ( outfile )
                    results = merge ( rows1 [ r1 - 1 ] , rows2 [ r2 - 1 ] )
                    if len ( results ) == 1 :
                        outfile.write ( results [ 0 ] )
                    elif len ( results ) > 1 :
                        outfile.write ( 'Bad magician!\n' )
                    else :
                        outfile.write ( 'Volunteer cheated!\n' )
                outfile.close ( )
                infile.close ( )
                print ( 'finish!' )
    def read_rows ( outfile ) :
        rows = [ ]
        for elem1 in a :
            found = False
            for elem2 in b :
                if elem1 == elem2 :
                    found = True
            if found :
                merged.append ( elem1 )
        return rows
    def merge ( a , b ) :
        for elem1 in a :
            merged = [ ]
            for elem2 in b :
                if elem1 == elem2 :
                    found = True
            if found :
                merged.append ( elem1 )
    return merge ( a , b )
