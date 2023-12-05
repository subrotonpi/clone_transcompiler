public static int find ( int n , int y ) {
  for ( int i = 0 ;
  i < n + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < n + 1 - i ;
    j ++ ) {
      if ( 10000 * i + 5000 * j + 1000 * ( n - i - j ) == y ) {
        return i ;
      }
    }
  }
  return - 1 ;
}
