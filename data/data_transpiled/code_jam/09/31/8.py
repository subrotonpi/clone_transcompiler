def gcj2009.round1c ( ) :
    import os
    import sys
    import os
    import sys
    import os.path
    import sys
    import pickle
    import pickle
    import pickle
    import sys
    import itertools
    class AlienLanguage ( object ) :
        path = "google/gcj2009/round1c/resources"
        infile = "A-large.in"
        outfile = "A-large.out"
        objfile = "A.obj"
        def idx ( c ) :
            if c.isdigit ( ) : return c - '0'
            else : return c - 'a' + 10
        def solve ( f ) :
            s = f.readline ( ).strip ( )
            arr = [ - 1 ] * 37
            count = 2
            arr [ idx ( s [ 0 ] ) ] = 1
            nullfree = True
            for c in s :
                if arr [ idx ( c ) ] == - 1 :
                    if nullfree :
                        arr [ idx ( c ) ] = 0
                        nullfree = False
                    else :
                        arr [ idx ( c ) ] = count
                        count += 1
            factor = 1
            res = 0
            for c in s [ : - 1 ] :
                res += arr [ idx ( c ) ] * factor
                factor *= count
            return str ( res )
    def main ( ) :
        infile = open ( "%s/%s" % ( path , infile ) , "r" )
        outfile = open ( "%s/%s" % ( path , outfile ) , "w" )
        ncases = int ( infile.readline ( ).strip ( ) )
        for i in range ( ncases ) :
            res = solve ( infile )
            print ( "Handled case: %d" % ( i + 1 ) )
            outfile.write ( "Case #%d: %s\n" % ( i + 1 , res ) )
        infile.close ( )
        outfile.close ( )
    main ( )
