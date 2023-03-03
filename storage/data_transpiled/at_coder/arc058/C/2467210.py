def main ( ) :
    n , x , y , z = ni ( )
    mod = 1000000000 + 7
    dp = [ [ 1 << x + y + z + 1 ] for i in range ( n ) ]
    def tr ( * x ) :
        if x != sys.stdin :
            print ( _eval ( x ) )
        return
    def ntable ( n , m ) :
        table = [ [ ] for _ in range ( m ) ]
        for i in range ( n ) :
            table [ i ].append ( ni ( ) )
        return table
    def tr ( * x ) :
        if x != sys.stdin :
            print ( _eval ( x ) )
        return
    def tr ( * x ) :
        return _ntable ( * x )
    def tr ( * x ) :
        if x != sys.stdin :
            print ( _eval ( x ) )
        return
    def nlist ( n , m ) :
        table = [ [ ] for _ in range ( m ) ]
        for i in range ( n ) :
            for j in range ( m ) :
                table [ i ].append ( ni ( ) )
        return table
    def tr ( * x ) :
        for i in range ( 1 , 10 ) :
            for state in range ( 0 , mask ) :
                ns = ( ( state << i ) & mask ) + 1
                if ns & ng == ng :
                    continue
                dp [ k + 1 ] [ ns ] += dp [ k ] [ state ]
                dp [ k + 1 ] [ ns ] %= mod
        for i in range ( mask ) :
            ans += mod - dp [ n ] [ i ]
            ans %= mod
        print ( ans )
    def tr ( * x ) :
        start = time.time ( )
        debug = x > sys.stdin.readline ( ) or None
        if debug :
            try :
                fd = _open ( _eval ( debug ) )
            except :
                fd = None
            fd = _open ( _eval ( debug ) , 'r' , 'w' )
            solve ( )
            fd.flush ( )
            tr ( ( time.time ( ) - start ) + 'ms' )
    return