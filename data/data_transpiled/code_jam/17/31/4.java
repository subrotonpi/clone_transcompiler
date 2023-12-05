static final Scanner getScanner ( ) {
  final List < String > lines = Arrays . asList ( System . getProperty ( "line.separator" ) . split ( " " ) ) ;
  return new Scanner ( new InputStreamReader ( System . in ) ) {
    @ Override public double circle ( double r ) {
      return Math . PI * r * r ;
    }
    @ Override public double height ( List < List < Integer >> heights , int K ) {
      List < Double > s = new ArrayList < > ( ) ;
      for ( List < Integer > h : heights ) {
        s . add ( 2 * Math . PI * h . x * h . y ) ;
      }
      Collections . sort ( s , Collections . reverseOrder ( ) ) ;
      return Double . valueOf ( s . get ( 0 ) ) ;
    }
  }
  ;
  int T = Integer . parseInt ( lines . get ( 0 ) ) ;
  int i = 1 ;
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    int N = Integer . parseInt ( lines . get ( i ++ ) ) ;
    int K = Integer . parseInt ( lines . get ( i ++ ) ) ;
    double res = 0 ;
    List < List < Integer >> pan = new ArrayList < > ( ) ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      int r = Integer . parseInt ( lines . get ( j ++ ) ) ;
      int h = Integer . parseInt ( lines . get ( j ++ ) ) ;
      pan . add ( new ArrayList < > ( r ) ) ;
      pan . add ( new ArrayList < > ( h ) ) ;
    }
    Collections . sort ( pan , Collections . reverseOrder ( ) ) ;
    for ( int j = 0 ;
    j < N - K + 1 ;
    j ++ ) {
      double base = circle ( pan . get ( j ) . doubleValue ( ) ) ;
      double altezza = height ( pan . subList ( ( j + 1 ) , K - 1 ) . doubleValue ( ) + 2 * Math . PI * pan . get ( j ) . x * pan . get ( j ) . y ) ;
      double area = base + altezza ;
      res = Math . max ( res , area ) ;
    }
    System . out . println ( "Case #" + ( t + 1 ) + ": " + res ) ;
  }
}
