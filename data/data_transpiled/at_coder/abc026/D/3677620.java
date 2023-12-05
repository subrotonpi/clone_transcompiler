@ VisibleForTesting static double sin ( double x ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int up = 0 ;
  double l , r ;
  if ( A / ( B * C * PI ) > 1 ) {
    l = ( 100 - B ) / A ;
    r = ( 100 + B ) / A ;
  }
  else {
    double d = acos ( - A / ( B * C * PI ) ) / ( C * PI ) ;
    int n = ceil ( C * ( ( 100 - B ) / A + d ) / 2 ) ;
    l = - d + 2 * n / C ;
    r = d + n ;
  }
  / * ▁ return ▁ A * x ▁ + ▁ B * sin ( C * PI * x ) ▁ + ▁ B * sin ( C * PI * x ) ▁ + ▁ C * sin ( C * PI * x ) ▁ + ▁ C * sin ( C * PI * x ) ▁ + ▁ C * sin ( C * PI * x ) ▁ + ▁ C * sin ( C * PI * x ) ▁ + ▁ C * sin ( C * PI * x ) ▁ + ▁ C * sin ( C * PI * x ) ▁ + ▁ C * sin ( C * PI * x ) ▁ + ▁ C * sin ( C * PI * x ) ▁ + ▁ C * sin ( C * PI * x ) ▁ + ▁ C * sin ( C * PI * x ) ▁ + ▁ C * sin ( C * PI * x ) ▁ + ▁ C * sin ( C * PI * x ) ▁ + ▁ C * sin ( C * PI * x ) ▁ + ▁ C * sin ( C * PI * x ) ▁ + ▁ C * sin ( C * PI ) ▁ + ▁ C * sin ( C * PI ) ▁ + ▁ C * sin ( C * PI ) ▁ + ▁ C * sin ( C * PI ) ▁ + ▁ C * sin ( C * PI ) ▁ + ▁ C * sin ( C * PI ) ▁ + ▁ C * sin ( C * PI ) ▁ + ▁ C * sin ( C * PI ) ▁ + ▁ C * ( C * PI ) ▁ + ▁ C * sin ( C ) ▁ + ▁ C * ( C * PI ) ▁ + ▁ C * ( C ) ▁ + ▁ C * ▁ +