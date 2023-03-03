static final String solve ( ) {
  long a , b ;
  while ( a > 0 ) {
    ( a = b % a ) = a ;
  }
  /* do one case */
  long [ ] v = map . get ( Long . decode ( "hex" ) ) ;
  assert v [ 0 ] + 1 == v . length ;
  assert v [ 0 ] >= 2 ;
  long g = Math . abs ( v [ 1 ] - v [ 2 ] ) ;
  for ( int i = 3 ;
  i < v . length ;
  i ++ ) {
    g = Math . abs ( g - ( v [ 1 ] - v [ i ] ) ) ;
  }
  a = ( g - ( v [ 1 ] % g ) ) % g ;
  System . out . println ( "Case #" + cnum + ": " + a ) ;
  /* do one case */
  int N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    doOneCase ( i + 1 ) ;
  }
}
