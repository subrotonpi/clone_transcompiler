@ GwtIncompatible ( "java.util.Scanner" ) public static int [ ] line ( ) {
  /* ## in the input line */
  int T = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
  /* ## in the input line */
  int N = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
  for ( T = xrange ( 1 , T + 1 ) ;
  T <= N ;
  T ++ ) {
    int N = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
    int [ ] S = readLine ( ) . split ( " " ) ;
    int A = 0 ;
    while ( S . length > 0 ) {
      int best = 0 ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        if ( S [ i ] < S [ best ] ) {
          best = i ;
        }
      }
      A += Math . min ( best , S . length - best - 1 ) ;
      S = Arrays . copyOf ( S , best ) + S [ best + 1 ] ;
    }
    System . out . println ( "Case #" + T + ": " + A ) ;
  }
  return S ;
}
