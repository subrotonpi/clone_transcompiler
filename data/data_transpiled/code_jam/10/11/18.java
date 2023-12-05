static private String loadInput ( ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  String text ;
  try {
    scanner . nextLine ( ) ;
  }
  catch ( NoSuchElementException e ) {
    System . out . println ( "No input found" ) ;
    return text ;
  }
  final String output ;
  final String text ;
  final int caseCount = Integer . parseInt ( scanner . nextLine ( ) ) ;
  final String [ ] [ ] testCases = new String [ caseCount ] [ ] ;
  for ( int i = 0 ;
  i < caseCount ;
  i ++ ) {
    final int n = Integer . parseInt ( scanner . nextLine ( ) ) ;
    final int k = Integer . parseInt ( scanner . nextLine ( ) ) ;
    final String board = scanner . nextLine ( ) ;
    text = text . substring ( n ) ;
    testCases [ i ] = new String [ ] {
      n , k , board }
      ;
    }
    return testCases [ 0 ] ;
  }
  