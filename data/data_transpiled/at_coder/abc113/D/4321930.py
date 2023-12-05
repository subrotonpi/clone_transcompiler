def import import _mod2
class Main ( object ) :
    MOD = 1_000_000_007
    sum = 0
    def __init__ ( self , sc ) :
        h , w , k = sc.recvfrom ( )
        cnt = [ 0 ] * ( w + 1 )
        self.init ( w , cnt )
        dp = [ [ 1 ] * ( h + 1 ) for i in range ( h + 1 ) ]
        dp [ 0 ] [ 0 ] = 1
        for i in range ( 1 , h + 1 ) :
            for j in range ( w ) :
                if j > 0 :
                    dp [ i ] [ j - 1 ] += cnt [ j ] * dp [ i - 1 ] [ j ]
                    dp [ i ] [ j - 1 ] %= MOD
                dp [ i ] [ j ] += ( sum - cnt [ j ] - cnt [ j + 1 ] ) * dp [ i - 1 ] [ j ]
                dp [ i ] [ j ] %= MOD
                if j + 1 < w :
                    dp [ i ] [ j + 1 ] += cnt [ j + 1 ] * dp [ i - 1 ] [ j ]
                    dp [ i ] [ j + 1 ] %= MOD
        print ( dp [ h ] [ k - 1 ] )
    def __init__ ( self , w , cnt ) :
        for n in range ( ( 1 << ( w - 1 ) ) ) :
            tmp = n
            bi = [ tmp ]
            ok = True
            for i in range ( w - 1 ) :
                bi [ i + 1 ] = tmp % 2
                if bi [ i ] * bi [ i + 1 ] == 1 :
                    ok = False
                    break
                tmp /= 2
            if ok :
                self.sum += 1
                for i in range ( 1 , w ) :
                    cnt [ i ] += bi [ i ]
