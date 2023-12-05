static final private String line ( ) {
  return System . console ( ) . readLine ( ) ;
  /* read list of strings */
  List < String > list = CollectionUtils . toList ( line ( ) . split ( " " ) ) ;
  if ( className . equals ( "org.apache.flink.util.TestRun" ) ) {
    int numberOfCases = Integer . parseInt ( line ( ) ) ;
    for ( int caseNumber = 0 ;
    caseNumber < numberOfCases ;
    caseNumber ++ ) {
      int N = Integer . parseInt ( line ( ) ) ;
      int K = Integer . parseInt ( line ( ) ) ;
      int B = Integer . parseInt ( line ( ) ) ;
      int T = Integer . parseInt ( line ( ) ) ;
      int X = Integer . parseInt ( line ( ) ) ;
      int V = Integer . parseInt ( line ( ) ) ;
      List < Integer > makesIt = new ArrayList < > ( ) ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        makesIt . add ( ( B - X + V - 1 ) / V <= T ) ;
      }
      int alreadyThere = 0 ;
      while ( makesIt . size ( ) > 0 && makesIt . get ( makesIt . size ( ) - 1 ) != null ) {
        alreadyThere ++ ;
        makesIt . remove ( makesIt . size ( ) - 1 ) ;
      }
      int needed = 0 ;
      int i = makesIt . size ( ) - 1 ;
      while ( i >= 0 && alreadyThere < K ) {
        if ( makesIt . get ( i ) != null ) {
          needed += makesIt . size ( ) - i - 1 ;
          makesIt . remove ( i ) ;
          alreadyThere ++ ;
        }
        else {
          i -- ;
        }
      }
      System . out . println ( "Case #" + ( caseNumber + 1 ) + ": " + ( alreadyThere >= K ? " " + needed : "IMPOSSIBLE" ) ) ;
    }
  }
  return list . get ( 0 ) ;
}
