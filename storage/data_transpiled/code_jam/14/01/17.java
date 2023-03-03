public static int T = Integer . parseInt ( Scanner in ) {
  for ( int t : xrange ( T ) ) {
    int A = in . nextInt ( ) ;
    int [ ] ans = null ;
    for ( int i : xrange ( 4 ) ) {
      String s = in . next ( ) ;
      if ( i + 1 == A ) ans = ArrayUtil . parseInt ( s . split ( " " ) ) ;
    }
    A = in . nextInt ( ) ;
    int [ ] ans2 = null ;
    for ( int i : xrange ( 4 ) ) {
      String s = in . next ( ) ;
      if ( i + 1 == A ) ans2 = ArrayUtil . parseInt ( s . split ( " " ) ) ;
    }
    Arrays . sort ( ans ) ;
    String y = "Volunteer cheated!" ;
    if ( ans . length == 1 ) y = String . valueOf ( ans [ 0 ] ) ;
    else if ( ans . length > 1 ) y = "Bad magician!" ;
    System . out . println ( "Case #" + ( t + 1 ) + ": " + y ) ;
  }
  return T ;
}
