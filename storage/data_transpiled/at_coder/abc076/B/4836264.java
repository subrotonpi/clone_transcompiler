public static void print ( int n ) {
  int k = Integer . parseInt ( input ( ) ) ;
  int ans = 1 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    ans = Math . min ( ans + k , ans * 2 ) ;
  }
  System . out . println ( ans ) ;
}
