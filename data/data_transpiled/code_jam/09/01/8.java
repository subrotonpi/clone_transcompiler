@ VisibleForTesting static String getExample ( ) throws IOException {
  String [ ] input = System . getProperty ( "line.separator" ) . split ( " " ) ;
  int [ ] specs = new int [ input . length ] ;
  for ( int num = 0 ;
  num < specs . length ;
  num ++ ) specs [ num ] = Integer . parseInt ( input [ num ] ) ;
  L = specs [ 0 ] ;
  D = specs [ 1 ] ;
  N = specs [ 2 ] ;
  String [ ] words = Arrays . copyOfRange ( input , 1 , 1 + D ) ;
  String table = StringEscapeUtils . escapeJava ( "()" ) ;
  int testCase = 1 ;
  for ( int i = 1 + D ;
  i < words . length ;
  i ++ ) {
    String exp = input [ i ] ;
    exp = '^' + exp . trim ( ) . replaceAll ( table , "" ) + '$' ;
    String cmd = "grep '" + exp + "'" ;
    Process p = Runtime . getRuntime ( ) . exec ( cmd ) ;
    final InputStream childIn = p . getInputStream ( ) ;
    final OutputStream childOut = p . getOutputStream ( ) ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      String word = words [ j ] ;
      System . out . println ( childIn >>> j ) ;
      System . out . println ( word ) ;
    }
    childIn . close ( ) ;
    int count = 0 ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      count ++ ;
    }
    System . out . println ( "Case #" + testCase + ": " + count ) ;
    childOut . close ( ) ;
    testCase ++ ;
  }
  return "" ;
}
