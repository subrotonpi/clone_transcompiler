static final int MOD = 998244353 ;
{
  int N_max = 3 * 10 * 5 ;
  int [ ] g1 = {
    1 , 1 }
    ;
    int [ ] g2 = {
      1 , 1 }
      ;
      int [ ] inv = {
        0 , 1 }
        ;
        for ( int i = 2 ;
        i <= N_max ;
        i ++ ) {
          g1 [ i ] = ( g1 [ i - 1 ] * i ) % MOD ;
          inv [ i ] = ( - inv [ MOD % i ] * ( MOD / i ) ) % MOD ;
          g2 [ i ] = ( g2 [ i - 1 ] * inv [ i - 1 ] ) % MOD ;
        }
        int ans = 0 ;
        for ( int x = 0 ;
        x < N + 1 ;
        x ++ ) {
          if ( ( K - A * x ) % B == 0 ) {
            int y = ( K - A * x ) / B ;
            if ( y < 0 || y > N ) continue ;
            ans += g1 [ N ] * g2 [ x ] * g2 [ N - x ] * g1 [ N ] * g2 [ y ] * g2 [ N - y ] ;
            ans %= MOD ;
          }
        }
        System . out . println ( ans ) ;
        return 0 ;
      }
      