static final Scanner getScanner ( ) throws FileNotFoundException {
  FileInputStream in = new FileInputStream ( System . getProperty ( "file.separator" ) ) ;
  int numcases = Integer . parseInt ( in . readLine ( ) ) ;
  char currengine = '\0' ;
  for ( int testCase = xrange ( 1 , numcases + 1 ) ;
  testCase <= numcases ;
  testCase ++ ) {
    int numengines = Integer . parseInt ( in . readLine ( ) ) ;
    String [ ] engines = new String [ xrange ( numengines ) ] ;
    for ( int x = 0 ;
    x < engines . length ;
    x ++ ) engines [ x ] = in . read ( ) . trim ( ) ;
    int numqueries = Integer . parseInt ( in . readLine ( ) ) ;
    String [ ] queries = new String [ xrange ( numqueries ) ] ;
    for ( int x = 0 ;
    x < queries . length ;
    x ++ ) queries [ x ] = in . read ( ) . trim ( ) ;
    int i = 0 ;
    int switches = 0 ;
    while ( true ) {
      String q = queries [ i ] ;
      long long l = 0 ;
      for ( String e : engines ) {
        if ( e . equals ( currengine ) ) continue ;
        try {
          l = q . indexOf ( e ) ;
        }
        catch ( Exception e ) {
          i = numqueries ;
          break ;
        }
        if ( l > long ) long = l ;
      }
      if ( i >= numqueries ) break ;
      switches ++ ;
      currengine = queries [ i + long ] ;
      i = i + long + 1 ;
    }
    System . out . println ( "Case #" + testCase + ": " + switches ) ;
  }
  return new Scanner ( in ) ;
}
