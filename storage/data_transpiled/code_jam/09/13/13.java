static final double ncr ( int n , int r ) {
  int t = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  /* ncr(n, r) */
  if ( r < 0 || r > n ) return 0 ;
  t = 1 ;
  for ( int i : xrange ( n - r + 1 , n + 1 ) ) t *= i ;
  for ( int i : xrange ( 1 , r + 1 ) ) t /= i ;
  /* e. */
  for ( int _t = t ;
  _t < n ;
  _t ++ ) {
    int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    int c = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
    double [ ] e = new double [ _t ] ;
    e [ _t ] = 0.0 ;
    double poss = ncr ( n , c ) * 1.0 ;
    for ( int left = 1 ;
    ;
    left ++ ) {
      int have = n - left ;
      double exp = 0.0 ;
      for ( int new = 1 ;
      new < c ;
      new ++ ) {
        if ( new > left ) break ;
        double prob = ncr ( left , new ) * ncr ( have , c - new ) / poss ;
        exp += prob * e [ left - new ] ;
      }
      double prob0 = ncr ( left , 0 ) * ncr ( have , c ) / poss ;
      exp = ( 1 + exp ) / ( 1 - prob0 ) ;
      e [ _t ] = exp ;
    }
    System . console ( ) . readLine ( ) ;
  }
  /* print e. */
  System . out . println ( "Case #" + ( _t + 1 ) + ": " + e [ e . length - 1 ] ) ;
  return t ;
}
