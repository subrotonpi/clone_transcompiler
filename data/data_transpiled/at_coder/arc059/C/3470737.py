def main ( ) :
    n = ni ( )
    c = ni ( )
    a = na ( n )
    b = na ( n )
    mod = 1000000000 + 7
    table = [ [ ni ( ) for i in range ( n ) ] for i in range ( c ) ]
    def tr ( * x ) :
        if x != sys.stdin :
            print ( _repr ( x ) )
    def ntable ( n , m ) :
        table = [ [ ni ( ) for i in range ( n ) ] for j in range ( m ) ]
        return table
    def tr ( * x ) :
        if x != sys.stdin :
            print ( _repr ( x ) )
    def tr ( * x ) :
        if x != sys.stdin :
            print ( _repr ( x ) )
    dp = [ [ 1 ] * c + [ 0 ] for i in range ( n ) ]
    dp [ 0 ] [ 0 ] = 1
    for i in range ( n ) :
        for j in range ( 0 , c ) :
            for k in range ( 0 , c ) :
                dp [ i + 1 ] [ j + k ] += dp [ i ] [ j ] * table [ i ] [ k ]
                dp [ i + 1 ] [ j + k ] %= mod
    print ( dp [ n ] [ c ] )
    def main ( ) :
        with threading.Thread ( None , func = main ) as daemon :
            start = time.time ( )
            debug = sys.argv [ 1 ] if debug is not None else None
            if debug is not None :
                with _open ( _sys.argv [ 1 ] , 'r' ) as f :
                    exec ( f.read ( ) )
        return daemon.run ( )
    def tr ( * x ) :
        while x == sys.stdin or not x :
            try :
                import readline
            except :
                import sys
                sys.stdout = sys.stderr
        return x
    return tr ( * x )
