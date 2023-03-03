def _ ( ) : return sys.stdin.read ( 32768 )
def solve ( ) :
    n = ni ( )
    s = ns ( )
    m = len ( s )
    dp = [ [ 1 ] * ( n + 1 ) for i in range ( 2 ) ]
    dp [ 0 ] [ 0 ] = 1
    mod = 1000000000 + 7
    for i in range ( n ) :
        from = i % 2
        to = ( i + 1 ) % 2
        for j in range ( 0 , min ( i + 1 , n ) ) :
            if j < n :
                dp [ to ] [ j ] += dp [ from ] [ j + 1 ]
            if j > 0 :
                dp [ to ] [ j ] += dp [ from ] [ j - 1 ] * 2
            if j == 0 :
                dp [ to ] [ j ] += dp [ from ] [ j ]
            dp [ to ] [ j ] %= mod
        dp [ from ] = 0
    two = 1
    for i in range ( m ) :
        two *= 2
        two %= mod
    print ( dp [ n % 2 ] [ m ] * inverse ( two , mod ) % mod )
    def extgcd ( a , b ) :
        u = 1
        v = 0
        x = 1
        while a > 0 :
            q = b // a
            x -= q * u
            y -= q * v
            b -= q * a
            tmp = x
            x = u
            u = tmp
            y = v
            v = tmp
            tmp = b
            b = a
            a = tmp
        return b , x , y
    def inverse ( n , mod ) :
        gcd = extgcd ( n , mod )
        if gcd [ 0 ] == 1 :
            return ( gcd [ 1 ] + mod ) % mod
        else :
            return 0
    return sys.stdout.read ( 1 )
