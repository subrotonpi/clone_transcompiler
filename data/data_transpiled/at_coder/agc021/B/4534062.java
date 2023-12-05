static final double [ ] [ ] getCoordinates ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  double [ ] [ ] c = new double [ n ] [ 2 ] ;
  double [ ] [ ] a = new double [ n ] [ 2 ] ;
  double p = Math . PI ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    c [ i ] [ 0 ] = Math . PI ;
    c [ i ] [ 1 ] = map ( input . nextLine ( ) ) ;
  }
  /* Compute the coordinates */
  double vx = ax - cx ;
  double vy = ay - cy ;
  double wx = bx - cx ;
  double wy = by - cy ;
  int s = 1 ;
  if ( vx * wy - vy * wx < 0 ) s = - 1 ;
  p = vx * wx + vy * wy ;
  double q = ( vx * vx + vy * vy ) * 0.5 ;
  double r = ( wx * wx + wy * wy ) * 0.5 ;
  double t = p / ( q * r ) ;
  t = Math . max ( - 1 , Math . min ( 1 , t ) ) ;
  t = ( Math . acos ( t ) ) * s ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int k = ( i + 1 ) % n ;
    double tax = 0 ;
    double tin = 0 ;
    for ( int j = 0 ;
    j < n ;
    j ++ ) {
      if ( j != i && j != k ) {
        double t = f ( c [ k ] [ 0 ] , c [ k ] [ 1 ] , c [ j ] [ 0 ] , c [ j ] [ 1 ] , c [ i ] [ 0 ] , c [ i ] [ 1 ] ) ;
        tax = Math . max ( tax , t ) ;
        tin = Math . min ( tin , t ) ;
      }
    }
    if ( tax - tin < p ) a [ i ] = ( p - tax + tin ) / ( p * 2 ) ;
  }
  for ( int i = 0 ;
  i < n ;
  i ++ ) System . out . println ( Math . round ( a [ i ] ) ) ;
  return a ;
}
