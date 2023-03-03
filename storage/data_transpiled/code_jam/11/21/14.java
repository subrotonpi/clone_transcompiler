static String getToken ( String filename ) throws IOException {
  BufferedReader inputFile = new BufferedReader ( new FileReader ( filename ) ) ;
  String line ;
  while ( ( line = inputFile . readLine ( ) ) != null ) {
    String [ ] tokens = line . split ( " " ) ;
    for ( String token : tokens ) {
      if ( token . length ( ) != 0 ) {
        return token ;
      }
    }
  }
  inputFile . close ( ) ;
  String inputFilename = "A-large.in" ;
  String outputFilename = "A-large.txt" ;
  Iterator < String > tokenIterator = getToken ( inputFilename ) ;
  {
    String s ;
    /* Get the token from the input file */
    tokenIterator . next ( ) ;
    /* Get the token from the input file */
    outputFile = new PrintWriter ( outputFilename ) ;
    int caseNum = Integer . parseInt ( s ) ;
    for ( int i = 0 ;
    i < caseNum ;
    i ++ ) {
      int n = Integer . parseInt ( s ) ;
      String [ ] x = new String [ n ] ;
      int [ ] wins = new int [ n ] ;
      int [ ] losses = new int [ n ] ;
      double [ ] wp = new double [ n ] ;
      double [ ] owp = new double [ n ] ;
      double [ ] oowp = new double [ n ] ;
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        s = s . substring ( 0 , j ) ;
        x [ j ] = s ;
        wins [ j ] = 0 ;
        losses [ j ] = 0 ;
        for ( int j = 0 ;
        j < n ;
        j ++ ) {
          if ( s . charAt ( j ) == '0' ) losses [ j ] ++ ;
          else if ( s . charAt ( j ) == '1' ) wins [ j ] ++ ;
        }
        wp [ j ] = ( double ) wins [ j ] / ( wins [ j ] + losses [ j ] ) ;
      }
      for ( int j = 0 ;
      j < n ;
      j ++ ) {
        int count = 0 ;
        int sumwp = 0 ;
        s = x [ j ] ;
        for ( int j = 0 ;
        j < n ;
        j ++ ) {
          if ( s . charAt ( j ) == '0' || s . charAt ( j ) == '1' ) {
            sumwp += owp [ j ] ;
            count ++ ;
          }
        }
        oowp [ j ] = ( double ) sumwp / count ;
      }
    }
  }
  return inputFilename ;
  