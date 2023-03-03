public static String bGrid ( int H , int W , String [ ] Grid ) {
  String [ ] [ ] memo = new String [ H ] [ W ] ;
  /* Check for move */
  for ( int r = 0 ;
  r < H && c < W && Grid [ r ] [ c ] . equals ( "." ) ;
  ) {
    /* Check for a single character */
    if ( ! canMove ( r , c ) ) {
      /* Return true if the memo[r][c] is not null */
      return memo [ r ] [ c ] ;
    }
    boolean result = false ;
    if ( ! canMove ( r + 1 , c ) ) {
      result = true ;
    }
    if ( ! canMove ( r + 1 , c + 1 ) ) {
      result = true ;
    }
    memo [ r ] [ c ] = result ;
    return result ? "First" : "Second" ;
  }
}
