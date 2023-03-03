def main ( ) :
    a = nl ( )
    b = nl ( )
    print ( ( b - a + 1 ) - ( f ( b ) - f ( a - 1 ) ) )
    def f ( x ) :
        s = ( x + '' ).split ( )
        n = len ( s )
        dp = [ [ 1 ] * n for i in range ( n + 1 ) ]
        for i in range ( 1 , n + 1 ) :
            d = s [ i - 1 ] - '0'
            if d > 4 :
                f = d - 1
            else :
                f = d
            dp [ i ] [ 0 ] += dp [ i - 1 ] [ 1 ] * f
            dp [ i ] [ 0 ] += dp [ i - 1 ] [ 0 ] * 8
            dp [ i ] [ 1 ] = ( 0 if d == 4 or d == 9 else dp [ i - 1 ] [ 1 ] )
        return dp [ n ] + dp [ n ]
    def main ( ) :
        with threading.Thread ( None , target = main ) as t :
            start = time.time ( )
            debug = sys.argv [ 1 ] if debug else None
            if debug :
                with _open ( _sys.argv [ 1 ] , 'r' ) as f :
                    fd = _sys.stdin.fileno ( )
            f.seek ( 0 )
            solve ( )
            f.flush ( )
            tr ( ( time.time ( ) - start ) + 'ms' )
    return t.start ( )
