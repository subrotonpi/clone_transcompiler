public static void print ( int n , int s , int t ) {
  int w = 0 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    w += Integer . parseInt ( input . nextLine ( ) ) ;
    if ( w >= s && w <= t ) {
      ans ++ ;
    }
  }
  System . out . println ( ans ) ;
}
