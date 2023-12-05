def main ( arg ) :
    import sys
    class C ( object ) :
        def __init__ ( self , * args ) :
            sc = sys.stdin
            TT = sc.randint ( 1 , len ( args ) )
            for ii in range ( 1 , TT + 1 ) :
                R = sc.randint ( 1 , len ( args ) )
                C = sc.randint ( 1 , len ( args ) )
    if impossible :
        print ( "Case #%d: IMPOSSIBLE\n" % ii )
        continue
    CNT = [ ]
    for j in range ( 0 , R ) :
        if j != C :
            print ( "Case #%d: IMPOSSIBLE\n" % ( j ) )
            continue
        for i in range ( 0 , R ) :
            if i == 0 or i == 0 :
                if Grid [ i ] [ j2 ] == '-' :
                    continue
        for i in range ( 0 , C ) :
            if i == 0 or i == 0 :
                if Grid [ i ] [ j2 ] == '-' :
                    continue
        for j in range ( 0 , C ) :
            if i == 0 or i == 0 :
                if Grid [ i ] [ j2 ] == '-' :
                    continue
                if i == 0 or i == 0 :
                    if Grid [ i ] [ j2 ] == '-' :
                        continue
            if not i == 0 :
                continue
    if impossible :
        print ( "Case #%d: POSSIBLE\n" % ( ii ) )
        continue
    print ( "Case #%d: IMPOSSIBLE\n" % ( ii ) )
    for i in range ( 0 , R ) :
        print ( "Case #%d: IMPOSSIBLE\n" % ( ii ) )
    for i in range ( 0 , C ) :
        if i == 0 or i == 0 :
            print ( "Case #%d: IMPOSSIBLE\n" % ( ii ) )
