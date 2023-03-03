public static int K = Integer . parseInt ( input ) {
  int S = Integer . parseInt ( input . nextLine ( ) ) ;
  int ans = 0 ;
  for ( int X = 0 ;
  X <= K ;
  X ++ ) {
    for ( int Y = 0 ;
    Y <= K ;
    Y ++ ) {
      int Z = S - X - Y ;
      if ( 0 <= Z && Z <= K ) {
        ans ++ ;
      }
    }
  }
  return ans ;
}
