private static void solution ( ) {
  int D = Integer . parseInt ( readLine ( ) ) ;
  int I = Integer . parseInt ( readLine ( ) ) ;
  int M = Integer . parseInt ( readLine ( ) ) ;
  int N = Integer . parseInt ( readLine ( ) ) ;
  int [ ] pix = Integer . parseInt ( readLine ( ) ) ;
  int [ ] cost = new int [ 256 ] ;
  for ( int v : pix ) {
    int [ ] cost1 = new int [ 256 ] ;
    for ( int v1 : xrange ( 256 ) ) {
      int c1 = cost [ v1 ] + D ;
      for ( int v0 : xrange ( 256 ) ) {
        int c2 = cost [ v0 ] + Math . abs ( v - v1 ) ;
        int delta = Math . abs ( v1 - v0 ) ;
        if ( delta > M ) {
          if ( M ) c2 += ( ( delta - 1 ) / M ) * I ;
          else c2 += 1000000000 ;
        }
        c1 = Math . min ( c2 , c1 ) ;
      }
      cost1 [ v1 ] = c1 ;
    }
    cost = cost1 ;
  }
  System . out . println ( min ( cost ) ) ;
  int T = Integer . parseInt ( readLine ( ) ) ;
  for ( int testcase : xrange ( T ) ) {
    System . out . println ( "Case #" + ( testcase + 1 ) + ":" ) ;
    solution ( ) ;
  }
}
