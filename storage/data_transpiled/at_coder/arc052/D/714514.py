def _import ( ) :
    from math import pow
    class Main ( object ) :
        def sum ( v ) :
            ans = 0
            while v > 0 :
                ans += v % 10
                v /= 10
            return ans
    with open ( "../../api/" , "r" ) as sc :
        K = int ( sc.read ( ) )
        M = int ( sc.read ( ) )
        A = M / 100000
        d = { }
        for i in range ( 100000 ) :
            fb = ( i - sum ( i ) % K + K ) % K
            d [ fb ] = ( d [ fb ] if fb in d else 0 ) + 1
        ans = 0
        for i in range ( A ) :
            fa = ( i * 100000 - sum ( i ) % K + K ) % K
            v = d.get ( ( K - fa ) % K )
            ans += v if v else 0
        for i in range ( A * 100000 , M + 1 ) :
            if i % K == sum ( i ) % K :
                ans += 1
        print ( ans - 1 )
        sc.close ( )
