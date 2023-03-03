public static int cases = Integer . parseInt ( readLine ( ) ) {
  for ( int testCase = xrange ( 1 , cases + 1 ) ;
  testCase <= cases ;
  testCase ++ ) {
    int n = Integer . parseInt ( readLine ( ) ) ;
    int [ ] vals = new int [ n ] ;
    for ( String t : readLine ( ) . split ( " " ) ) vals [ 0 ] = Integer . parseInt ( t ) ;
    int a = 0 ;
    int b = 0 ;
    int speed = 0 ;
    for ( int i = xrange ( 1 , n ) ;
    i < n ;
    i ++ ) {
      int c = vals [ i - 1 ] ;
      int d = vals [ i ] ;
      speed = Math . max ( speed , c - d ) ;
      a += Math . max ( c - d , 0 ) ;
    }
    for ( int i = xrange ( n - 1 ) ;
    i < n ;
    i ++ ) b += Math . min ( speed , vals [ i ] ) ;
    System . out . println ( "Case #" + testCase + ": " + a + " " + b ) ;
  }
  return cases ;
}
