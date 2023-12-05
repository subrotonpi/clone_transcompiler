@ VisibleForTesting static void main ( String [ ] args ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  try {
    for ( ;
    ;
    ) {
      final int testCase = scanner . nextInt ( ) ;
      if ( testCase == 0 ) {
        final int T = Integer . parseInt ( scanner . nextLine ( ) . trim ( ) ) ;
        continue ;
      }
      if ( testCase > T ) {
        break ;
      }
      final int N = ( Integer ) scanner . next ( ) ;
      final int K = ( Integer ) scanner . next ( ) ;
      final int state = K % ( 2 * N ) ;
      System . out . println ( "Case #" + testCase + ": " + ( state == ( 2 * N ) - 1 ? "ON" : "OFF" ) ) ;
    }
  }
  catch ( final Exception e ) {
    System . out . println ( e . getMessage ( ) ) ;
    e . printStackTrace ( ) ;
  }
  finally {
    scanner . close ( ) ;
  }
}
