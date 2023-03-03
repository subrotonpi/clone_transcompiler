def Main ( ) :
    n , d , k = ni ( )
    p = ntable ( d , 2 )
    for i in range ( k ) :
        s , t = ni ( )
        left , right = s
        for j in range ( d ) :
            if p [ j ] [ 0 ] > right or p [ j ] [ 1 ] < left :
                continue
            left = min ( left , p [ j ] [ 0 ] )
            right = max ( right , p [ j ] [ 1 ] )
            if left <= t <= right :
                print ( j + 1 )
                break
    def main ( ) :
        with None , sys.stdout.fileno ( ) :
            start = time.time ( )
            debug = sys.argv [ 1 ] if debug else None
            if debug :
                with _open ( _sys.argv [ 1 ] , 'r' ) as f :
                    f.write ( '%.4f' % ( sys.argv [ 1 ] ) )
        reader = _sys.stdin.reader ( '' , 32768 )
        solve ( )
        out.flush ( )
        tr ( ( time.time ( ) - start ) + 'ms' )
    def ns ( ) :
        a = [ ]
        for i in range ( n ) :
            a.append ( ni ( ) )
        return a
    def na ( n ) :
        a = [ ]
        for i in range ( n ) :
            a.append ( ni ( ) )
        return a
    def nl ( n ) :
        a = [ ]
        for i in range ( n ) :
            a.append ( nl ( ) )
        return nl ( )
    return ns
