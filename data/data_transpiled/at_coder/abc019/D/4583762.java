public static int n ( ) {
  int ans = 0 ;
  int tmp ;
  for ( int i = 2 ;
  i <= n ;
  i ++ ) {
    System . out . println ( "? " + 1 + " " + i ) ;
    tmp = Integer . parseInt ( input . nextLine ( ) ) ;
    if ( tmp >= ans ) {
      v = i ;
      ans = tmp ;
    }
  }
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
  }
  return ans ;
}
