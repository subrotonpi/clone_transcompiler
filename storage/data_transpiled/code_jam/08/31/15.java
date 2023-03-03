static final int [ ] solve ( int [ ] input ) {
  for ( int testCase = 0 ;
  testCase < input . length ;
  testCase ++ ) {
    int P = Integer . parseInt ( input [ 0 ] ) ;
    int K = Integer . parseInt ( input [ 1 ] ) ;
    int L = Integer . parseInt ( input [ 2 ] ) ;
    ArrayList < Integer > V = new ArrayList < > ( ) ;
    for ( int i = 0 ;
    i < P ;
    i ++ ) V . add ( Integer . parseInt ( input [ 1 ] ) ) ;
    Collections . sort ( V ) ;
    int t = 0 ;
    int m = 1 ;
    int count = 0 ;
    for ( int i = 0 ;
    i < L ;
    i ++ ) {
      count += m * i ;
      t ++ ;
      if ( t == K ) {
        m ++ ;
        t = 0 ;
      }
    }
    System . out . println ( "Case #" + ( testCase + 1 ) + ": " + count ) ;
  }
  return new int [ ] {
  }
  ;
}
