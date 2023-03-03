public static double dist ( int i , double first ) {
  int n = Integer . parseInt ( input ) ;
  double [ ] t = new double [ n ] ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    t [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] v = new int [ n ] ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    v [ j ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int [ ] maxspeed = new int [ n + 1 ] ;
  for ( int j = n - 1 ;
  j > 0 ;
  j -- ) {
    maxspeed [ j ] = Math . min ( v [ j ] , v [ j - 1 ] , t [ j ] + maxspeed [ j + 1 ] ) ;
  }
  /* dist */
  double c = 0 ;
  double d = 0 ;
  double firstspeed = 0 ;
  for ( int j = 0 ;
  j < n ;
  j ++ ) {
    c += ( first + v [ j ] ) * ta / 2 + v [ j ] * ( t [ j ] - ta - tb ) + ( maxspeed [ j + 1 ] + v [ j ] ) * tb / 2 ;
    lastspeed = maxspeed [ j + 1 ] ;
  }
  /* dist */
  double a = ( maxspeed [ j ] + t [ j ] - first ) / 2 ;
  c += ( first + first + a ) * a / 2 + ( first + a + maxspeed [ j + 1 ] ) * ( t [ j ] - a ) / 2 ;
  lastspeed = maxspeed [ j + 1 ] ;
  /* print the average of the average of the average */
  ans += c ;
}
