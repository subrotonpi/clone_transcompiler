def import import os , locale , symbols , string , count , line , types , symbols , count , numpy , random , symbols , numpy , random , seed , ** kw , ** kw ) :
    infile = open ( "C-large.in" , "r" )
    outfile = open ( "c.out" , "w" )
    T = int ( infile.readline ( ) )
    for i in range ( 1 , T + 1 ) :
        n = int ( infile.readline ( ) )
        x = [ ]
        y = [ ]
        z = [ ]
        p = [ ]
        for tz in tokenize ( infile.readline ( ) ) :
            x.append ( int ( tz [ 0 ] ) )
            y.append ( int ( tz [ 1 ] ) )
            z.append ( int ( tz [ 2 ] ) )
            p.append ( int ( tz [ 3 ] ) )
        l = r = 1e8
        while r > l + 1e-7 :
            pp = ( l + r ) / 2
            can = True
            outer :
            for j in range ( n ) :
                for k in range ( n ) :
                    d = numpy.linalg.norm ( x [ k ] - x [ j ] , ord = 'm' ) + numpy.linalg.norm ( y [ k ] - y [ j ] , ord = 'm' ) + numpy.linalg.norm ( z [ k ] - z [ j ] , ord = 'm' )
                    if d > pp * ( p [ k ] + p [ j ] ) :
                        can = False
                        break outer
            if can :
                r = pp
            else :
                l = pp
        rr = ( l + r ) / 2
        outfile.write ( "Case #%d: %.6f\n" % ( i , rr ) )
    infile.close ( )
    outfile.close ( )
