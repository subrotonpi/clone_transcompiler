static String getLine ( String filename ) throws IOException {
  BufferedReader inputFile = new BufferedReader ( new FileReader ( filename ) ) ;
  String line ;
  while ( ( line = inputFile . readLine ( ) ) != null ) {
    yield ( line ) ;
  }
  inputFile . close ( ) ;
  String inputFilename = "A-large.in" ;
  String outputFilename = "A-large.txt" ;
  TokenIterator tokenIterator = getLine ( inputFilename ) ;
  {
    String get = tokenIterator . next ( ) ;
    int i ;
    int n ;
    /* Get the number of tokens in the input file */
    int i ;
    int j ;
    for ( i = 0 ;
    i < caseNum ;
    i ++ ) {
      tmp = get . split ( " " ) ;
      a = Integer . parseInt ( tmp [ 0 ] ) ;
      n = Integer . parseInt ( tmp [ 1 ] ) ;
      tmp = get . split ( " " ) ;
      x = new int [ n ] ;
      for ( j = 0 ;
      j < n ;
      j ++ ) x [ j ] = Integer . parseInt ( tmp [ j ] ) ;
    }
  }
  String output = "Case #" + ( i + 1 ) + ": " + ans ;
  outputFile . println ( output ) ;
  return output ;
}
