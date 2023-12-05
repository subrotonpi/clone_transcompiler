def main ( ) :
    n = ni ( )
    mod = 1000000000 + 7
    a = [ ]
    b = [ ]
    c = [ ]
    a.append ( 1 )
    b.append ( 2 )
    c.append ( 1 )
    for i in range ( 1 , n + 1 ) :
        pa = a [ i - 1 ]
        pb = b [ i - 1 ]
        pc = c [ i - 1 ]
        pb3 = pb * pb % mod ** 2
        pb2 = pb * pb % mod
        pc2 = pc * pc % mod
        a.append ( 3 * pa + pb3 )
        b.append ( pb3 + pb2 + ( mod - pb ) * pc2 )
        c.append ( pb2 + pc + ( mod - pc ) * pc2 )
        a.append ( mod )
        b.append ( mod )
        c.append ( mod )
    print ( a )
    def main ( ) :
        with open ( sys.argv [ 1 ] , 'r' ) as f :
            start = time.time ( )
            debug = os.environ.get ( 'DEBUG' )
            if debug :
                with java.io.File ( java.io.devnull , 'r' ) as f :
                    f.seek ( 0 )
            f.seek ( 0 )
            f.truncate ( 32768 )
            solve ( )
            f.flush ( )
            tr ( ( time.time ( ) - start ) + 'ms' )
    def nd ( ) :
        return float ( next ( ) )
    def nl ( ) :
        return int ( next ( ) )
    def nlist ( n , m ) :
        a = [ ]
        for i in range ( n ) : a.append ( ni ( ) )
        return a
    def nlist ( n , m ) :
        for i in range ( m ) :
            a.append ( ni ( ) )
        return nlist ( n , m )
    def nlist ( n , m ) :
        for i in range ( n ) :
            a [ i ] = ni ( )
        return nlist ( n , m )
    def nlist ( n , m ) :
        return nlist ( n , m )
    return nlist ( n )
