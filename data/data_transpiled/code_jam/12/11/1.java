static final double solve ( double [ ] p ) {
  int t_n = Integer . parseInt ( p [ 0 ] ) ;
  for ( int t_t = 1 ;
  t_t <= t_n ;
  t_t ++ ) {
    int a = Integer . parseInt ( p [ 0 ] ) ;
    int b = Integer . parseInt ( p [ 1 ] ) ;
    double [ ] p = new double [ b ] ;
    for ( int i = 0 ;
    i < a ;
    i ++ ) p [ i ] = p [ i ] ;
    double ans = 1.0 * b + 1 ;
    double r = 1.0 ;
    for ( int x = 0 ;
    x <= a ;
    x ++ ) {
      ans = Math . min ( ans , ( a + b - 2 * x ) + ( 1.0 - r ) * ( b + 1 ) ) ;
      if ( x < a ) r *= p [ x ] ;
    }
    System . out . println ( "Case #" + t_t + ": " + ( ans + 1.0 ) ) ;
  }
  return ans ;
}
