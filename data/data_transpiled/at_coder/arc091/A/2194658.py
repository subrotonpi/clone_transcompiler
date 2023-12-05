def Main ( ) :
    n , m = ni ( )
    if n > m :
        tmp = n
        n = m
        m = tmp
    if n == 1 and m == 1 :
        print ( 1 )
    elif n == 1 :
        print ( max ( 0 , m - 2 ) )
    else :
        print ( long ( n - 2 ) * ( m - 2 ) )
    def main ( ) :
        with open ( sys.argv [ 1 ] , 'r' ) as f :
            start = time.time ( )
            debug = os.environ.get ( 'DEBUG' )
            if debug :
                with _open ( sys.argv [ 1 ] , 'r' ) as f :
                    f.write ( _dump ( f.read ( ) , f ) )
    reader = _BufferedReader ( sys.stdin , 32768 )
    solve ( )
    out.flush ( )
    tr ( ( time.time ( ) - start ) + 'ms' )
def main ( ) :
    with open ( sys.argv [ 1 ] , 'r' ) as f :
        with _open ( sys.argv [ 1 ] , 'w' ) as f :
            f.write ( _dump ( f.read ( ) , f ) )
    def next ( ) :
        while not reader or not reader :
            with _open ( sys.argv [ 1 ] , 'r' ) as f :
                f.write ( _dump ( f.read ( ) , f ) )
        return reader.next ( )
    def nd ( ) :
        return float ( next ( ) )
    def nl ( ) :
        return long ( next ( ) )
    def na ( n ) :
        a = [ ]
        for i in range ( n ) : a.append ( ni ( ) )
        return a
    def ns ( ) :
        return next ( ).split ( ' ' )
    def nlist ( n , m ) :
        a = [ ]
        for i in range ( m ) : a.append ( ni ( ) )
        return a
    return nlist ( n , m )
