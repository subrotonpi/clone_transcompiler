private static int solve ( ) {
  int n = Integer . parseInt ( readLine ( ) ) ;
  Point [ ] a = new Point [ n ] ;
  for ( int i : xrange ( n ) ) {
    int d = Integer . parseInt ( readLine ( ) ) ;
    int h = Integer . parseInt ( readLine ( ) ) ;
    int m = Integer . parseInt ( readLine ( ) ) ;
    for ( int j : xrange ( h ) ) {
      a [ i ] = new Point ( 360 - d , m + j ) ;
    }
  }
  int N = a . length ;
  if ( N <= 1 ) {
    return 0 ;
  }
  Point [ ] b = new Point [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    Point x = a [ i ] ;
    double t = 1.0 * x . x * x . y ;
    b [ i ] = new Point ( t , i ) ;
  }
  Arrays . sort ( b ) ;
  int i = b [ 1 ] . y ;
  int j = b [ 0 ] . y ;
  if ( a [ i ] . x * a [ i ] . y >= ( 360 + a [ j ] . x ) * a [ j ] . y ) {
    return 1 ;
  }
  else {
    return 0 ;
  }
}
