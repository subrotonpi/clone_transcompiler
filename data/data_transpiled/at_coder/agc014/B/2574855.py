def Main ( ) :
    n , m = ni ( )
    count = [ ]
    for i in range ( n ) :
        count [ ni ( ) - 1 ] += 1
        count [ ni ( ) - 1 ] += 1
    for v in count :
        if v % 2 == 1 :
            print ( "NO" )
            return
    def ni ( ) :
        return int ( next ( ) )
    def tr ( * o ) :
        if sys.stdin is not None :
            print ( _sys.stdout.read ( ) )
    def f ( ) :
        start = time.time ( )
        debug = sys.argv [ 1 ] if len ( sys.argv ) > 1 else None
        if debug is not None :
            with open ( _sys.argv [ 1 ] , 'r' ) as f :
                reader = _sys.stdin.readlines ( )
            _sys.stdout.write ( ''.join ( map ( str , reader ) ) + '\n' )
            solve ( )
            out.flush ( )
            tr ( ( time.time ( ) - start ) + 'ms' )
    def f ( ) :
        return _sys.stdout.read ( )
    def ntable ( n , m ) :
        for i in range ( m ) :
            a = [ nl ( ) for _ in range ( n ) ]
            return a
    def ns ( ) :
        return next ( ns )
    def na ( n ) :
        a = [ ni ( ) for _ in range ( n ) ]
        return a
    def ns ( ) :
        return next ( ns )
    def na ( n ) :
        a = [ nl ( ) for _ in range ( n ) ]
        return a
    def na ( n ) :
        a = [ nl ( ) for _ in range ( n ) ]
        return a
    def na ( n ) :
        a = [ nl ( ) for _ in range ( n ) ]
        return a
    def na ( n ) :
        a = [ nl ( ) for _ in range ( n ) ]
        return a
