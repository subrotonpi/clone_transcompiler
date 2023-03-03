public static final String getCamelCase ( String input ) throws IOException {
  BufferedReader is = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  int nks = Integer . parseInt ( is . readLine ( ) ) ;
  for ( int ks = 1 ;
  ks <= nks ;
  ks ++ ) {
    String org = is . readLine ( ) ;
    if ( org . length ( ) > 0 ) org = org . substring ( 0 , org . length ( ) - 1 ) ;
    HashMap < Character , Integer > ccnt = new HashMap < Character , Integer > ( ) ;
    for ( char c : org . toCharArray ( ) ) {
      if ( c == '\n' ) continue ;
      try {
        ccnt . put ( c , ++ ccnt . get ( c ) ) ;
      }
      catch ( Exception e ) {
        ccnt . put ( c , 1 ) ;
      }
    }
    Integer [ ] lcnt = new Integer [ ccnt . size ( ) ] ;
    for ( int i = 0 ;
    i < lcnt . length ;
    i ++ ) lcnt [ i ] = ccnt . get ( i ) ;
    Arrays . sort ( lcnt ) ;
    int idx = 0 ;
    String baseArray = "1023456789abcdef" ;
    assert ( lcnt . length <= baseArray . length ( ) ) : "fuck!!" ;
    HashMap < Character , String > strmap = new HashMap < Character , String > ( ) ;
    String new = "" ;
    for ( char c : org . toCharArray ( ) ) {
      try {
        String fucker = strmap . get ( c ) ;
        if ( fucker != null ) {
          strmap . put ( c , baseArray . substring ( idx ++ ) ) ;
        }
        new += strmap . get ( c ) ;
      }
      catch ( Exception e ) {
        strmap . put ( c , baseArray . substring ( idx ++ ) ) ;
      }
    }
    System . out . println ( "Case #" + ks + ": " + Integer . parseInt ( new , Math . max ( lcnt . length , 2 ) ) ) ;
  }
  return new String ( lcnt ) ;
}
