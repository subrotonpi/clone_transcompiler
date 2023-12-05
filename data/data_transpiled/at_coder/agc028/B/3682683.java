public static void extgcd ( int a , int b ) {
  int [ ] r = {
    1 , 0 , a }
    ;
    int [ ] w = {
      0 , 1 , b }
      ;
      while ( w [ 2 ] != 1 ) {
        int q = r [ 2 ] / w [ 2 ] ;
        int [ ] r2 = w ;
        int [ ] w2 = {
          r [ 0 ] - q * w [ 0 ] , r [ 1 ] - q * w [ 1 ] , r [ 2 ] - q * w [ 2 ] }
          ;
          r = r2 ;
          w = w2 ;
        }
        /* mod inv */
        int x = extgcd ( a , m ) [ 0 ] ;
        /* mod inv */
        int n = Integer . parseInt ( input ( ) ) ;
        a = Integer . parseInt ( input ( ) ) ;
        int m = 10 * 9 + 7 ;
        r = new int [ n + 1 ] ;
        int w = 0 ;
        for ( int i = 1 ;
        i <= n ;
        i ++ ) {
          w = ( w + modInv ( i , m ) ) % m ;
          r [ i ] = w ;
        }
        int fact = 1 ;
        for ( int i = 1 ;
        i <= n ;
        i ++ ) {
          fact = fact * i % m ;
        }
        int res = 0 ;
        for ( int j = 1 ;
        j <= n ;
        j ++ ) {
          int sum_p = ( r [ j ] + r [ n - j + 1 ] - 1 ) % m ;
          res = ( res + a [ j - 1 ] * sum_p * fact ) % m ;
        }
        System . out . println ( res % m ) ;
      }
      