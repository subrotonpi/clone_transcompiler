static final Scanner getScanner ( ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  scanner . setCheckInterval ( 10000 ) ;
  final double PI = arccos ( - 1 ) ;
  final double PI_2 = arccos ( - 1 ) / 2 ;
  /* solve the number of cases */
  final int P = scanner . nextInt ( ) ;
  final int K = scanner . nextInt ( ) ;
  final int L = scanner . nextInt ( ) ;
  final int [ ] frq = new int [ L ] ;
  final ArrayList < Integer > frq2 = new ArrayList < Integer > ( ) ;
  for ( int i = 0 ;
  i <= frq . length ;
  i ++ ) {
    frq2 . add ( new Integer ( frq [ i ] ) ) ;
  }
  Collections . sort ( frq2 ) ;
  Collections . reverse ( frq2 ) ;
  final int [ ] keys = new int [ K ] ;
  int curk = 0 ;
  double total = 0 ;
  for ( Integer k : frq2 ) {
    if ( keys [ curk ] > P ) {
      System . out . printf ( "Case #%d: Impossible%n" , caseNum ) ;
      return ;
    }
    keys [ curk ] ++ ;
    total += k . intValue ( ) * keys [ curk ] ;
    curk ++ ;
    if ( curk >= keys . length ) curk = 0 ;
  }
  System . out . printf ( "Case #%d: %s%n" , caseNum , total ) ;
  final int casesCount = Integer . parseInt ( scanner . nextLine ( ) ) ;
  boolean first = true ;
  for ( int testCase = 1 ;
  testCase <= casesCount ;
  testCase ++ ) {
    if ( ( first ) && ( testCase == PI ) ) first = false ;
    else System . out . println ( "" ) ;
    solve ( testCase ) ;
  }
  return scanner ;
}
