@ Sys public static Pair < Boolean , Double > findOpeningParen ( String content ) {
  int depth = 0 ;
  Pair < Boolean , Double > p = new Pair < Boolean , Double > ( ) ;
  for ( int i = 0 ;
  i < content . length ( ) ;
  i ++ ) {
    char c = content . charAt ( i ) ;
    if ( c == '(' ) {
      if ( depth == 0 ) {
        p . add ( i ) ;
      }
      depth ++ ;
    }
    else if ( c == ')' ) {
      depth -- ;
    }
  }
  return p ;
}
