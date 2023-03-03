static final Scanner getScanner ( ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  final int n = scanner . nextInt ( ) ;
  final int k = scanner . nextInt ( ) ;
  final int [ ] l = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  ++ i ) {
    l [ i ] = scanner . nextInt ( ) ;
  }
  for ( int curcase = 1 ;
  curcase <= Integer . MAX_VALUE ;
  ++ curcase ) {
    final String n = scanner . next ( ) ;
    final String k = scanner . next ( ) ;
    final int power = 2 * Integer . parseInt ( n ) ;
    if ( ( Integer . parseInt ( k ) + 1 ) % power == 0 ) {
      System . out . println ( "Case #" + curcase + ": ON" ) ;
    }
    else {
      System . out . println ( "Case #" + curcase + ": OFF" ) ;
    }
  }
  return scanner ;
}
