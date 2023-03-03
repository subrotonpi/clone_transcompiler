def round_1 ( ) :
    import math
    infile = open ( '/Users/chao/Downloads/B-large.in' , 'r' )
    outfile = open ( '/Users/chao/Desktop/B-large.txt' , 'w' )
    s = infile.readline ( )
    m = int ( s )
    for cases in range ( 1 , m + 1 ) :
        ss = infile.readline ( ).split ( )
        B = int ( ss [ 0 ] )
        M = int ( ss [ 1 ] )
        outfile.write ( 'Case #%d: ' % cases )
        n = B
        max = pow ( B - 2 , M )
        if max >= M :
            outfile.write ( 'POSSIBLE\n' )
            map = [ [ 1 for i in range ( n ) ] for j in range ( i + 1 , n ) ]
            for k in range ( 1 , n ) :
                if k != n - 1 :
                    max = max // 2
                if max <= M :
                    M -= max
                    map [ 0 ] [ k ] = 1
            for i in range ( n ) :
                for j in range ( n ) :
                    outfile.write ( '%d' % map [ i ] [ j ] )
                outfile.write ( '\n' )
        else :
            outfile.write ( 'IMPOSSIBLE\n' )
    infile.close ( )
    outfile.flush ( )
    outfile.close ( )
