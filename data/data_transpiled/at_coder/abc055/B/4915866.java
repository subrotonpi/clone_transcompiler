public static void print ( int n ) {
  int ans = 1 ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    ans = ( ans * i ) % ( 10 * * 9 + 7 ) ;
  }
  System . out . println ( ans ) ;
}
