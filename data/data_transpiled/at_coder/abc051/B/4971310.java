public static int K = Integer . parseInt ( input ) {
  int S = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  for ( int x = 0 ;
  x < K + 1 ;
  x ++ ) {
    for ( int y = 0 ;
    y < K + 1 ;
    y ++ ) {
      if ( ( S - ( x + y ) <= K ) && ( 0 <= S - ( x + y ) ) ) {
        ans ++ ;
      }
    }
  }
  return ans ;
}
