def round_1 ( ) :
    import sys
    infile = open ( '/Users/chao/Downloads/A-large.in' , 'r' )
    outfile = open ( '/Users/chao/Desktop/A-large.txt' , 'w' )
    s = infile.readline ( )
    m = int ( s )
    a = [ 0 ] * 26
    for cases in range ( 1 , m + 1 ) :
        n = int ( infile.readline ( ) )
        cnt = n
        ss = infile.readline ( ).split ( )
        for i in ss :
            a [ i ] = int ( i )
        outfile.write ( 'Case #%d:\n' % cases )
        while cnt > 2 :
            k = find_max_index ( a , n )
            outfile.write ( ' ' + chr ( ord ( 'A' ) + k ) )
            if -- a [ k ] == 0 :
                cnt -= 1
        while cnt > 0 :
            k = find_max_index ( a , n )
            outfile.write ( ' ' + chr ( ord ( 'A' ) + k ) )
            if -- a [ k ] == 0 :
                cnt -= 1
            k = find_max_index ( a , n )
            outfile.write ( chr ( ord ( 'A' ) + k ) )
            if -- a [ k ] == 0 :
                cnt -= 1
        outfile.write ( '\n' )
    infile.close ( )
    outfile.flush ( )
    outfile.close ( )
