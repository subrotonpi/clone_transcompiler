static final int [ ] solve ( int [ ] a ) {
  int t = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int testNr = 1 ;
  testNr <= t ;
  testNr ++ ) {
    System . out . println ( "Case #" + testNr + ":" ) ;
    int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int [ ] a = map ( a ) ;
    int x = 0 ;
    for ( int e : a ) {
      x ^= e ;
    }
    if ( x != 0 ) {
      System . out . println ( "NO" ) ;
    }
    else {
      System . out . println ( Arrays . toString ( a ) - min ( a ) ) ;
    }
  }
  return a ;
}
