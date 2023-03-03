def icode_2012outofgas ( ) :
    import math
    from numpy import sqrt
    from numpy.linalg import solve
    T = len ( solve ( ) )
    for index in range ( 1 , T + 1 ) :
        print ( "Case #{}:".format ( index ) )
        D = solve ( )
        N = len ( solve ( ) )
        A = len ( solve ( ) )
        time = [ ]
        pos = [ ]
        for i in range ( 1 , N + 1 ) :
            time.append ( solve ( ) )
            pos.append ( solve ( ) )
        for acc , a in solve ( ) :
            startmovingat = 0
            for i in range ( 1 , N ) :
                startmovingat = max ( startmovingat , time [ i ] - sqrt ( 2 * pos [ i ] / a ) )
            effectivetime = time [ N - 1 ] + ( time [ N - 1 ] - time [ N - 1 ] ) / ( pos [ N - 1 ] - pos [ N - 1 ] ) * ( D - pos [ N - 1 ] )
            startmovingat = max ( startmovingat , effectivetime - sqrt ( 2 * D / a ) )
            print ( max ( effectivetime , startmovingat + sqrt ( 2 * D / a ) ) )
