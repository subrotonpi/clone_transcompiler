public static void readFile ( File inputFile ) throws IOException {
  BufferedReader reader = new BufferedReader ( new FileReader ( inputFile ) ) ;
  String line = reader . readLine ( ) ;
  reader . close ( ) ;
  FileWriter outputFile = new FileWriter ( "C-large.out" ) ;
  int numTests = Integer . parseInt ( line ) ;
  for ( int i = 1 ;
  i <= numTests ;
  i ++ ) {
    Arrays . fill ( matrix , "c" ) ;
    int c = Integer . parseInt ( line ) ;
    int m = Integer . parseInt ( line ) ;
    for ( int j = 0 ;
    j < r ;
    j ++ ) {
      matrix [ 0 ] [ j ] = "." ;
    }
  }
  else if ( m % 2 == 0 && r * c - m > 2 ) {
    works = true ;
    for ( int j = 0 ;
    j < ( r * c - m ) / 2 ;
    j ++ ) {
      matrix [ 0 ] [ j ] = "." ;
    }
    matrix [ 0 ] [ 0 ] = "c" ;
  }
  else if ( r * c - m == 1 ) {
    List < Integer > order = new ArrayList < Integer > ( ) ;
    for ( int i = 0 ;
    i < r ;
    i ++ ) {
      order . add ( new Integer ( i ) ) ;
    }
    matrix [ 0 ] [ 0 ] = "c" ;
  }
  else if ( m % 2 == 0 && r * c - m > 2 ) {
    works = true ;
    matrix [ 0 ] = new String [ ] {
      "." , "." }
      ;
    }
    else if ( m % 2 == 0 && r * c - m > 2 ) {
      works = true ;
      for ( int j = 0 ;
      j < ( r * c - m ) / 2 ;
      j ++ ) {
        matrix [ 0 ] [ j ] = "." ;
      }
      matrix [ 0 ] [ 0 ] = "c" ;
    }
    else if ( m % 2 == 0 && c * c - m > 3 ) {
      works = true ;
      for ( int j = 0 ;
      j < matrix . size ( ) ;
      j ++ ) {
        matrix [ 0 ] [ j ] = "." ;
      }
      matrix [ 1 ] [ j ] = "." ;
    }
    else if ( m % 2 == 0 && c * c - m > 2 ) {
      works = true ;
      for ( int j = 0 ;
      j < matrix . size ( ) ;
      j ++ ) {
        matrix [ 0 ] [ j ] = "."