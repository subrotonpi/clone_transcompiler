def import import _sys , string
class Main ( object ) :
    def __init__ ( self ) :
        self.MOD = 1_000_000_007
    def main ( self ) :
        N , X , Y , Z = string.split ( ' ' )
        p10 = [ 1 ]
        for i in range ( N + 1 ) :
            p10 [ i + 1 ] = p10 [ i ] * 10 % MOD
        dp = [ [ 1 ] * ( X + Y + Z ) for i in range ( N + 1 ) ]
        dp [ 0 ] [ 1 ] = 1
        ans = 0
        for i in range ( N ) :
            for j in range ( 1 , ( 1 << ( X + Y + Z ) ) ) :
                if dp [ i ] [ j ] == 0 : continue
                for k in range ( 1 , 10 ) :
                    if k <= Z and ( j & ( 1 << ( X + Y + Z - k ) ) ) :
                        ans += ( dp [ i ] [ j ] * p10 [ N - i - 1 ] ) % MOD
                        continue
                    next = 1
                    for l in range ( k + l , X + l + 1 ) :
                        if ( j & ( 1 << l ) ) == 0 : continue
                        next |= 1 << ( k + l )
                    for l in range ( X , X + l + 1 ) :
                        if ( j & ( 1 << l ) ) == 0 : continue
                        next |= 1 << ( k + l )
                    for l in range ( X + Y , X + l + 1 ) :
                        if ( j & ( 1 << l ) ) == 0 : continue
                        next |= 1 << ( k + l )
                    dp [ i + 1 ] [ next ] += dp [ i ] [ j ]
                    if dp [ i + 1 ] [ next ] >= MOD : dp [ i + 1 ] [ next ] -= MOD
        print ( ans % MOD )
