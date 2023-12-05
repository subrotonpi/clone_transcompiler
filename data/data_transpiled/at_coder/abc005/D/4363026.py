def _ _ main _ _ ( ) :
    import sys
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            N = sc.randint ( 1 , N + 1 )
            D = [ [ ] for i in range ( 1 , N + 1 ) ]
            self.tmp_max = max ( self.yummy )
        self.max_yummy = max ( self.tmp_max )
    out = [ ]
    for i in range ( 1 , N + 1 ) :
        for j in range ( 1 , N + 1 ) :
            D [ i ] [ j ] = sc.randint ( 1 , N + 1 )
    Q = sc.randint ( 1 , N + 1 )
    P = [ ]
    for i in range ( Q ) :
        P.append ( sc.randint ( 1 , N + 1 ) )
    DAccum = [ ]
    for i in range ( 1 , N + 1 ) :
        DAccum [ i ] [ 1 ] = D [ i ] [ 1 ]
        for j in range ( 2 , N + 1 ) :
            DAccum [ i ] [ j ] = DAccum [ i ] [ j - 1 ] + D [ i ] [ j ]
    for i in range ( 2 , N + 1 ) :
        for j in range ( 1 , N + 1 ) :
            DAccum [ i ] [ j ] += DAccum [ i - 1 ] [ j ]
    max_yummy = [ ]
    for row in max_yummy :
        [ row ] = - 1
    for p in P :
        max = 0
        for i in range ( 1 , p ) :
            x = p // i
            y = p // x
            tmp_max = 0
            x = random.randint ( 0 , N )
            y = random.randint ( 0 , N )
            if max_yummy [ x ] [ y ] != - 1 :
                tmp_max = max_yummy [ x ] [ y ]
            else :
                for x1 in range ( 1 , x - 1 ) :
                    for y1 in range ( 1 , y - 1 ) :
                        tmp_max = max ( y1 )
            out.append ( tmp_max )
    