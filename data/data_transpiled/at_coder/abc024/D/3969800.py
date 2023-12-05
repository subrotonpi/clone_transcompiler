def main ( ) :
    mod = 1000000000 + 7
    A , B , C = nl ( )
    x = ( A - B + mod + A * B % mod * invl ( C , mod ) ) % mod
    n = B * invl ( x , mod ) % mod
    r = A * invl ( C , mod ) % mod * n % mod
    c = ( n + mod - r + 1 ) % mod
    r = ( r + mod - 1 ) % mod
    c = ( c + mod - 1 ) % mod
    def tr ( * o ) :
        if _sys.stdin :
            print ( _sys.stdin )
    def invl ( a , mod ) :
        b = mod
        p , q = 1 , 0
        while b :
            c , d = a // b , a
            a , b = d % b , p
            p , q = d - c * q
        return p , q
    def main ( ) :
        start = time.time ( )
        debug = sys.argv [ 1 ] if debug else None
        if debug :
            with _sys.stdin :
                _sys.stdin.write ( _sys.stdin.read ( ) )
        _sys.stdin.seek ( 0 , 32768 )
        solve ( )
        _sys.stdout.flush ( )
        tr ( ( time.time ( ) - start ) + 'ms' )
    def nl ( ) :
        return float ( next ( sys.stdin ) )
    def nl ( ) :
        return int ( next ( sys.stdin ) )
    def nlist ( n , m ) :
        return [ n ]
    def tr ( * o ) :
        if _sys.stdin is None :
            print ( _sys.stdin )
    return tr ( * o )
