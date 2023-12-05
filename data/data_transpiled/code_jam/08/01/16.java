public static void main ( String filename ) throws IOException {
  Scanner input = new Scanner ( new InputStreamReader ( System . in ) ) ;
  filename = input . next ( ) ;
  PrintWriter output = new PrintWriter ( new BufferedWriter ( new OutputStreamWriter ( System . out ) ) ) ;
  int numCases = new Integer ( input . nextInt ( ) ) . intValue ( ) ;
  for ( int testCase = 0 ;
  testCase < numCases ;
  testCase ++ ) {
    List < String > engines = new ArrayList < String > ( ) ;
    int numEngines = new Integer ( input . nextInt ( ) ) . intValue ( ) ;
    for ( int e = 0 ;
    e < numEngines ;
    e ++ ) {
      String engName = input . next ( ) ;
      engines . add ( engName . trim ( ) ) ;
    }
    int numQueries = new Integer ( input . nextInt ( ) ) . intValue ( ) ;
    List < String > queries = new ArrayList < String > ( ) ;
    for ( int q = 0 ;
    q < numQueries ;
    q ++ ) {
      String qString = input . next ( ) ;
      queries . add ( qString . trim ( ) ) ;
    }
    int switches = 0 ;
    boolean done = false ;
    while ( queries . size ( ) > 0 ) {
      int [ ] dist = new int [ numEngines ] ;
      Iterator < String > it = engines . iterator ( ) ;
      while ( it . hasNext ( ) ) {
        String engName = it . next ( ) ;
        try {
          dist [ count ] = queries . indexOf ( engName ) ;
        }
        catch ( NumberFormatException e ) {
          done = true ;
          break ;
        }
      }
      if ( done ) break ;
      switches = switches + 1 ;
      int maxDist = Collections . max ( dist ) ;
      queries = queries . subList ( maxDist , queries . size ( ) ) ;
    }
    System . out . println ( "Case #" + ( testCase + 1 ) + ": " + switches ) ;
    output . println ( "Case #" + ( testCase + 1 ) + ": " + switches ) ;
  }
}
