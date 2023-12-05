public static int [ ] nck ( int r , int c ) {
  int x = Integer . parseInt ( input ( ) ) ;
  int y = Integer . parseInt ( input ( ) ) ;
  int d = Integer . parseInt ( input ( ) ) ;
  int l = Integer . parseInt ( input ( ) ) ;
  int mod = 10 * 9 + 7 ;
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
        i <= 1000 ;
        i ++ ) {
          fac [ i ] = fac [ i - 1 ] * i % mod ;
          inv [ i ] = mod - inv [ mod % i ] * ( mod / i ) % mod ;
          finv [ i ] = finv [ i - 1 ] * inv [ i ] % mod ;
        }
        /* nck(n,k) */
        if ( n < k ) {
          return 0 ;
        }
        if ( n < 0 || k < 0 ) {
          return 0 ;
        }
        /* nck(n,k) */
        if ( n < 0 || k < 0 ) {
          return 0 ;
        }
        /* nck(n,k) */
        if ( n < 0 || k < 0 ) {
          return 0 ;
        }
        /* nck(n,k) */
        if ( n < 0 || k < 0 || d + l > a * b ) {
          return 0 ;
        }
        /* nck(a,b) */
        if ( d + l == x * y ) {
          int num = nck ( x * y , d ) % mod ;
          num *= ( r - x + 1 ) * ( c - y + 1 ) ;
          num %= mod ;
          System . out . println ( num ) ;
        }
        else {
          int num = nck ( x , y ) ;
          int pie = nck ( x - 1 , y ) * 2 + nck ( x , y - 1 ) * 2 ;
          pie -= nck ( x - 2 , y ) + nck ( x , y - 2 ) + nck ( x - 1 , y - 1 ) * 4 ;
          pie += nck ( x - 2 , y - 1 ) * 2 + nck ( x - 1 , y - 2 ) * 2 ;
          pie -= nck ( x - 2 , y - 2 ) ;
          pie %= mod ;
          int ans = ( ( ( num - pie ) % mod )