static final String solve ( double [ ] tt ) {
  /* Run test */
  double [ ] p = new double [ tt . length + 1 ] ;
  for ( int i = 0 ;
  i < tt . length ;
  i ++ ) {
    p [ i ] = 1.0 ;
    for ( int j = 0 ;
    j < tt . length ;
    j ++ ) {
      double x = tt [ j ] ;
      double [ ] newp = new double [ p . length + 1 ] ;
      newp [ i ] = 0.0 ;
      for ( int j = 0 ;
      j < p . length ;
      j ++ ) {
        newp [ j ] += p [ j ] * ( 1.0 - x ) ;
        newp [ j + 1 ] += p [ j ] * x ;
      }
      p = newp ;
    }
  }
  /* Run main */
  int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int t : xrange ( 1 , T + 1 ) ) {
    int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int K = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    double [ ] A = map ( Double . parseDouble , tt [ t ] ) ;
    double ret = 0.0 ;
    Arrays . sort ( A ) ;
    for ( int k : xrange ( K + 1 ) ) {
      double [ ] tt = new double [ N ] ;
      System . arraycopy ( A , 0 , tt , 0 , T ) ;
      tt [ T ] = A [ N - K + k ] ;
      assert tt . length == K ;
      ret = Math . max ( ret , test ( tt ) ) ;
    }
    System . out . format ( "Case #%s: %.7f%n" , t , ret ) ;
  }
  if ( __name__ == null ) {
    throw new RuntimeException ( "Test failed" ) ;
  }
  return "Test passed" ;
}
