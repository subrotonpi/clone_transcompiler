static final Scanner getScanner ( ) {
  final Scanner scanner = new Scanner ( System . in ) ;
  scanner . setCheckInterval ( 10000 ) ;
  final double PI = arccos ( - 1 ) ;
  final double PI_2 = arccos ( - 1 ) / 2 ;
  /* solve the number of numbers */
  final int n = scanner . nextInt ( ) ;
  final int m = scanner . nextInt ( ) ;
  final double X = scanner . nextDouble ( ) ;
  final double Y = scanner . nextDouble ( ) ;
  final double Z = scanner . nextDouble ( ) ;
  final int [ ] A = new int [ n ] ;
  for ( int i = 0 ;
  i <= m ;
  i ++ ) {
    A [ i ] = Integer . parseInt ( scanner . nextLine ( ) ) ;
  }
  final int [ ] signs = new int [ n ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    signs [ i ] = A [ i % m ] ;
    A [ i % m ] = ( X * A [ i % m ] + Y * ( i + 1 ) ) % Z ;
  }
  int total = 0 ;
  final List < Tuple < Integer , Integer >> aux = new ArrayList < Tuple < Integer , Integer >> ( ) ;
  for ( int i = signs . length - 1 ;
  i >= 0 ;
  i -- ) {
    int count = 1 ;
    for ( Tuple < Integer , Integer > t : aux ) {
      if ( t . _1 > signs [ i ] ) count += t . _2 ;
    }
    aux . add ( new Tuple < Integer , Integer > ( signs [ i ] , count ) ) ;
    total += count ;
  }
  System . out . printf ( "Case #%d: %s%n" , caseNum , total % 1000000007 ) ;
  final int casesCount = Integer . parseInt ( scanner . nextLine ( ) ) ;
  boolean first = true ;
  for ( int testCase = 1 ;
  testCase <= casesCount ;
  testCase ++ ) {
    if ( ( first ) && ( testCase == 0 ) ) first = false ;
    else System . out . println ( "" ) ;
    solve ( testCase ) ;
  }
  return scanner ;
}
