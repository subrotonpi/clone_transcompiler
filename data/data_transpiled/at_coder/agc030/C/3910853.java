public static void print ( int k ) {
  if ( k == 1 ) {
    System . out . println ( 1 ) ;
    System . out . println ( 1 ) ;
    exit ( ) ;
  }
  int n = ( k + 3 ) / 4 * 2 ;
  int l = 2 * n - k ;
  System . out . println ( n ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( j % 2 == 0 || ( i + j ) % n >= n - l ) {
        System . out . print ( ( i + j ) % n + 1 ) ;
      }
      else {
        System . out . print ( n + ( i + j ) % n + 1 ) ;
      }
    }
    System . out . println ( "" ) ;
  }
}
