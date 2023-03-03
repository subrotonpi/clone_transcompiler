@ Function public static double AreaSum ( List < List < Integer >> L ) {
  double R = 0. ;
  for ( int i = 0 ;
  i < L . size ( ) - 1 ;
  i ++ ) {
    R += ( L . get ( i + 1 ) . get ( 0 ) - L . get ( i ) . get ( 0 ) ) * ( L . get ( i ) . get ( 1 ) + L . get ( i + 1 ) . get ( 1 ) ) / 2. ;
  }
  double [ ] [ ] A = new double [ L . size ( ) ] [ ] ;
  double Eat = 0. ;
  for ( int i = 0 ;
  i < L . size ( ) - 1 ;
  i ++ ) {
    double part = ( L . get ( i + 1 ) . get ( 0 ) - L . get ( i ) . get ( 1 ) ) * ( L . get ( i ) . get ( 1 ) + L . get ( i + 1 ) . get ( 1 ) ) / 2. ;
    double Slice = Area / G ;
    for ( int i = 1 ;
    i < G ;
    i ++ ) {
      System . out . println ( "Find " + i + " " + i + " " + i ) ;
    }
  }
  for ( int i = 0 ;
  i < L . size ( ) - 1 ;
  i ++ ) {
    double part = ( L . get ( i + 1 ) . get ( 0 ) - L . get ( i ) . get ( 0 ) ) * ( L . get ( i ) . get ( 1 ) + L . get ( i + 1 ) . get ( 1 ) ) / 2. ;
    double Slice = Area / G ;
    for ( int i = 1 ;
    i < G ;
    i ++ ) {
      double slope = ( y1 - y0 ) / ( x1 - x0 ) ;
      double dx ;
      if ( slope != 0 ) dx = ( - y0 + sqrt ( y0 * y0 + 2 * slope * todo ) ) / ( slope ) ;
      else dx = todo / y0 ;
    }
    return x0 + dx ;
  }
  int T = Integer . parseInt ( input ( ) ) ;
  for ( int i = 0 ;
  i < T ;
  i ++ ) {
    System . out . println ( "Case #" + ( i + 1 ) + ":" ) ;
    Arrays . fill ( A , i ) ;
    Arrays . fill ( A , i ) ;
    Arrays . fill ( A , i ) ;
  }
  return R ;
}
