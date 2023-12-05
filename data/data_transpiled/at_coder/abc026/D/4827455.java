@ Nullable public static double sin ( double a , double b , double c ) {
  double L = 0.0 ;
  double H = 10000.0 ;
  while ( true ) {
    double M = ( H + L ) / 2 ;
    double f = a * M + b * sin ( c * M * PI ) ;
    if ( 99.999999 < f && f < 100.000001 ) {
      System . out . println ( M ) ;
      exit ( ) ;
    }
    else if ( f < 100.0 ) {
      L = M ;
    }
    else {
      H = M ;
    }
  }
}
