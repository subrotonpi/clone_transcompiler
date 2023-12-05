public static final String [ ] args ( String [ ] args ) {
  final String inputFileName ;
  if ( args . length != 2 ) {
    System . out . println ( "usage: ./a.java <input_file_name>" ) ;
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
  ArrayList < String > results = new ArrayList < String > ( ) ;
  try {
    BufferedReader reader = new BufferedReader ( new FileReader ( inputFileName ) ) ;
    int T = Integer . parseInt ( reader . readLine ( ) ) ;
    for ( int i = 0 ;
    i < xrange ( T ) ;
    i ++ ) {
      String line = reader . readLine ( ) ;
      String S = line . split ( "\\s+" ) ;
      int K = Integer . parseInt ( line . split ( "\\s+" ) [ 0 ] ) ;
      int len = S . length ( ) ;
      int K = Integer . parseInt ( K ) ;
      int ret = 0 ;
      for ( int j = 0 ;
      j < xrange ( len - K + 1 ) ;
      j ++ ) {
        if ( S . charAt ( j ) == '-' ) {
          for ( int k = 0 ;
          k < xrange ( K ) ;
          k ++ ) {
            if ( S . charAt ( j + k ) == '-' ) {
              S . setChar ( j + k , '+' ) ;
            }
            else {
              S . setChar ( j + k , '-' ) ;
            }
          }
          ret ++ ;
        }
      }
      ret = Integer . toString ( ret ) ;
      for ( int s : S . split ( "\\s+" ) ) {
        if ( s == '-' ) {
          ret = "IMPOSSIBLE" ;
          break ;
        }
      }
      results . add ( ret ) ;
    }
  }
  catch ( FileNotFoundException e ) {
    e . printStackTrace ( ) ;
  }
  catch ( IOException e ) {
    e . printStackTrace ( ) ;
  }
  catch ( NumberFormatException e ) {
    e . printStackTrace ( ) ;
  }
  catch ( NumberFormatException e ) {
    e . printStackTrace ( ) ;
  }
  return results . toArray ( new String [ results . size ( ) ] ) ;
}
