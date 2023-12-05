public static int K = Integer . parseInt ( input ) {
  int S = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  for ( int x = 0 ;
  x <= K ;
  x ++ ) {
    for ( int y = 0 ;
    y <= K ;
    y ++ ) {
      if ( 0 <= S - ( x + y ) && S <= K ) {
        ans ++ ;
      }
    }
  }
  return ans ;
}
