private static int CC ( int a , int b ) {
  if ( b > a || b < 0 ) return 0 ;
  assert b < 4 ;
  int result = 1 ;
  for ( int k : xrange ( b ) ) result *= ( a - k ) ;
  for ( int k : xrange ( b ) ) result /= ( k + 1 ) ;
  return result ;
}
int N = Integer . parseInt ( readLine ( ) ) ;
for ( int i = xrange ( N ) ;
i < N ;
i ++ ) {
  int n = Integer . parseInt ( readLine ( ) ) ;
  int A = Integer . parseInt ( readLine ( ) ) ;
  int B = Integer . parseInt ( readLine ( ) ) ;
  int C = Integer . parseInt ( readLine ( ) ) ;
  int D = Integer . parseInt ( readLine ( ) ) ;
  int x0 = x0 % M ;
  int y0 = y0 % M ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    mat [ x0 % 3 ] [ y0 % 3 ] ++ ;
    x0 = ( A * x0 + B ) % M ;
    y0 = ( C * y0 + D ) % M ;
  }
  int result = 0 ;
  for ( int p1 = xrange ( 9 ) ;
  p1 < n ;
  p1 ++ ) {
    for ( int p2 = xrange ( p1 , 9 ) ;
    p2 < n ;
    p2 ++ ) {
      for ( int p3 = xrange ( p2 , 9 ) ;
      p3 < n ;
      p3 ++ ) {
        int p1x = p1 % 3 ;
        int p1y = p1 / 3 ;
        int p2x = p2 % 3 ;
        int p2y = p2 / 3 ;
        int p3x = p3 % 3 ;
        int p3y = p3 / 3 ;
        if ( ( p1x + p2x + p3x ) % 3 || ( p1y + p2y + p3y ) % 3 ) continue ;
        int [ ] [ ] pmat = new int [ 3 ] [ 3 ] ;
        pmat [ p1x ] [ p1y ] ++ ;
        pmat [ p2x ] [ p2y ] ++ ;
        pmat [ p3x ] [ p3y ] ++ ;
        int inc = 1 ;
        for ( int px = 0 ;
        px < 3 ;
        px ++ ) for ( int py = 0 ;
        py < 3 ;
        py ++ ) inc *= CC ( mat [ px ] [ py ] , pmat [ px ] [ py ] ) ;
        result += inc ;
      }
    }
  }
  System . out . println ( "Case #" + ( i + 1 ) + ": "