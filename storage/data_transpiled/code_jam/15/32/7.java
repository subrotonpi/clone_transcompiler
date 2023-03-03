static final Scanner getScanner ( ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  final int T = scanner . nextInt ( ) ;
  for ( int testId = 0 ;
  testId < T ;
  testId ++ ) {
    System . out . println ( "Case #" + ( testId + 1 ) + ": " + solve ( ) ) ;
  }
  final int [ ] inputInts = new int [ ] {
    Integer . parseInt ( scanner . nextLine ( ) ) }
    ;
    final int [ ] charsBeforeRepeat = new int [ L + 1 ] ;
    for ( int i : xrange ( 1 , L + 1 ) ) {
      if ( scanner . nextLine ( ) . substring ( i ) . equals ( scanner . nextLine ( ) . substring ( 0 , L - i ) ) ) {
        return i ;
      }
    }
    return scanner . nextInt ( ) ;
  }
  