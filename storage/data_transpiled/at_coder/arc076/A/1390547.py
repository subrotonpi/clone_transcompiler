def import _main
class Main ( object ) :
    def solve_c ( self ) :
        self.main = Main ( )
        self.solve_c ( )
    def solve_c ( self ) :
        with open ( self.main.c , 'r' ) as sc :
            MOD = 1000000007
            N = sc.read ( )
            M = sc.read ( )
            if N - M > 1 or M - N > 1 :
                print ( 0 )
            else :
                if N == M :
                    print ( 2 * perm ( N , MOD ) * perm ( N , MOD ) % MOD )
                else :
                    print ( perm ( N , MOD ) * perm ( M , MOD ) % MOD )
    def perm ( self , N , mod ) :
        mul = 1
        for _ in range ( 0 , N ) :
            mul = ( mul * N ) % mod
        return mul
