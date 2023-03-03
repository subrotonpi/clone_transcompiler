def Main ( ) :
    n = ni ( )
    a = [ ni ( ) for i in range ( 1 , n + 2 ) ]
    def ntable ( n , m ) :
        table = [ [ ni ( ) for i in range ( 1 , n + 1 ) ] for j in range ( m ) ]
        return table
    def nlist ( n , m ) :
        table = [ [ ni ( ) for i in range ( 1 , n + 1 ) ] for j in range ( m ) ]
        return table
    def tr ( * o ) :
        if sys.stdin is not None :
            print ( _sys.stdout.read ( ) )
    def reader ( ) :
        start = time.time ( )
        debug = os.environ.get ( 'DEBUG' )
        if debug :
            with _sys.stdin.fileno ( ) as f :
                f.write ( _sys.stdin.read ( ) )
        f.write ( _sys.stdout.read ( ) )
        solve ( )
        f.flush ( )
        tr ( ( time.time ( ) - start ) + 'ms' )
    def ns ( ) :
        return next ( reader ).decode ( 'ascii' )
    def na ( n ) :
        a = [ nl ( ) for i in range ( n ) ]
        return a
    def ntable ( n , m ) :
        a = [ nl ( ) for i in range ( n ) ]
        return a
    def nlist ( n , m ) :
        for i in range ( 1 , m ) :
            a [ i ] = ni ( )
        return nlist ( n , m )
    def tr ( * o ) :
        if sys.stdin is not None :
            print ( _sys.stdout.read ( ) )
    def tr ( * o ) :
        return int ( next ( reader ) )
    def tr ( * o ) :
        return int ( next ( reader ) )
    def tr ( * o ) :
        return int ( next ( reader ) )
    return tr
