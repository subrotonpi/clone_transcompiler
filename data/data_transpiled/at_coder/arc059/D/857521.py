def import _main
class Main ( object ) :
    MOD = 1000000007
    def __init__ ( self ) :
        self.MOD = 1000000007
    def main ( self ) :
        sc = sys.stdin
        N = sc.readline ( )
        M = sc.readline ( ).rstrip ( )
        dp = [ [ 0 ] * ( N + 1 ) ]
        dp [ 0 ] [ 0 ] = 1
        for i in range ( N ) :
            [ dp [ ( i + 1 ) % 2 ] ] = 0
            for j in range ( 0 , i ) :
                dp [ ( i + 1 ) % 2 ] [ j + 1 ] = ( dp [ ( i + 1 ) % 2 ] [ j + 1 ] + dp [ i % 2 ] [ j ] * 2 ) % MOD
                dp [ ( i + 1 ) % 2 ] [ max ( 0 , j - 1 ) ] = ( dp [ ( i + 1 ) % 2 ] [ max ( 0 , j - 1 ) ] + dp [ i % 2 ] [ j ] ) % MOD
        ans = dp [ N % 2 ] [ M ]
        div2 = ( MOD + 1 ) / 2
        for i in range ( M ) :
            ans = ( ans * div2 ) % MOD
        print ( ans )
        sc.close ( )
