public static void main ( String input ) {
  for ( int testCase = 0 ;
  testCase < input . length ( ) ;
  testCase ++ ) {
    int K = input . length ( ) ;
    List < Integer > l = CollectionUtils . getIntegerList ( input . split ( " " ) ) ;
    int n = l . get ( 0 ) ;
    l = l . subList ( 1 , l . size ( ) ) ;
    int [ ] d = new int [ K ] ;
    int [ ] sp = new int [ K ] ;
    Arrays . fill ( sp , 1 ) ;
    d [ 0 ] = 1 ;
    int p = 0 ;
    sp . remove ( 0 ) ;
    for ( int k : xrange ( 2 , K + 1 ) ) {
      p = ( p + k - 1 ) % sp . length ;
      int pl = sp [ p ] ;
      d [ pl ] = k ;
    }
    System . out . println ( "Case #" + ( testCase + 1 ) + ": " + Arrays . toString ( d ) ) ;
  }
}
