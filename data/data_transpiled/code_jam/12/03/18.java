public static void recycled ( int A , int B ) throws IOException {
  long bs = B ;
  assert ( Integer . toString ( A ) . length ( ) == Integer . toString ( B ) . length ( ) ) ;
  for ( int n = A ;
  n < B ;
  n ++ ) {
    String ns = Integer . toString ( n ) ;
    for ( int i = 1 ;
    i < ns . length ( ) ;
    i ++ ) {
      long ms = ns . substring ( i ) + ns . substring ( 0 , i ) ;
      if ( ns . compareTo ( ms ) <= 0 ) {
        recycled ( ns , ms ) ;
      }
    }
  }
  BufferedReader data = new BufferedReader ( new FileReader ( "C-large.in" ) ) ;
  int T = Integer . parseInt ( data . readLine ( ) . trim ( ) ) ;
  for ( int testCase = 1 ;
  testCase <= T ;
  testCase ++ ) {
    final int [ ] array = Integer . parseInt ( data . readLine ( ) . trim ( ) ) ;
    System . out . println ( "Case #" + testCase + ": " + new HashSet < > ( Arrays . asList ( array ) ) . size ( ) ) ;
  }
}
