def main ( ) :
    n = ni ( )
    x = na ( 3 )
    mod = int ( 1e9 ) + 7
    mask = ( 1 << 17 ) - 1
    ret_mask = 0
    for v in x :
        ret_mask <<= 1
        ret_mask |= 1
        ret_mask <<= v - 1
    dp = [ [ 1 << 17 ] * n for i in range ( n ) ]
    def tr ( * x ) :
        if x != sys.stdin :
            print ( _repr ( x ) )
    def ntable ( n , m ) :
        table = [ [ 1 << 17 ] * n for i in range ( m ) ]
        for i in range ( n ) :
            for j in range ( 1 , 10 ) :
                to = ( ( ( j << 1 ) | 1 ) << ( k - 1 ) ) & mask
                if ( to & ret_mask ) != ret_mask :
                    dp [ i + 1 ] [ to ] += dp [ i ] [ j ]
                    dp [ i + 1 ] [ to ] %= mod
        return table
    ret = 1
    for i in range ( n ) :
        ret *= 10
        ret %= mod
    for j in range ( ( 1 << 17 ) ) :
        ret += mod - dp [ n ] [ j ]
        ret %= mod
    print ( ret )
    def main ( ) :
        with open ( sys.argv [ 1 ] , 'r' ) as f :
            while f.readline ( ) is None or not f.readline ( ) :
                try :
                    f.readline ( )
                except :
                    raise
            f.readline ( )
    return sys.stdout
