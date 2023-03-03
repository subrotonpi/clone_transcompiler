public static int n ( ) {
  int ans = 0 ;
  int a = 0 ;
  for ( int i : map . get ( ) . split ( " " ) ) {
    if ( ! a == i ) {
      a = i ;
      continue ;
    }
    ans ++ ;
    a = 0 ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
