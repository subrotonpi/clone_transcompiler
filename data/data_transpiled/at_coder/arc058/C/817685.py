def import _main
MOD = 1000000007
class Main ( object ) :
    def __init__ ( self ) :
        self.MOD = 1000000007
    def __call__ ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        X = sc.readline ( ).strip ( )
        Y = sc.readline ( ).strip ( )
        Z = sc.readline ( ).strip ( )
        L = X + Y + Z
        match = 1 << ( X + Y + Z - 1 ) | 1 << ( Y + Z - 1 ) | 1 << ( Z - 1 )
        mask = ( 1 << ( L - 1 ) ) - 1
        dp = [ [ 1 ] * N + [ 1 ] * ( L - 1 ) ]
        dp [ 0 ] [ 0 ] = 1
        for i in range ( N ) :
            for j in range ( 0 , mask + 1 ) :
                for k in range ( 1 , 10 ) :
                    next = j << k | 1 << ( k - 1 )
                    if ( ( next & ( ( 1 << L ) - 1 ) ) & match ) != match :
                        dp [ i + 1 ] [ next & mask ] = ( dp [ i + 1 ] [ next & mask ] + dp [ i ] [ j ] ) % MOD
    ans = 1
    for i in range ( N ) :
        ans = ( ans * 10 ) % MOD
    for i in range ( 1 << ( L - 1 ) ) :
        ans = ( ans + MOD - dp [ N ] [ i ] ) % MOD
    print ( ans )
