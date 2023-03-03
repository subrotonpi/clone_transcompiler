def Main ( ) :
    n = ni ( )
    a = ni ( )
    b = ni ( )
    k = nl ( )
    mod = 998244353
    fif = enum_fif ( n , mod )
    ret = 0
    for i in range ( 0 , n ) :
        x = a * i
        if ( k - x ) % b :
            continue
        j = ( k - x ) // b
        if j < 0 or j > n :
            continue
        now = 1
        now *= CX ( n , i , mod , fif )
        now %= mod
        now *= CX ( n , j , mod , fif )
        now %= mod
        ret += now
        ret %= mod
    print ( ret )
    def CX ( n , r , p , fif ) :
        if n < 0 or r < 0 or r > n :
            return 0
        np , rp = int ( n % p ) , int ( r % p )
        if np < rp :
            return 0
        if n == 0 and r == 0 :
            return 1
        nrp = np - rp
        if nrp < 0 :
            nrp += p
        return int ( fif [ 0 ] [ np ] * fif [ 1 ] [ rp ] % p * fif [ 1 ] [ nrp ] % p * CX ( n // p , r // p , p , fif ) % p )
    def enum_fif ( n , mod ) :
        f = [ 1 ] * n
        invf = [ 0 ] * n
        for i in range ( 1 , n + 1 ) :
            f [ i ] = int ( f [ i - 1 ] * i % mod )
        a = f [ n ]
        b = mod
        p , q = 1 , 0
        while b > 0 :
            c , d = a // b , a , b , d , p , q = b
        invf [ n ] = int ( f [ n ] ) * ( i + 1 ) % mod
        return f , invf
    return None
