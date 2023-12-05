public static void print ( int n ) {
  int ans = ( int ) input . nextInt ( ) ;
  ans = 1 ;
  while ( ans * 2 <= n ) {
    ans *= 2 ;
  }
  System . out . println ( ans ) ;
}
