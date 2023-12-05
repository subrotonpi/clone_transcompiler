static int compute ( int smax , int [ ] x ) {
  final int c = 0 ;
  int r = 0 ;
  for ( int i = 0 , n = x . length ;
  i < n ;
  i ++ ) {
    if ( x [ i ] > c ) {
      r ++ ;
      c = i ;
    }
    c += n ;
  }
  return r ;
  /* parse */
  String smax = System . console ( ) . readLine ( ) ;
  int [ ] array = new int [ smax ] ;
  smax = Integer . parseInt ( smax ) ;
  array = ArrayUtil . toIntArray ( array ) ;
  /* parse */
  if ( getClass ( ) . equals ( "java.util.Scanner" ) ) {
    System . setSecurityManager ( new SecurityManager ( ) ) ;
    int T = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    for ( int i : xrange ( T ) ) {
      Object [ ] data = parse ( ) ;
      int result = compute ( ( Integer ) data ) ;
      System . out . println ( "Case #" + ( i + 1 ) + ": " + result ) ;
    }
  }
  return r ;
}
