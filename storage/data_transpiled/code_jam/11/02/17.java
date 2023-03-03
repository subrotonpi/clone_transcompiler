@ java . lang . Deprecated public static void main ( String [ ] args ) throws IOException {
  BufferedReader fin = new BufferedReader ( new FileReader ( "b-large.in" ) ) ;
  PrintWriter fout = new PrintWriter ( new BufferedWriter ( new FileWriter ( "b-large.out" ) ) ) ;
  int cases = Integer . parseInt ( fin . readLine ( ) . split ( " " ) [ 0 ] ) ;
  int testCase = 0 ;
  {
    int i = 0 ;
    int p = 0 ;
    int [ ] aux ;
    System . out . println ( ">>>> " + fout . toString ( ) + ": " + i ) ;
    System . out . println ( "Case #" + testCase + ": " + i ) ;
  }
  for ( int test = xrange ( cases ) ;
  test < cases ;
  test ++ ) {
    String [ ] s = fin . readLine ( ) . split ( " " ) ;
    p = 0 ;
    Map < Integer , Integer > invoke = new HashMap < Integer , Integer > ( ) ;
    Map < Integer , Integer > opposed = new HashMap < Integer , Integer > ( ) ;
    int c = Integer . parseInt ( s [ p ] ) ;
    for ( int i : xrange ( c ) ) {
      p ++ ;
      aux = s [ p ] ;
      invoke . put ( aux . x + aux . y , aux . z ) ;
      invoke . put ( aux . y + aux . x , aux . z ) ;
    }
    p ++ ;
    int d = Integer . parseInt ( s [ p ] ) ;
    for ( int i : xrange ( d ) ) {
      p ++ ;
      aux = s [ p ] ;
      if ( ! opposed . containsKey ( aux . x ) ) {
        opposed . put ( aux . x , new ArrayList < Integer > ( ) ) ;
      }
      if ( ! opposed . containsKey ( aux . y ) ) {
        opposed . put ( aux . y , new ArrayList < Integer > ( ) ) ;
      }
      opposed . get ( aux . x ) . add ( aux . y ) ;
      opposed . get ( aux . y ) . add ( aux . x ) ;
    }
    p ++ ;
    int n = Integer . parseInt ( s [ p ] ) ;
    p ++ ;
    String [ ] series = s [ p ] . split ( " " ) ;
    StringBuilder seriesout = new StringBuilder ( series [ 0 ] ) ;
    for ( int i = xrange ( n - 1 ) ;
    i < n ;
    i ++ ) {
      if ( seriesout . length (