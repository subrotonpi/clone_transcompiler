def Main ( ) :
    n , m = ni ( )
    cnt = [ ]
    for i in range ( n + 1 ) :
        a , b = ni ( )
        cnt.append ( a )
        cnt.append ( b )
    for i in range ( n ) :
        if cnt [ i + 1 ] % 2 != 0 :
            print ( 'NO' )
            return
    print ( 'YES' )
    def main ( ) :
        with None , open ( sys.argv [ 1 ] , 'r' ) as f :
            start = time.time ( )
            debug = sys.argv [ 1 ] if len ( sys.argv ) > 1 else None
            if debug :
                with _io.open ( _io.devnull , 'r' ) as f :
                    f.write ( '%.4f' % ( sys.argv [ 1 ] , ) )
            f.write ( '\n' )
            f.flush ( )
            tr ( ( time.time ( ) - start ) + 'ms' )
    def read ( ) :
        with open ( sys.argv [ 1 ] , 'r' ) as f :
            f.write ( '' )
            f.write ( '\n' )
            f.flush ( )
        return f.read ( )
    def nd ( ) :
        return float ( next ( ) )
    def nl ( ) :
        return long ( next ( ) )
    def na ( n ) :
        a = [ ]
        for i in range ( n ) :
            a.append ( ni ( ) )
        return a
    def na ( n ) :
        a = [ ]
        for i in range ( n ) :
            a.append ( ni ( ) )
        return a
    def na ( n ) :
        a = [ ]
        for i in range ( n ) :
            a.append ( ni ( ) )
        return a
    def nlist ( n , m ) :
        a = [ ]
        for i in range ( m ) :
            a.append ( ni ( ) )
        return a
    def tr ( * args ) :
        if args :
            print ( 'NO' )
            return
    print ( 'NO' )
