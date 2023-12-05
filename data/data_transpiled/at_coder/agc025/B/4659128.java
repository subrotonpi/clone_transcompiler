public static void comb ( ) {
  int [ ] F = {
    1 , 1 }
    ;
    int [ ] Fi = {
      1 , 1 }
      ;
      int [ ] I = {
        0 , 1 }
        ;
        int MOD = mod ;
        for ( int i = 2 ;
        i <= N ;
        i ++ ) {
          F [ i ] = ( F [ i - 1 ] * i ) % mod ;
          I [ i ] = mod - I [ mod % i ] * ( mod / i ) % mod ;
          Fi [ i ] = Fi [ i - 1 ] * I [ i ] % mod ;
        }
        int N = Integer . parseInt ( input ( ) ) ;
        int A = Integer . parseInt ( input ( ) ) ;
        int B = Integer . parseInt ( input ( ) ) ;
        int K = Integer . parseInt ( input ( ) ) ;
        MOD = 998244353 ;
        com = comb ( N , MOD ) ;
        if ( A > B ) A = ( B < A ) ? A : B ;
        int Rk = Math . min ( N , K / A ) ;
        int Ans = 0 ;
        for ( int i = 0 ;
        i < Rk + 1 ;
        i ++ ) {
          int R = i ;
          if ( ( K - ( A * R ) ) % B != 0 ) continue ;
          int C = ( K - ( A * R ) ) / B ;
          if ( C > N ) continue ;
          int Rc = com . com ( N , R ) ;
          int Cc = com . com ( N , C ) ;
          Ans += ( Rc * Cc ) % MOD ;
        }
        System . out . println ( Ans % MOD ) ;
      }
      