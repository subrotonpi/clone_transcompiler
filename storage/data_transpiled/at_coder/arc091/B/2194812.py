def Main ( ) :
    n = ni ( )
    k = ni ( )
    x = 0
    for b in range ( 1 , k + 1 ) :
        x += n
    for b in range ( k + 1 , n + 1 ) :
        y = n // b
        z = min ( n - y * b + 1 , k )
        x += z
        if y >= 1 and k >= 1 :
            x += y * k
            x -= 1
    ret = long ( n * n - x )
    print ( ret )
    def main ( ) :
        with open ( sys.argv [ 1 ] , 'r' ) as f :
            start = time.time ( )
            debug = os.environ.get ( 'DEBUG' )
            if debug :
                with _open ( sys.argv [ 1 ] , 'r' ) as f :
                    f.write ( _dump ( f ) )
        f.seek ( 0 , 0 )
        solve ( )
        f.flush ( )
        tr ( ( time.time ( ) - start ) + 'ms' )
    def read ( ) :
        with open ( sys.argv [ 1 ] , 'r' ) as f :
            for line in f :
                a = [ nl ( ) for i in line.split ( ) ]
        return a
    def nd ( ) :
        return float ( next ( ) )
    def nl ( ) :
        return long ( next ( ) )
    def na ( n ) :
        a = [ ]
        for i in range ( n ) : a.append ( ni ( ) )
        return a
    def na ( n ) :
        a = [ ]
        for i in range ( n ) : a.append ( ni ( ) )
        return a
    def na ( n ) :
        a = [ ]
        for i in range ( n ) : a.append ( ni ( ) )
        return a
    def na ( n ) :
        a = [ ]
        for i in range ( n ) : a.append ( ni ( ) )
        return a
    return na
