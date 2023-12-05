public static int N ( ) {
  int ans = Integer . parseInt ( N ) ;
  int tmp = Integer . parseInt ( N [ 0 ] ) - 1 ;
  for ( int i = 1 ;
  i < N . length ;
  i ++ ) {
    tmp += 9 ;
  }
  System . out . println ( max ( ans , tmp ) ) ;
  return ans ;
}
