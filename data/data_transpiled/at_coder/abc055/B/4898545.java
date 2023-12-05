public static void print ( int n ) {
  int s = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    s = s * i ;
    s = s % ( 10 * 9 + 7 ) ;
  }
  System . out . println ( s ) ;
}
