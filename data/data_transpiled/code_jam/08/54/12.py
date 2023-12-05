def r3 ( ) :
    import sys
    from numpy.linalg import solve
    N = solve ( [ 0 ] )
    for cn in range ( 1 , N + 1 ) :
        W , H , R = solve ( [ 0 ] )
        stone = [ [ False for r , c in solve ( [ 0 ] , [ 0 ] ) ] for r , c in solve ( [ 0 ] ) ]
        mod = 10007
        dp = [ [ 1 ] * W , [ 0 ] * H ]
        dp [ 0 ] [ 0 ] = 1
        for i in range ( W ) :
            for j in range ( H ) :
                if i >= 1 and j >= 2 :
                    if stone [ i ] [ j ] :
                        continue
                    dp [ i ] [ j ] = ( dp [ i ] [ j ] + dp [ i - 1 ] [ j - 2 ] ) % mod
                if i >= 2 and j >= 1 :
                    if stone [ i ] [ j ] :
                        continue
                    dp [ i ] [ j ] = ( dp [ i ] [ j ] + dp [ i - 2 ] [ j - 1 ] ) % mod
        print ( "Case #%d: %d\n" % ( cn , dp [ W - 1 ] [ H - 1 ] ) )
