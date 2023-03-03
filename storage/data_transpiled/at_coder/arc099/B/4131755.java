public static int k = Integer . parseInt ( input ) {
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  {
    int S = Integer . parseInt ( input . nextLine ( ) ) ;
    int T = S / S ;
    int n = 1 ;
    int [ ] snuke = new int [ k ] ;
    snuke [ 0 ] = 1 ;
    int x = 1 ;
    while ( n < k ) {
      x ++ ;
      int cand = x ;
      int T_min = T ;
      for ( int d = 0 ;
      d < String . valueOf ( x ) . length ( ) - 1 ;
      d ++ ) {
        if ( T ( ( x / ( 10 * ( d + 1 ) ) + 1 ) * ( 10 * ( d + 1 ) ) - 1 ) < T_min ) {
          T_min = T ( ( x / ( 10 * ( d + 1 ) ) + 1 ) * ( 10 * ( d + 1 ) ) - 1 ) ;
          cand = ( x / ( 10 * ( d + 1 ) + 1 ) * ( 10 * d ) - 1 ) ;
        }
      }
      x = cand ;
      snuke [ n ] = x ;
      n ++ ;
    }
  }
  return snuke [ n ] ;
}
