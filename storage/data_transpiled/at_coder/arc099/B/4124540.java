public static int K = Integer . parseInt ( open ( 0 ) ) {
  int k = n ;
  n ++ ;
  int d = 1 ;
  int c = Integer . parseInt ( String . valueOf ( n ) ) ;
  int p = n ;
  int q = c ;
  while ( d < n ) {
    int b = ( n / d ) % 10 ;
    n += ( 9 - b ) * d ;
    c += 9 - b ;
    if ( p * c > n * q ) {
      p = n ;
      q = c ;
    }
  }
  return p ;
}
