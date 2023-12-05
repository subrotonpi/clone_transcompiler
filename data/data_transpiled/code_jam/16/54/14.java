private static String solve ( String gs , String b ) throws IOException {
  assert Arrays . asList ( b . split ( " " ) ) . contains ( "1" ) ;
  if ( gs . contains ( b ) ) {
    return "IMPOSSIBLE" ;
  }
  else {
    return "0?" + ( b . length ( ) > 1 ? "1" : "0" ) ;
  }
  if ( Class . isEnum ( ) ) {
    final InputStream is = new FileInputStream ( System . getProperty ( "test.class" ) ) ;
    final BufferedReader br = new BufferedReader ( new InputStreamReader ( is ) ) ;
    final String line ;
    int numCases = Integer . parseInt ( br . readLine ( ) ) ;
    for ( int i = 0 ;
    i < xrange ( numCases ) ;
    i ++ ) {
      final int n = Integer . parseInt ( br . readLine ( ) ) ;
      final int l = Integer . parseInt ( br . readLine ( ) ) ;
      gs = br . readLine ( ) . split ( " " ) ;
      b = br . readLine ( ) ;
      System . out . println ( "Case #" + ( i + 1 ) + ": " + solve ( gs , b ) ) ;
    }
  }
  return null ;
}
