private static String bGrid ( int H , int W , String [ ] [ ] Grid ) {
  String [ ] [ ] memo = new String [ H ] [ W ] ;
  for ( int r = 0 ;
  r < H ;
  r ++ ) {
    memo [ r ] [ c ] = null ;
  }
  /* Check for move */
  for ( int c = 0 ;
  c < W ;
  c ++ ) {
    /* Check for first move */
    if ( ! canMove ( r , c ) ) {
      return true ;
    }
    if ( memo [ r ] [ c ] != null ) {
      return memo [ r ] [ c ] ;
    }
    boolean result = ! Arrays . equals ( grid , r + 1 , c + 1 , r + 1 , c + 1 ) ? true : false ;
    memo [ r ] [ c ] = result ;
  }
  return "First" . equals ( grid [ 0 ] ) ? "Second" : "First" ;
}
