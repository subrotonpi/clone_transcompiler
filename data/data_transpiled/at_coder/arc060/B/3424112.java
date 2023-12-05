public static int digit_sum ( int n , int s ) {
  if ( s > n ) return - 1 ;
  if ( s == n ) return n + 1 ;
  int b = 2 ;
  while ( b * b < n ) {
    if ( f ( b , n ) == s ) return b ;
    b ++ ;
  }
  int p = ( int ) ( n * 0.5 ) ;
  while ( p >= 1 ) {
    b = ( n - s ) / p + 1 ;
    if ( b > 1 && f ( b , n ) == s ) return b ;
    p -- ;
  }
  return - 1 ;
}
