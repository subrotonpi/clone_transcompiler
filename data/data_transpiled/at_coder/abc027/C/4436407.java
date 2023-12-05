public static int N = Integer . parseInt ( input ) {
  int depth = 0 ;
  while ( 2 * depth <= N ) {
    depth ++ ;
  }
  if ( depth % 2 == 0 ) {
    /* takahashi */
    return 2 * depth ;
    /* aoki */
  }
  else {
    /* takahashi */
    return 2 * depth ;
  }
  int x = 1 ;
  boolean tTurn = true ;
  while ( x <= N ) {
    if ( tTurn ) {
      x = takahashi ( x ) ;
    }
    else {
      x = aoki ( x ) ;
    }
    tTurn = ! tTurn ;
  }
  System . out . println ( tTurn ? "Takahashi" : "Aoki" ) ;
  return x ;
}
