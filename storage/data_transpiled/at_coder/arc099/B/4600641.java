public static int [ ] A ( ) {
  double p = 10 * 18 ;
  for ( int i = 15 ;
  i >= 2 ;
  i -- ) {
    long l = Math . max ( 0 , 10 * ( i - 3 ) - 1 ) ;
    long m = 10 * ( i - 3 ) ;
    for ( long j = 999 ;
    j >= 9 ;
    j -- ) {
      long c = l + m * j ;
      double s = c / Long . valueOf ( String . valueOf ( c ) ) ;
      if ( s - p <= 1e-7 ) {
        A [ i ] = c ;
        p = s ;
      }
    }
  }
  return A ;
}
