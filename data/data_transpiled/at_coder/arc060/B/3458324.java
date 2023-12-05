@ VisibleForTesting static int solve ( int n , int s ) {
  int b ;
  if ( n < b ) {
    return n ;
  }
  else {
    return f ( b , n / b ) + n % b ;
  }
  /* solve the n and s */
  if ( s > n ) {
    return - 1 ;
  }
  else if ( s == n ) {
    return n + 1 ;
  }
  for ( b = 2 ;
  b <= floor ( sqrt ( n ) ) ;
  b ++ ) {
    if ( ( n - s ) % p == 0 ) {
      b = ( n - s ) / p + 1 ;
      if ( f ( b , n ) == s ) {
        return b ;
      }
    }
  }
  return - 1 ;
}
