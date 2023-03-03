public static double solve ( ) {
  int x = Integer . parseInt ( readLine ( ) ) ;
  int s = Integer . parseInt ( readLine ( ) ) ;
  int r = Integer . parseInt ( readLine ( ) ) ;
  int t = Integer . parseInt ( readLine ( ) ) ;
  int n = Integer . parseInt ( readLine ( ) ) ;
  int [ ] a = new int [ x ] ;
  for ( final int i : xrange ( n ) ) {
    int b = Integer . parseInt ( readLine ( ) ) ;
    int e = Integer . parseInt ( readLine ( ) ) ;
    int w = Integer . parseInt ( readLine ( ) ) ;
    for ( int j : xrange ( b , e ) ) a [ j ] = w ;
  }
  Arrays . sort ( a ) ;
  for ( int i : xrange ( x ) ) {
    if ( t > 0 ) {
      double tt = 1. / ( a [ i ] + r ) ;
      if ( tt < t ) {
        t -= tt ;
        a [ i ] += r ;
      }
      else {
        a [ i ] = 1. / ( t + ( 1. - t * ( a [ i ] + r ) ) / ( a [ i ] + s ) ) ;
        t = 0 ;
      }
    }
    else a [ i ] += s ;
  }
  return Math . pow ( 1.0 / a [ i ] , 1.0 / a [ i ] ) ;
}
