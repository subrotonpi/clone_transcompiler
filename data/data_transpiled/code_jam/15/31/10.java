private static int [ ] readLine ( ) {
  return ArrayUtil . toIntArray ( readLine ( ) . trim ( ) . split ( " " ) ) ;
  /*solve the number of moves */
  int r = readLine ( ) ;
  int c = readLine ( ) ;
  int w = readLine ( ) ;
  int moves = ( r - 1 ) * ( c / w ) ;
  if ( c >= 2 * w ) {
    int z = ( c / w ) - 1 ;
    moves += z ;
    c -= z * w ;
  }
  if ( c == w ) {
    moves += w ;
  }
  else {
    moves += w + 1 ;
  }
  /*main the code*/
  int t = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
  for ( int i : xrange ( 1 , t + 1 ) ) {
    int ret = solve ( ) ;
    System . out . println ( "Case #" + i + ":" + ret ) ;
  }
  if ( __name__ . equals ( "main" ) ) {
    /*main the code*/
  }
  return new int [ ] {
    r , c , w }
    ;
  }
  