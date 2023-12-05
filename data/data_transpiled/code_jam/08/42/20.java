public static String find ( int N , int M , int A ) {
  for ( int x1 : xrange ( N + 1 ) ) {
    for ( int y1 : xrange ( M + 1 ) ) {
      for ( int x2 : xrange ( x1 + 1 ) ) {
        for ( int y2 : xrange ( y1 , M + 1 ) ) {
          if ( x1 * y2 - y1 * x2 == A ) {
            return 0 + " " + x1 + " " + y1 + " " + x2 + " " + y2 ;
          }
        }
      }
    }
    return "IMPOSSIBLE" ;
  }
  if ( Class . forName ( "java.lang.System" ) . equals ( System . console ( ) ) ) {
    final int C = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    for ( int i : xrange ( C ) ) {
      N = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      M = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      A = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
      System . out . println ( "Case #" + ( i + 1 ) + ": " + find ( N , M , A ) ) ;
    }
  }
  return "IMPOSSIBLE" ;
}
