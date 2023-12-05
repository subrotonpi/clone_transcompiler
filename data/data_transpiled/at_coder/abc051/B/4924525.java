public static int k ( ) {
  int s = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < k + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < k + 1 ;
    j ++ ) {
      if ( ( i + j ) <= s && ( s - ( i + j ) <= k ) ) {
        ans ++ ;
      }
    }
  }
  return ans ;
}
