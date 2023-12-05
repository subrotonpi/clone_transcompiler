def main ( ) :
    from math import pow
    MOD = long ( pow ( 10 , 9 ) ) + 7
    def func ( a , x ) :
        sc = sys.stdin
        n = sc.count ( )
        kaijou = [ 1 ]
        for i in range ( 1 , n + 2 ) :
            kaijou.append ( ( kaijou [ i - 1 ] * long ( i ) ) % MOD )
        suuretu = [ 0 ] * n + [ 1 ]
        aho = [ 0 ] * n + [ 1 ]
        for i in range ( n + 1 ) :
            a = sc.read ( )
            aho [ i ] = a
            suuretu [ int ( a ) ] += 1
        u = 0
        for i in range ( n + 1 ) :
            if suuretu [ i ] == 2 :
                u = i
        index = index2 = 0
        flg = True
        for i in range ( n + 1 ) :
            if aho [ i ] == u :
                if flg :
                    flg = False
                    index = i
                else :
                    index2 = i
        unko = long ( index + n - index2 )
        dp = [ 0 ] * int ( unko + 1 )
        dp2 = [ 0 ] * int ( unko + 1 )
        for k in range ( 1 , unko + 1 ) :
            ans = dp2 [ k ]
            if k >= 1 :
                if k - 1 < int ( unko ) :
                    ans -= dp [ k - 1 ]
                else :
                    ans -= dp [ k - 1 ]
        return ans
    return func
