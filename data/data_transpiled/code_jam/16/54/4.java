public static int T = Integer . parseInt ( input ) {
  for ( int tc = 1 ;
  tc <= T ;
  tc ++ ) {
    int N = Integer . parseInt ( input . nextLine ( ) ) ;
    int L = Integer . parseInt ( input . nextLine ( ) ) ;
    List < String > G = new LinkedList < > ( ) ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) G . add ( input . nextLine ( ) ) ;
    String B = input . nextLine ( ) . trim ( ) ;
    if ( G . contains ( B ) ) {
      System . out . println ( "Case #" + tc + ": IMPOSSIBLE" ) ;
      continue ;
    }
    if ( L == 1 ) {
      System . out . println ( "Case #" + tc + ": " + "0" + " " + "?" ) ;
      continue ;
    }
    System . out . println ( "Case #" + tc + ": " + "10" * 27 + "?" + "10" * 27 + "?" ) ;
  }
  return T ;
}
