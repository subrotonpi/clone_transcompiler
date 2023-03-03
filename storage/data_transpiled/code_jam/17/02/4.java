static final String solve ( String inputFileName ) {
  if ( args . length ( ) != 2 ) {
    System . err . println ( "usage: ./a.java <input_file_name>" ) ;
    exit ( ) ;
  }
  String inputFileName = args [ 0 ] ;
  String outputFileName ;
  if ( inputFileName . length ( ) > 3 && inputFileName . endsWith ( ".in" ) ) {
    outputFileName = inputFileName . substring ( 0 , inputFileName . length ( ) - 3 ) + ".out" ;
  }
  else {
    outputFileName = inputFileName + ".out" ;
  }
  /* solve N */
  List < String > listN = new LinkedList < > ( ) ;
  try {
    listN . add ( String . valueOf ( N ) ) ;
  }
  catch ( NumberFormatException e ) {
    System . err . println ( "Error parsing input file " + inputFileName ) ;
    System . exit ( 1 ) ;
  }
  for ( int i = xrange ( listN . size ( ) - 1 , 0 , - 1 ) ;
  i >= 0 ;
  i -- ) {
    if ( Integer . parseInt ( listN . get ( i ) ) < Integer . parseInt ( listN . get ( i - 1 ) ) ) {
      int num2Del = Integer . parseInt ( new String ( listN . subList ( i , i + 1 ) ) ) + 1 ;
      return solve ( N - num2Del ) ;
    }
  }
  List < String > results = new ArrayList < > ( ) ;
  try {
    BufferedReader reader = new BufferedReader ( new FileReader ( inputFileName ) ) ;
    int T = Integer . parseInt ( reader . readLine ( ) ) ;
    for ( int i = xrange ( T ) ;
    i >= 0 ;
    i -- ) {
      String line = reader . readLine ( ) ;
      int N = Integer . parseInt ( line ) ;
      String ret = String . valueOf ( solve ( N ) ) ;
      results . add ( ret ) ;
    }
  }
  catch ( FileNotFoundException e ) {
    System . err . println ( "Error reading input file " + inputFileName ) ;
    System . exit ( 1 ) ;
  }
  catch ( IOException e ) {
    System . err . println ( "Error reading input file " + inputFileName ) ;
    System . exit ( 1 ) ;
  }
  try {
    FileWriter fw = new FileWriter ( outputFileName ) ;
    for ( int i = 0 ;
    i < results . size ( ) ;
    i ++ ) {
      String outputString = " Case