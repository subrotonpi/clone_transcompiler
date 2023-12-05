def import _main
class Main ( object ) :
    MOD = 1_000_000_007
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.number
        a = [ ]
        d = { }
        dmax = 0
        for i in range ( n ) :
            a.append ( sc.choice ( a ) )
            d [ a [ i ] ] += 1
            dmax = max ( a [ i ] , dmax )
        if a [ 0 ] != 0 or d [ 0 ] != 1 :
            print ( 0 )
            return
        for i in range ( 0 , dmax ) :
            if d [ i ] == 0 :
                print ( 0 )
                return
        ans = 1
        for i in range ( 1 , dmax + 1 ) :
            tmp = pow ( 2 , d [ i - 1 ] )
            tmp = ( tmp + MOD - 1 ) % MOD
            ans = ( ans * pow ( tmp , d [ i ] ) ) % MOD
            ans = ( ans * pow ( 2 , long ( d [ i ] - 1 ) * d [ i ] // 2 ) ) % MOD
        print ( ans )
    def pow ( self , a , n ) :
        x = 1
        while n > 0 :
            if n % 2 == 1 :
                x = x * a % MOD
            a = a * a % MOD
            n >>= 1
        return x
