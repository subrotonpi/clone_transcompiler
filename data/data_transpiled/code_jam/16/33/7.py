def round_1 ( ) :
    import os
    infile = open ( '/Users/chao/Downloads/C-large.in' , 'r' )
    outfile = open ( '/Users/chao/Desktop/C-large.txt' , 'w' )
    s = infile.readline ( )
    m = int ( s )
    a = [ ]
    for cases in range ( 1 , m + 1 ) :
        ss = infile.readline ( ).split ( )
        for i in range ( 3 ) :
            a.append ( int ( ss [ i ] ) )
        k = int ( ss [ 3 ] )
        k = min ( k , a [ 2 ] )
        ans = a [ 0 ] * a [ 1 ] * k
        outfile.write ( 'Case #%d: %d\n' % ( cases , ans ) )
        for i in range ( 1 , a [ 0 ] + 1 ) :
            for j in range ( 1 , a [ 1 ] + 1 ) :
                for x in range ( k ) :
                    val = ( i + j + x - 2 ) % a [ 2 ] + 1
                    outfile.write ( '%d %d %d\n' % ( i , j , val ) )
    infile.close ( )
    outfile.flush ( )
    outfile.close ( )
