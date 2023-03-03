def main ( ) :
    n = ni ( )
    a = nal ( n )
    mod = 1000000000 + 7
    sum = [ ]
    f = 1
    for i in range ( 1 , n + 1 ) :
        sum.append ( ( sum [ i - 1 ] + invl ( i , mod ) ) % mod )
        f = ( f * i ) % mod
    ret = 0
    for i in range ( n ) :
        table = [ ]
        for j in range ( m ) :
            table.append ( ni ( i ) )
    return table
    def tr ( * o ) :
        if sys.stdin is not None : print ( _sys.stdin.read ( ) )
        return
    def invl ( a , mod ) :
        b = mod
        p , q = 1 , 0
        while b > 0 :
            c , d = a // b , a
            a , b , d = b , d % b , p , q
            p , q = d - c * q
        return p , q
    def main ( ) :
        start = time.time ( )
        debug = sys.argv [ 1 ] if debug else None
        if debug :
            with open ( _sys.argv [ 1 ] , 'r' ) as f :
                return f.read ( )
        reader = _sys.stdin.readlines ( 32768 )
        solve ( )
        out.flush ( )
        tr ( ( time.time ( ) - start ) + 'ms' )
    def nd ( ) :
        return float ( next ( reader ) )
    def nl ( ) :
        return int ( next ( reader ) )
    def nl ( ) :
        return int ( next ( reader ) )
    return nl
