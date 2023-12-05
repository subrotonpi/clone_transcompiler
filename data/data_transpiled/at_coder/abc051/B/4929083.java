public static int K = Integer . parseInt ( input ) {
  int S = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < K + 1 ;
  i ++ ) {
    for ( int j = 0 ;
    j < K + 1 ;
    j ++ ) {
      if ( S - i - j >= 0 && S - i - j <= K ) {
        ans ++ ;
      }
    }
  }
  return ans ;
}
