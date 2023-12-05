public static int T = Integer . parseInt ( Scanner in ) {
  for ( int tt = 0 ;
  tt < T ;
  tt ++ ) {
    int result = 0 ;
    int ll = in . nextInt ( ) ;
    int [ ] A = ArrayUtil . newIntArray ( ) ;
    for ( int i = 0 ;
    i < ll ;
    i ++ ) {
      A [ i ] = in . nextInt ( ) ;
    }
    while ( A . length > 0 ) {
      int val = Math . min ( ( val = in . nextInt ( ) ) , idx ) ;
      int idx = A [ idx ] ;
      result += Math . min ( idx , A . length - idx - 1 ) ;
      A = Arrays . copyOf ( A , idx ) ;
    }
    System . out . println ( "Case #" + Integer . toString ( tt + 1 ) + ": " + Integer . toString ( result ) ) ;
  }
  return result ;
}
