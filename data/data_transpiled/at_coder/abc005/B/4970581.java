public static void print ( int n ) {
  int ans = 100 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans = Math . min ( ans , Integer . parseInt ( input ( ) ) ) ;
  }
  System . out . println ( ans ) ;
}
