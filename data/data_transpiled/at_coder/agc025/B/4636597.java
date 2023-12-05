public static int nck ( int n , int a , int b , int k ) {
  int mod = 998244353 ;
  int [ ] fac = {
    1 , 1 }
    ;
    int [ ] inv = {
      1 , 1 }
      ;
      int [ ] finv = {
        1 , 1 }
        ;
        for ( int i = 2 ;
        i <= n ;
        i ++ ) {
          fac [ i ] = fac [ i - 1 ] * i % mod ;
          inv [ i ] = mod - inv [ mod % i ] * ( mod / i ) % mod ;
          finv [ i ] = finv [ i - 1 ] * inv [ i ] % mod ;
        }
        /* nck(n, k) */
        if ( n < k ) {
          return 0 ;
        }
        if ( n < 0 || k < 0 ) {
          return 0 ;
        }
        /* fac[n] * (finv[k] * finv[n-k] % mod) */
        int ans = 0 ;
        for ( int ca = n + 1 ;
        ca <= n ;
        ca ++ ) {
          int cb = ( k - a * ca ) / b ;
          if ( ( k - a * ca ) % b != 0 ) {
            continue ;
          }
          ans += nck ( n , ca ) * nck ( n , cb ) ;
          ans %= mod ;
        }
        System . out . println ( ans ) ;
        return ans ;
      }
      