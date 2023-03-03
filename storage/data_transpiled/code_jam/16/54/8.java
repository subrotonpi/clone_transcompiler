public static int T = Integer . parseInt ( scanner . nextLine ( ) ) {
  for ( int TK : xrange ( T ) ) {
    System . out . println ( "Case #" + ( TK + 1 ) + ":" ) ;
    int N = Integer . parseInt ( scanner . nextLine ( ) ) ;
    int L = Integer . parseInt ( scanner . nextLine ( ) ) ;
    String G = scanner . nextLine ( ) ;
    String B = scanner . nextLine ( ) ;
    if ( G . contains ( "1" * L ) ) {
      System . out . println ( "IMPOSSIBLE" ) ;
      continue ;
    }
    if ( L == 1 ) {
      System . out . println ( "0 0?" ) ;
    }
    else {
      String a = "?" ;
      String b = "10?1" + ( "01" * L ) ;
      System . out . println ( a + " " + b ) ;
    }
  }
  return N ;
}
