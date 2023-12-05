public static final String [ ] [ ] loadCases ( String path ) {
  List < int [ ] > caseList = new ArrayList < int [ ] > ( ) ;
  try {
    BufferedReader bufferedReader = new BufferedReader ( new FileReader ( path ) ) ;
    int caseNum = Integer . parseInt ( bufferedReader . readLine ( ) . trim ( ) ) ;
    for ( int i = 0 ;
    i <= caseNum ;
    i ++ ) {
      String [ ] testCase = StreamUtil . splitString ( bufferedReader . readLine ( ) . trim ( ) , " " ) ;
      caseList . add ( Arrays . copyOf ( testCase , i ) ) ;
    }
  }
  catch ( IOException e ) {
    e . printStackTrace ( ) ;
  }
  /* Calculate case */
  int X = testCase [ 0 ] ;
  int R = testCase [ 1 ] ;
  int C = testCase [ 2 ] ;
  if ( R > C ) {
    R = testCase [ 2 ] ;
    C = testCase [ 1 ] ;
  }
  if ( ( R * C ) % X != 0 || X >= 7 ) {
    return false ;
  }
  else if ( X == 1 || X == 2 ) {
    return true ;
  }
  else if ( X == 3 ) {
    if ( R == 1 ) {
      return false ;
    }
    else {
      return true ;
    }
  }
  else if ( X == 4 ) {
    if ( R < 3 ) {
      return false ;
    }
    else {
      return true ;
    }
  }
  else if ( X == 5 ) {
    if ( R < 3 ) {
      return false ;
    }
    else if ( R == 3 ) {
      if ( C == 5 ) {
        return false ;
      }
      else {
        return true ;
      }
    }
    else {
      return true ;
    }
  }
  else if ( X == 6 ) {
    if ( R < 4 ) {
      return false ;
    }
    else {
      return true ;
    }
  }
  if ( className . equals ( "java.util.jar" ) ) {
    if ( args . length != 3 ) {
      System . err . println ( "Usage: q2.jar inputFile outputFile" ) ;
      System . exit ( 0 ) ;
    }
    String inputFile = args [ 0 ] ;
    String outputFile = args [ 1 ] ;
    caseList = loadCases ( inputFile ) ;
    PrintWriter outputStream = null ;
    int caseId = 1 ;
    for ( int [ ] testCase : caseList ) {
      boolean G_Win = calculateCase ( testCase ) ;
      outputStream . println ( "Case #" + caseId + ": " + ( G_Win == true ? "GABRIEL" : "RICHARD" )