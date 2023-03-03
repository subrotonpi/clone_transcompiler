public static int T = Integer . parseInt ( Scanner in ) {
  for ( int t : xrange ( 1 , T + 1 ) ) {
    System . out . println ( "Case #" + t + ":" ) ;
    in . nextLine ( ) ;
    int [ ] A = map ( in . nextLine ( ) . split ( " " ) ) ;
    int s = Arrays . stream ( A ) . filter ( y -> y < i ) . count ( ) ;
    if ( s < 484 ) System . out . println ( "BAD" ) ;
    else System . out . println ( "GOOD" ) ;
  }
  return T ;
}
