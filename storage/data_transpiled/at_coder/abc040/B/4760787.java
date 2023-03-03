public static int ans ( ) {
  int ans = 2 * 32 + 1 ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int i = 1 ;
  i <= 1001 ;
  i ++ ) {
    for ( int j = 1 ;
    j <= 1001 ;
    j ++ ) {
      if ( i * j <= n ) {
        ans = Math . min ( ans , Math . abs ( i - j ) + n - ( i * j ) ) ;
      }
    }
  }
  return ans ;
}
