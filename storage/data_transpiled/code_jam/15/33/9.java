private static int [ ] readLine ( ) {
  return ArrayUtil . toIntArray ( readLine ( ) . trim ( ) . split ( " " ) ) ;
  /* solve the number of numbers */
  int c = readInt ( ) ;
  int d = readInt ( ) ;
  int v = readInt ( ) ;
  int [ ] dd = readLine ( ) . split ( " " ) ;
  int need = 0 ;
  int can = 0 ;
  int i = 0 ;
  while ( can < v ) {
    if ( i < d && dd [ i ] <= can + 1 ) {
      can += dd [ i ] * c ;
      i ++ ;
    }
    else {
      need ++ ;
      can += ( can + 1 ) * c ;
    }
  }
  /* main the loop */
  int t = Integer . parseInt ( readLine ( ) . trim ( ) ) ;
  for ( int i : xrange ( 1 , t + 1 ) ) {
    int ret = solve ( ) ;
    System . out . println ( "Case #" + i + ":" + ret ) ;
  }
  if ( __name__ . equals ( "main" ) ) {
    /* main the loop */
  }
  return null ;
}
