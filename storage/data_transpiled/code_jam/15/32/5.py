def c_2015 ( ) :
    import os
    from numpy.linalg import solve
    from numpy.random import seed
    seed ( )
    kases = solve ( seed )
    for kas in range ( 1 , kases + 1 ) :
        K , L , S , keyboard , target = solve ( kas )
        keys = [ 0 ] * 26
        for i in range ( K ) :
            keys [ keyboard [ i ] - 'A' ] += 1
        possible = True
        for i in range ( L ) :
            if keys [ target [ i ] - 'A' ] == 0 : possible = False
        if not possible :
            print ( "Case #{}: 0.0".format ( kas ) )
            continue
        EV = [ 0 ] * S
        for p in range ( L - 1 , 0 , - 1 ) :
            for i in range ( p ) :
                if target [ i ] != target [ L - p + i ] :
                    continue
                break
        max = ( S - p ) / ( L - p )
        prob_word = 1
        for i in range ( L ) :
            prob_word *= keys [ target [ i ] - 'A' ] / ( 0.0 + K )
        print ( "Case #{}: {}".format ( kas , max - prob_word * ( S - L + 1 ) ) )
