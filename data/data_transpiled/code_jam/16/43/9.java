@ VisibleForTesting static String getSolution ( int R , int C , String testCase , String value ) {
  String problemName = "C" ;
  String testCase = "small" ;
  int attempt = 0 ;
  {
    Set < String > result = new HashSet < > ( ) ;
    Set < Integer > unParsed = new HashSet < > ( ) ;
    unParsed . add ( startingPos ) ;
    while ( unParsed . size ( ) > 0 ) {
      result . add ( new Integer ( i ) ) ;
      unParsed . add ( startingPos ) ;
    }
    if ( c == 4 && y > 0 ) {
      result . add ( new Integer ( y - 1 ) ) ;
    }
    if ( occupiedLocations . contains ( new Integer ( y ) ) && occupiedLocations . contains ( new Integer ( y ) ) && occupiedLocations . contains ( new Integer ( y ) ) ) {
      unParsed . add ( new Integer ( y ) ) ;
    }
    if ( c == 3 && x < R - 1 ) {
      result . add ( new Integer ( x + 1 ) ) ;
    }
    {
      Set < Integer > baseSolution = getBaseSolution ( R , C , courtiers ) ;
      for ( int i = 0 ;
      i < baseSolution . size ( ) ;
      i ++ ) {
        baseSolution . add ( new Integer ( i ) ) ;
      }
      for ( int i = 0 ;
      i < baseSolution . size ( ) ;
      i ++ ) {
        baseSolution . add ( new Integer ( i ) ) ;
      }
      for ( int i = 0 ;
      i < result . size ( ) ;
      i ++ ) {
        for ( int j = 0 ;
        j < result . size ( ) ;
        j ++ ) {
          newSolution . set ( i + 1 , result . get ( i * C + j ) ) ;
        }
      }
      if ( c == 1 && value . equals ( "\\" ) ) {
        result . add ( new Integer ( x ) ) ;
      }
      return "IMPOSSIBLE" ;
    }
    String currentDir = new File ( new File ( Thread . currentThread ( ) . getContextClassLoader ( ) . getResource ( "" ) . getPath ( ) ) . getPath ( ) ) . getAbsolutePath ( ) ;
    if ( testCase . equals ( "large" ) || testCase . equals ( "example" ) ) {
      String inputString = problemName + ( "-" + testCase ) ;
      String outputString = problemName + ( "-" + testCase ) ;
      if ( c == 3 && value . equals ( "\\" ) ) {
        result