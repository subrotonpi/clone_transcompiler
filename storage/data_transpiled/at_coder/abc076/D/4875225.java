public static double f ( double x ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] time = new int [ n + 1 ] ;
  int [ ] v = new int [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) time [ i ] = i ;
  v [ 0 ] = i ;
  Vector lines = new Vector ( ) ;
  int t = 0 ;
  lines . add ( new Double ( - 1 ) ) ;
  for ( int i = 1 ;
  i <= n ;
  i ++ ) {
    lines . add ( new Double ( t ) ) ;
    lines . add ( new Double ( t + time [ i ] ) ) ;
    lines . add ( v [ i ] ) ;
    t += time [ i ] ;
  }
  lines . add ( new Double ( t ) ) ;
  /* double f(x) */
  double speed = 10 * 18 ;
  for ( int i = 0 ;
  i < lines . size ( ) ;
  i ++ ) {
    int x1 = lines . elementAt ( i ) ;
    int x2 = lines . elementAt ( i ) ;
    int vv = lines . elementAt ( i ) ;
    if ( x < x2 ) {
      speed = Math . min ( speed , vv + vv - x1 ) ;
    }
  }
  dp = new double [ 2 * t ] ;
  dp [ t ] = 0 ;
  dp [ t ] = 0 ;
  dp [ t ] = 0 ;
  dp [ t ] = 1 ;
  return dp [ t ] ;
}
