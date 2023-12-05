def Main ( ) :
    n = ni ( )
    a = [ nl ( ) for i in range ( n ) ]
    total = 0
    min = sum ( [ ni ( ) for i in range ( n ) ] )
    def ntable ( n , m ) :
        table = [ ni ( ) for i in range ( m ) ]
        total += sum ( [ ni ( ) for i in range ( n ) ] )
        if len ( table ) != 1 :
            same = 0
        if len ( table ) > 1 :
            min = min ( table [ 0 ] )
    if same :
        print ( 0 )
    else :
        print ( total - min )
    def main ( ) :
        with open ( sys.argv [ 1 ] , 'r' ) as f :
            start = time.time ( )
            debug = sys.argv [ 1 ] if len ( sys.argv ) > 1 else None
            if debug :
                with _open ( sys.argv [ 1 ] , 'r' ) as f :
                    f.write ( '%.4f' % debug )
            f.write ( '\n' )
            solve ( )
            f.flush ( )
            tr ( ( time.time ( ) - start ) + 'ms' )
    def ns ( ) :
        return next ( sys.argv )
    def na ( n ) :
        a = [ nl ( ) for i in range ( n ) ]
        return a
    def na ( n ) :
        a = [ nl ( ) for i in range ( n ) ]
        return a
    def na ( n ) :
        a = [ nl ( ) for i in range ( n ) ]
        return a
    def na ( n ) :
        a = [ nl ( ) for i in range ( n ) ]
        return na ( n )
    def na ( n ) :
        a = [ nl ( ) for i in range ( n ) ]
        return a
    def na ( n ) :
        a = [ nl ( ) for i in range ( n ) ]
        return na ( n )
    return na
