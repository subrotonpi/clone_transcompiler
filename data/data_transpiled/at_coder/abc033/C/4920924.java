public static int formula ( @ Nonnull String S ) {
  int t = 0 ;
  boolean inMul = false ;
  int count = 0 ;
  for ( char c : S . toCharArray ( ) ) {
    switch ( c ) {
      case '*' : inMul = true ;
      break ;
      case '+' : inMul = false ;
      break ;
      default : if ( inMul ) {
        t *= Integer . parseInt ( c ) ;
      }
      else {
        if ( t > 0 ) {
          count ++ ;
        }
        t = Integer . parseInt ( c ) ;
      }
    }
  }
  return count + ( t > 0 ? 1 : 0 ) ;
}
