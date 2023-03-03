def main ( ) :
    s = next ( )
    elem = s.split ( '/' )
    x = int ( elem [ 0 ] )
    y = int ( elem [ 1 ] )
    n1 = 2 * x / y
    n2 = ( 2 * x + y ) / y
    if n1 > n2 :
        tmp = n1
        n1 = n2
        n2 = tmp
    def nlist ( n , m ) :
        table = [ ]
        for i in range ( m ) :
            for j in range ( n ) :
                table.append ( ni ( ) )
        return table
    def nlist ( n , m ) :
        for i in range ( m ) :
            table.append ( ni ( ) )
        return table
    def f ( x , y , n ) :
        if n <= 0 :
            return - 1
        p = n * ( y * ( n + 1 ) - 2 * x )
        q = 2 * y
        if p % q == 0 :
            return p / q
        else :
            return - 1
    def main ( ) :
        with None , lambda : sys.stdin.readline ( )
    start = time.time ( )
    debug = sys.argv [ 1 ] if debug else None
    if debug :
        with _open ( _sys.argv [ 1 ] , 'r' ) as f :
            f.seek ( 0 )
    reader = _sys.stdin.readlines ( )
    solve ( )
    out.flush ( )
    tr ( ( time.time ( ) - start ) + 'ms' )
