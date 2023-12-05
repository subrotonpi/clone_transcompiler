@ VisibleForTesting static int from ( int n ) {
  int s = Integer . parseInt ( input ) ;
  /* Compute the sum of the squares */
  int res = 0 ;
  while ( n > 0 ) {
    res += n % b ;
    n /= b ;
  }
  if ( s == n ) {
    System . out . println ( n + 1 ) ;
    exit ( ) ;
  }
  for ( int b = 2 ;
  b <= ( int ) s ;
  b ++ ) {
    if ( s == n ) {
      continue ;
    }
    if ( s == n ) {
      System . out . println ( b ) ;
      exit ( ) ;
    }
  }
  return res ;
}
