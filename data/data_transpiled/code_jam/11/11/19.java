private static int simp ( int n ) throws Exception {
  int j = 100 ;
  int k = n ;
  if ( n % 4 == 0 ) {
    j = j / 4 ;
    k = k / 4 ;
  }
  else if ( n % 2 == 0 ) {
    j = j / 2 ;
    k = k / 2 ;
  }
  if ( n % 25 == 0 ) {
    j = j / 25 ;
    k = k / 25 ;
  }
  else if ( n % 5 == 0 ) {
    j = j / 5 ;
    k = k / 5 ;
  }
  return ( k == 0 ) ? j : k ;
}
