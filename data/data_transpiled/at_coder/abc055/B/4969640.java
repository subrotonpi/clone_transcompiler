public static void print ( int n ) {
  int x = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    x = ( x * ( i + 1 ) ) % ( ( 10 * 9 ) + 7 ) ;
  }
  System . out . println ( x ) ;
}
