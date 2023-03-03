public static String [ ] [ ] getSolMatrix ( String filename ) throws IOException {
  String outputname = filename + "out.txt" ;
  BufferedReader inFile = new BufferedReader ( new FileReader ( filename ) ) ;
  BufferedWriter outFile = new BufferedWriter ( new FileWriter ( outputname ) ) ;
  int numCases = Integer . parseInt ( inFile . readLine ( ) ) ;
  /* Get the solution matrix */
  int [ ] [ ] solution = new int [ R ] [ C ] ;
  for ( int j = 0 ;
  j < R ;
  j ++ ) {
    for ( int k = 0 ;
    k < C ;
    k ++ ) {
      if ( tiles [ j ] [ k ] == 1 ) {
        if ( j == R - 1 || k == C - 1 ) {
          return new int [ ] [ ] {
          }
          , false ;
        }
        else if ( ( tiles [ j ] [ k + 1 ] == 0 ) || ( tiles [ j ] [ k + 1 ] == 2 ) || ( tiles [ j + 1 ] [ k ] == 0 ) || ( tiles [ j + 1 ] [ k + 1 ] == 2 ) || ( tiles [ j + 1 ] [ k + 1 ] == 0 ) || ( tiles [ j + 1 ] [ k + 1 ] == 2 ) ) {
          return new int [ ] [ ] {
          }
          , false ;
        }
        else {
          tiles [ j ] [ k ] = 2 ;
          tiles [ j + 1 ] [ k ] = 2 ;
          tiles [ j ] [ k + 1 ] = 2 ;
          tiles [ j + 1 ] [ k + 1 ] = 2 ;
          solution [ j ] [ k ] = 1 ;
          solution [ j + 1 ] [ k ] = 2 ;
          solution [ j + 1 ] [ k + 1 ] = 2 ;
          solution [ j + 1 ] [ k + 1 ] = 1 ;
        }
      }
    }
    /* Get the solution matrix */
    for ( int i = 0 ;
    i < numCases ;
    i ++ ) {
      String [ ] nextLine = inFile . readLine ( ) . split ( " " ) ;
      R = Integer . parseInt ( nextLine [ 0 ] ) ;
      C = Integer . parseInt ( nextLine [ 1 ] ) ;
      int [ ] [ ] tiles = new int [ R ] [ C ] ;
      for ( int j = 0 ;
      j < R ;
      j ++ ) {
        nextLine = inFile . readLine ( ) ;
        for ( int k = 0 ;
        k < C ;
        k ++ ) {
          if ( nextLine [ k ] == '