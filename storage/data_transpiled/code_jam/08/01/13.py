def saving_the_universe ( ) :
    import sys
    from numpy.linalg import solve
    from numpy.random import seed
    n = int ( sys.stdin.readline ( ) )
    for i in range ( n ) :
        n_engines = int ( sys.stdin.readline ( ) )
        names = [ s.strip ( ) for s in sys.stdin.readline ( ).split ( ',' ) ]
        names = [ s.strip ( ) for s in names ]
        n_queries = int ( sys.stdin.readline ( ) )
        qdata = [ [ s.strip ( ) for s in names ] for s in range ( n_queries ) ]
        best = [ [ 0 for s in names ] for q in range ( 2 , n_engines - 1 , - 1 ) ]
        for q in range ( n_queries , - 1 , - 1 ) :
            for e in range ( n_engines ) :
                if q == n_queries :
                    best [ q % 2 ] [ e ] = 0
                elif e != qdata [ q ] :
                    best [ q % 2 ] [ e ] = best [ ( q + 1 ) % 2 ] [ e ]
                else :
                    best [ q % 2 ] [ e ] = 123456789
                    for ee in range ( n_engines ) :
                        if ee != e :
                            best [ q % 2 ] [ e ] = min ( best [ q % 2 ] [ e ] , 1 + best [ ( q + 1 ) % 2 ] [ ee ] )
        res = 123456789
        for e in range ( n_engines ) :
            res = min ( res , best [ 0 ] [ e ] )
        print ( "Case #%d: %d" % ( i + 1 , res ) )
