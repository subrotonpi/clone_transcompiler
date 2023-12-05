public static double dist ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] t = new int [ n ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    t [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] v = new int [ n ] ;
  for ( int i = 0 ;
  i <= n ;
  i ++ ) {
    v [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] m = new int [ n + 1 ] ;
  int [ ] z = new int [ n + 1 ] ;
  for ( int i = n - 1 ;
  i > 0 ;
  i -- ) {
    m [ i ] = Math . min ( v [ i ] , v [ i - 1 ] , t [ i ] + m [ i + 1 ] ) ;
  }
  for ( int i = 1 ;
  i < n ;
  i ++ ) {
    z [ i ] = Math . min ( m [ i ] , z [ i - 1 ] + t [ i - 1 ] ) ;
  }
  /* Distance to the speed */
  double lspeed = z [ i ] ;
  double rspeed = z [ i + 1 ] ;
  double ta = v [ i ] - lspeed ;
  double tb = v [ i ] - rspeed ;
  double c ;
  if ( ta + tb <= t [ i ] ) {
    c = ( lspeed + v [ i ] ) * ta / 2 + v [ i ] * ( t [ i ] - ta - tb ) + ( rspeed + v [ i ] ) * tb / 2 ;
  }
  else {
    double a = ( rspeed + t [ i ] - lspeed ) / 2 ;
    c = ( 2 * lspeed + a ) * a / 2 + ( lspeed + a + rspeed ) * ( t [ i ] - a ) / 2 ;
  }
  return c ;
}
