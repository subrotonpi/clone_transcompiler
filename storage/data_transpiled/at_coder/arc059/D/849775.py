def import _main
class Main ( object ) :
    MOD = 1000000007
    def __init__ ( self ) :
        self._main = _main
    def __init__ ( self ) :
        self._main.__init__ ( )
    def main ( self ) :
        sc = sys.stdin
        N = sc.readline ( ).strip ( )
        M = sc.readline ( ).strip ( )
        dp = [ [ 0 ] * ( N + 1 ) ]
        zero = [ 1 ] * ( N + 1 )
        for i in range ( N ) :
            [ dp [ ( i + 1 ) % 2 ] ] = 0
            for j in range ( 0 , i ) :
                dp [ ( i + 1 ) % 2 ] [ j + 1 ] = ( dp [ ( i + 1 ) % 2 ] [ j + 1 ] + dp [ i % 2 ] [ j ] * 2 ) % MOD
                dp [ ( i + 1 ) % 2 ] [ max ( 0 , j - 1 ) ] = ( dp [ ( i + 1 ) % 2 ] [ max ( 0 , j - 1 ) ] + dp [ i % 2 ] [ j ] ) % MOD
            zero [ i + 1 ] = dp [ ( i + 1 ) % 2 ] [ 0 ]
        for i in range ( 0 , N ) :
            for j in range ( ( N - i - M ) // 2 ) :
                zero [ i ] = ( zero [ i ] * 2 ) % MOD
            for i in range ( N ) :
                [ dp [ ( i + 1 ) % 2 ] ] = 0
                dp [ i % 2 ] [ 0 ] = zero [ i ]
                for j in range ( 0 , i ) :
                    dp [ ( i + 1 ) % 2 ] [ j + 1 ] = ( dp [ ( i + 1 ) % 2 ] [ j + 1 ] + dp [ i % 2 ] [ j ] ) % MOD
                    if j - 1 > 0 :
                        dp [ ( i + 1 ) % 2 ] [ j - 1 ] = ( dp [ ( i + 1 ) % 2 ] [ j - 1 ] + dp [ i % 2 ] [ j ] ) % MOD
        print ( dp [ N % 2 ] [ M ] )
        sc.close ( )
