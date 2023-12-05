@ VisibleForTesting static int solve ( int n , int s ) {
  int b ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
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
  b <= Math . floor ( Math . sqrt ( n ) ) ;
  b ++ ) {
    if ( f ( b , n ) == s ) {
      return b ;
    }
  }
  for ( int p = 1 ;
  p <= Math . floor ( Math . sqrt ( n ) ) ;
  p ++ ) {
    if ( ( n - s ) % p == 0 ) {
      b = ( n - s ) / p + 1 ;
      int q = n - p * b ;
      if ( 1 <= p && p < b && 0 <= q && q < b ) {
        return b ;
      }
    }
  }
  return - 1 ;
}
