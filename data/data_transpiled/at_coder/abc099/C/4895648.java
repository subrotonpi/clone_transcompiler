static final int [ ] getStdOut ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] dp = new int [ N + 1 ] ;
  /* Check if n is 0 */
  if ( dp [ N ] == 0 ) {
    return 0 ;
  }
  else if ( dp [ N ] != 0 ) {
    return dp [ N ] ;
  }
  int ans = N ;
  for ( int i = 6 * k ;
  i < 7 ;
  i ++ ) {
    if ( i <= n ) {
      ans = Math . min ( ans , fun ( n - i ) + 1 ) ;
    }
  }
  for ( int j = 9 * l ;
  j < 6 ;
  j ++ ) {
    if ( j <= n ) {
      ans = Math . min ( ans , fun ( n - j ) + 1 ) ;
    }
  }
  dp [ N ] = ans ;
  return dp ;
}
