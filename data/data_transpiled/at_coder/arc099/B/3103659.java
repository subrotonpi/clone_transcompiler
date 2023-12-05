public static int k = Integer . parseInt ( input ) {
  int n = 1 ;
  int t = 1 ;
  int l = 0 ;
  for ( int i = 0 ;
  i < k ;
  i ++ ) {
    System . out . println ( n ) ;
    if ( ( int ) ( n / t ) % 10 == 9 ) {
      if ( n + t <= ( 9 * l + ( int ) ( ( n + t ) / ( t * 10 ) ) % 10 + ( int ) ( ( n + t ) / ( t * 100 ) ) % 100 + ( int ) ( ( n + t ) / ( t * 1000 ) ) % 1000 ) * t ) {
      }
      else {
        t *= 10 ;
        l ++ ;
      }
    }
    n += t ;
  }
  return n ;
}
