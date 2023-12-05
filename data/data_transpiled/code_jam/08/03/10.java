static private double odcinek_field_x ( int r , double xr ) {
  if ( xr >= r ) return 0.0 ;
  double yr = Math . sqrt ( r * r - xr * r ) ;
  double alpha = Math . atan2 ( yr , xr ) ;
  alpha *= 2.0 ;
  double field = alpha * 0.5 * ( r * r ) - 0.5 * ( r * r ) * Math . sin ( alpha ) ;
  assert ( field >= 0 ) ;
  /* Case # */
  double x = r ;
  double y = r ;
  double w = r ;
  double h = r ;
  double [ ] P = list ( generatePoints ( f , R , t , g ) ) ;
  double [ ] s = new double [ 4 ] ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    s [ i ] = ( double ) ( P [ i ] - t - f ) ;
  }
  double muchafield = 4.0 * Math . pow ( s [ 0 ] , 2 ) ;
  double field = ( double ) ( Math . PI * ( R * r ) - t ) ;
  double a = ( field - muchafield ) / field ;
  System . out . printf ( "Case #%i: %.6f" , ( i + 1 ) , a ) ;
  /* Case # */
  if ( onCircle ( r , p1 ) ) return "prawydolnyok" ;
  if ( onCircle ( r , p2 ) ) return "lewydolny" ;
  for ( int i = 0 ;
  i < 4 ;
  i ++ ) {
    double f = ( double ) ( Math . PI * ( r * r ) - t ) ;
    double R = ( double ) ( Math . PI * ( r * r ) - t ) ;
    double t = ( double ) ( Math . PI * ( r * r ) - t ) ;
    double h = ( double ) ( Math . PI * ( r * r ) - t ) ;
    double field = ( double ) ( Math . PI * ( r * r ) - t ) ;
    double a = ( field - muchafield ) / field ;
    System . out . printf ( "Case #%i: %.6f" , ( i + 1 ) , a ) ;
  }
  /* Case # */
  double fy1 = odcinek_field_y ( r , 0 ) ;
  double fy2 = odcinek_field_y ( r , yr ) ;
  double field @ @