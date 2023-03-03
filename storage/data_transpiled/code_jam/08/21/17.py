def main ( ) :
    import sys
    from numpy import array
    from numpy.linalg import norm
    infile = open ( "A-large.in" , "r" )
    outfile = open ( "a.out" , "w" )
    N = int ( infile.readline ( ) )
    for i in range ( 1 , N + 1 ) :
        tz = infile.readline ( ).split ( )
        n , A , B , C , D = norm ( tz [ 0 ] ).split ( )
        x0 , y0 , M = norm ( tz [ 1 ] ).split ( )
        x , y = x0 , y0
        cs = [ [ 0 , 0 ] ] * 3
        while n :
            cs [ int ( x % 3 ) ] [ int ( y % 3 ) ] += 1
            x = ( A * x + B ) % M
            y = ( C * y + D ) % M
        r = 0
        for j in range ( 3 ) :
            for l in range ( 3 ) :
                c = cs [ j ] [ l ]
                r += c * ( c - 1 ) * ( c - 2 ) / 6
        for k1 in range ( 9 ) :
            for k2 in range ( k1 + 1 , 9 ) :
                for k3 in range ( k2 + 1 , 9 ) :
                    if ( k1 % 3 + k2 % 3 + k3 % 3 ) % 3 == 0 and ( k1 / 3 + k2 / 3 + k3 / 3 ) % 3 == 0 :
                        r += cs [ k1 % 3 ] [ k1 / 3 ] * cs [ k2 % 3 ] [ k2 / 3 ] * cs [ k3 % 3 ] [ k3 / 3 ]
        outfile.write ( "Case #%d: %d\n" % ( i , r ) )
    infile.close ( )
    outfile.close ( )
