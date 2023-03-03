public static int solve ( int me , int [ ] others ) {
  if ( me <= 1 ) {
    return others . length ;
  }
  Arrays . sort ( others ) ;
  int best = others . length ;
  int remaining = others . length ;
  int added = 0 ;
  for ( int mote : others ) {
    while ( me <= mote ) {
      me += me - 1 ;
      added ++ ;
    }
    me += mote ;
    remaining -- ;
    best = Math . min ( best , remaining + added ) ;
  }
  if ( getClass ( ) . isEnum ( ) ) {
    int ncases = Integer . parseInt ( readLine ( ) ) ;
    for ( int ncase : xrange ( 1 , ncases + 1 ) ) {
      me = Integer . parseInt ( readLine ( ) ) ;
      nothers = Integer . parseInt ( readLine ( ) ) ;
      others = Integer . parseInt ( readLine ( ) ) ;
      System . out . println ( "Case #" + ncase + ": " + solve ( me , others ) ) ;
    }
  }
  return best ;
}
