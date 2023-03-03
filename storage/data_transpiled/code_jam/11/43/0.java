@ Sys public static void Sys ( ) throws Exception {
  int [ ] P = new int [ 1000001 ] ;
  for ( int p : xrange ( 2 , 1000 ) ) {
    if ( P [ p ] > 0 ) {
      Arrays . fill ( P , p * p , 0 , 1 + ( 1000000 / p ) - p ) ;
    }
  }
  P [ 1 ] = 0 ;
  Arrays . fill ( P , p ) ;
  for ( int i : xrange ( 1 , 1 + Integer . parseInt ( stdin . readLine ( ) ) ) ) {
    int n = Integer . parseInt ( stdin . readLine ( ) ) ;
    int k = 2 ;
    long ans = 1 ;
    while ( ( ( 1 << k ) <= n ) && ( ans < 0 ) ) {
      int lwr = 0 ;
      int upr = P . length ;
      while ( ( lwr + 1 < upr ) && ( upr < n ) ) {
        int mid = ( lwr + upr ) >> 1 ;
        if ( ( ( P [ mid ] *= k ) <= n ) && ( ( P [ mid ] *= k ) <= n ) ) {
          lwr = mid ;
        }
        else {
          upr = mid ;
        }
      }
      ans += upr ;
      k ++ ;
    }
    if ( ( n == 1 ) && ( ans < 0 ) ) ans = 0 ;
    System . out . println ( "Case #" + i + ": " + ans ) ;
  }
}
