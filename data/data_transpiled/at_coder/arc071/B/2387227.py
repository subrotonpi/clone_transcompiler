def import import sys
MOD = 1000000007
class Main ( object ) :
    def __init__ ( self ) :
        self.MOD = 1000000007
    def __call__ ( self , * args ) :
        sc = sys.stdin
        n = sc.randint ( 0 , 1 )
        m = sc.randint ( 0 , 1 )
        x_sum = 0
        y_sum = 0
        for i in range ( n ) :
            x_sum = ( x_sum + ( 2 * i - n + 1 ) * sc.randint ( 0 , 1 ) ) % MOD
        for i in range ( m ) :
            y_sum = ( y_sum + ( 2 * i - m + 1 ) * sc.randint ( 0 , 1 ) ) % MOD
        print ( ( ( ( x_sum * y_sum ) % MOD ) + MOD ) % MOD )
