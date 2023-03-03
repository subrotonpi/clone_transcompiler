def main ( ) :
    def solve ( ) :
        h = ni ( )
        w = ni ( )
        mod = 1000000000 + 7
        fif = enum_fif ( max ( h , w ) , mod )
        gcd = gcd ( h , w )
        ret = 0
        period = long ( h * w )
        for dx in range ( 0 , gcd ) :
            dy = gcd - dx
            px = w / gcd ( w , dx )
            py = h / gcd ( h , dy )
            p = long ( px * py / gcd ( px , py ) )
            if p == period :
                ret += c ( gcd , dx , fif , mod )
                ret %= mod
        print ( ret )
    def nlist ( n , m ) :
        for i in range ( 0 , m ) :
            for j in range ( 0 , m ) :
                table [ j ] [ i ] = ni ( )
        return table [ i ]
    def na ( * o ) :
        if o != sys.stdin :
            print ( _repr ( o ) )
    def c ( n , k , fif , mod ) :
        if n < k :
            return 0
        return long ( fif [ 0 ] [ n ] * fif [ 1 ] [ n - k ] ) % mod * fif [ 1 ] [ n - k ]
    def enum_fif ( n , mod ) :
        f = [ 1 ]
        invf = [ 0 ]
        for i in range ( 1 , n + 1 ) :
            f.append ( int ( f [ i - 1 ] [ n - i ] ) )
        a = f [ n ]
        b = mod
        p , q = 1 , 0
        while b :
            c , d = a // b , a , b , d % b , p , q
            p , q = d - c * q
        invf.append ( int ( p < 0 ) * ( i + 1 ) )
        for i in range ( n - 1 , n + 1 ) :
            invf [ i ] = int ( invf [ i ] [ n - i ] )
        return f , invf
    return nlist ( )
