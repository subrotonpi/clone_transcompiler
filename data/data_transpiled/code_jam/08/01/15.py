def prob_a ( ) :
    from itertools import chain
    f = open ( 'probA.txt' )
    cases = sum ( 1 for i in range ( cases ) )
    for i in range ( cases ) :
        ans = switches ( f )
        print ( 'Case #%d: %d' % ( i + 1 , ans ) )
    def switches ( f ) :
        num_e = sum ( 1 for i in range ( num_e ) )
        engines = [ f.readline ( ) for f in f.readline ( ).split ( ',' ) ]
        num_q = sum ( 1 for i in range ( num_e ) )
        queries = [ f.readline ( ) for f in f.readline ( ).split ( ',' ) ]
        a = [ [ ( queries [ i ] , queries [ i ] ) for i in range ( num_q ) ] for q in range ( num_e ) ]
        if not num_q :
            return 0
        for i in range ( num_e ) :
            a [ 0 ].append ( ( queries [ i ] , ) )
        s = '0: '
        for i in range ( num_e ) :
            s += a [ 0 ] [ i ] + ' '
        for q in range ( 1 , num_q ) :
            for e in range ( num_e ) :
                n = num_q
                if queries [ e ] == queries [ q ] :
                    a [ q ] [ e ] = num_q
                else :
                    for f in range ( num_e ) :
                        m = ( ( f , e ) if a [ q - 1 ] [ f ] == a [ q - 1 ] [ f ] else ( a [ q - 1 ] [ f ] + 1 ) )
                        if m < n :
                            n = m
                    a [ q ] [ e ] = n
        s = '%d: ' % q
        for i in range ( num_e ) :
            s += a [ i ] [ i ] + ' '
        return min
    return switches ( switches ( ) )
