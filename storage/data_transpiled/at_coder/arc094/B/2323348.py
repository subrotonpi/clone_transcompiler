def main ( ) :
    global ns
    q = ni ( )
    for i in range ( q ) :
        a = nl ( )
        if a > b :
            tmp = a
            a = b
            b = tmp
        if a == b or a + 1 == b :
            print ( 2 ** ( a - 1 ) )
        else :
            c = int ( math.sqrt ( a * b - 100 ) )
            while ( c + 1 ) ** 2 < a * b :
                c += 1
            if c ** 2 >= a * b :
                print ( 2 ** ( c - 1 ) )
            else :
                print ( 2 ** ( c - 1 ) + 1 )
    def nlist ( n , m ) :
        return [ ni ( ) for i in range ( m ) ]
    def tr ( * o ) :
        if sys.stdin is not None :
            print ( _sys.stdin.read ( ) )
    def reader ( ) :
        start = time.time ( )
        debug = sys.argv [ 1 ] if len ( sys.argv ) > 1 else None
        if debug is not None :
            with _sys.stdin.fileno ( ) as fd :
                fd.write ( _sys.stdin.read ( 32768 ) )
        reader = _sys.stdin.readline ( )
        solve ( )
        out.flush ( )
        tr ( ( time.time ( ) - start ) + 'ms' )
    def reader ( ) :
        return _sys.stdin.read ( )
    def reader ( ) :
        return _sys.stdin.readline ( )
    def reader ( ) :
        return _sys.stdin.readline ( )
    def reader ( ) :
        return _sys.stdin.readline ( )
    def reader ( ) :
        return _sys.stdin.readline ( )
    def reader ( ) :
        return _sys.stdin.readline ( )
    def reader ( ) :
        return _sys.stdin.readline ( )
    def reader ( ) :
        return reader ( )
return reader
