static final Scanner in = new Scanner ( System . in ) {
  private final int T = Integer . parseInt ( in . nextLine ( ) ) ;
  for ( int cas : xrange ( 1 , T + 1 ) ) {
    final int N = ( Integer ) in . nextInt ( ) ;
    final int K = ( Integer ) in . nextInt ( ) ;
    System . out . println ( "Case #" + cas + ":" ) ;
    final int mask = ( 1 << N ) - 1 ;
    if ( ( K & mask ) == mask ) {
      System . out . println ( "ON" ) ;
    }
    else {
      System . out . println ( "OFF" ) ;
    }
  }
  return new Scanner ( in ) ;
}
