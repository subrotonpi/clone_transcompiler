public static void print ( int n ) {
  int temp = 100 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    temp = Integer . parseInt ( input ( ) ) ;
    ans = Math . min ( ans , temp ) ;
  }
  System . out . println ( ans ) ;
}
