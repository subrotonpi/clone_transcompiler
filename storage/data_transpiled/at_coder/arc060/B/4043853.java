@ VisibleForTesting static int from ( int n , int s ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) , s = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( n == s ) {
    System . out . println ( n + 1 ) ;
    exit ( ) ;
  }
  /* Check the largest integer in the range [s] */
  int result = 0 ;
  while ( n > 0 ) {
    result += n % b ;
    n /= b ;
  }
  int sq_n = ( int ) Math . sqrt ( n ) ;
  for ( int b = 2 ;
  b <= sq_n ;
  b ++ ) {
    if ( check ( b , n ) == s ) {
      System . out . println ( b ) ;
    }
  }
  return ( ans < inf ? - 1 : 1 ) ;
}
