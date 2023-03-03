public static void for ( int case = xrange ( 1 , input ) ;
case <= xrange ( ) ;
case ++ ) {
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  L = Integer . parseInt ( input . nextLine ( ) ) ;
  String G = input . nextLine ( ) ;
  String B = input . nextLine ( ) ;
  System . out . println ( "Case #" + testCase + ":" + " " + N ) ;
  if ( G . contains ( B ) ) System . out . println ( "IMPOSSIBLE" ) ;
  else {
    if ( L > 1 ) System . out . println ( "0?" + L + "1" ) ;
    else System . out . println ( "? 0" ) ;
  }
}
