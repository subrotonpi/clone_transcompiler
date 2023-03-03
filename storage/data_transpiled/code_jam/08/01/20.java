@ Sys public static PrintStream printStream ( ) throws IOException {
  /* TODO Auto-generated method stub */
  int numCases = Integer . parseInt ( readLine ( ) ) ;
  for ( int caseNum = 0 ;
  caseNum < numCases ;
  caseNum ++ ) {
    int numEngines = Integer . parseInt ( readLine ( ) ) ;
    List < String > engines = new ArrayList < String > ( ) ;
    for ( int i = 0 ;
    i < numEngines ;
    i ++ ) {
      String engine = readLine ( ) ;
      engines . add ( engine ) ;
    }
    int numQueries = Integer . parseInt ( readLine ( ) ) ;
    List < String > queries = new ArrayList < String > ( ) ;
    for ( int i = 0 ;
    i < numQueries ;
    i ++ ) {
      String query = readLine ( ) ;
      queries . add ( query ) ;
    }
    int numSwitches = 0 ;
    Set < String > occurrence = new HashSet < String > ( ) ;
    for ( String query : queries ) {
      occurrence . add ( query ) ;
      if ( occurrence . size ( ) == numEngines ) {
        occurrence = new HashSet < String > ( ) ;
        occurrence . add ( query ) ;
        numSwitches ++ ;
      }
    }
    System . out . println ( "Case #" + ( caseNum + 1 ) + ": " + numSwitches ) ;
  }
  return new PrintStream ( new String [ ] {
  }
  ) ;
}
