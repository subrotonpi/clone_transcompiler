static final String solve ( ) throws IOException {
  BufferedReader in = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  int cases = Integer . parseInt ( in . readLine ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= cases ;
  testCase ++ ) {
    int N = Integer . parseInt ( in . readLine ( ) ) ;
    Map < Integer , Integer > counts = Maps . newHashMap ( ) ;
    for ( int r = 0 ;
    r < 2 * N - 1 ;
    r ++ ) {
      int [ ] row = Integer . parseInt ( in . readLine ( ) ) . split ( " " ) ;
      for ( int i : row ) {
        if ( ! counts . containsKey ( i ) ) {
          counts . put ( i , 0 ) ;
        }
        counts . put ( i , 1 ) ;
      }
    }
    List < String > missing = new ArrayList < String > ( ) ;
    for ( Map . Entry < Integer , Integer > entry : counts . entrySet ( ) ) {
      if ( entry . getValue ( ) % 2 != 0 ) {
        missing . add ( entry . getKey ( ) ) ;
      }
    }
    String result = Joiner . on ( ' ' ) . join ( Arrays . asList ( missing . toArray ( ) ) ) ;
    System . out . println ( "Case #" + testCase + ": " + result ) ;
  }
  return "" ;
}
