public static final Scanner getScanner ( ) {
  final Scanner inputFile = new Scanner ( System . in ) ;
  final int count = Integer . parseInt ( inputFile . nextLine ( ) ) ;
  int lineNumber = 1 ;
  while ( count -- > 0 ) {
    final String n = inputFile . nextLine ( ) ;
    final String k = inputFile . nextLine ( ) ;
    n = Integer . parseInt ( n ) ;
    k = Integer . parseInt ( k ) ;
    System . out . println ( "Case #" + lineNumber + ":" + " " + n ) ;
    final double total = Math . pow ( 2 , n ) ;
    if ( k % total == total - 1 ) {
      System . out . println ( "ON" ) ;
    }
    else {
      System . out . println ( "OFF" ) ;
    }
    lineNumber ++ ;
  }
  return new Scanner ( inputFile ) ;
}
