def Main ( ) :
    n = ni ( )
    x = nl ( )
    a = nal ( n )
    min = [ [ ni ( ) for i in range ( n ) ] for j in range ( n ) ]
    def ntable ( n , m ) :
        table = [ [ ni ( ) for i in range ( n ) ] for j in range ( 1 , m ) ]
        return table
    def tr ( * x ) :
        if sys.stdin is not None : print ( _repr ( x ) )
        return
    def nlist ( n , m ) :
        table = [ [ ni ( ) for i in range ( m ) ] for j in range ( n ) ]
        return table
    def tr ( * x ) :
        if sys.stdin is not None :
            return _repr ( x )
        return _repr ( x )
    def main ( ) :
        start = time.time ( )
        debug = sys.argv [ 1 ] if sys.argv [ 1 ] else None
        if debug is not None :
            with _open ( _sys.stdin , 'r' ) as f :
                return f.read ( )
        f.seek ( 0 , 0 )
        solve ( )
        f.flush ( )
        tr ( ( time.time ( ) - start ) + 'ms' )
    def na ( n ) :
        a = [ ni ( ) for i in range ( n ) ]
        return a
    def nl ( ) :
        return int ( next ( ) )
    def nl ( ) :
        return nl ( )
    def ntable ( n , m ) :
        a = [ nl ( ) for i in range ( n ) ]
        return ntable ( n , m )
    def nlist ( n , m ) :
        table = [ [ ni ( ) for i in range ( n ) ] for j in range ( 1 , m ) ]
        return [ min ( i , n ) for i in range ( n ) ]
    def tr ( * x ) :
        return int ( next ( ) )
    def tr ( * x ) :
        return int ( next ( ) )
    return tr ( * x )
