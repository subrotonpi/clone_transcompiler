public static final double getMath ( double x , double y ) {
  double a = Math . min ( x , y ) ;
  double b = Math . max ( x , y ) ;
  int n = Integer . parseInt ( input ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    x = Math . min ( x , y ) ;
    y = Math . max ( y , y ) ;
    double c = Math . min ( x , y ) ;
    double d = Math . max ( x , y ) ;
    if ( a <= c && b <= d ) {
      System . out . println ( "YES" ) ;
    }
    else {
      if ( a > c || a * a + b * b >= c * c + d * d ) {
        System . out . println ( "NO" ) ;
      }
      else {
        double thi_2 = Math . atan ( ( ( a * a + b * b - c * c ) * ( 1 / 2 ) ) / c ) ;
        double thi_3 = Math . atan ( ( ( a * a + b * b - d * d ) * ( 1 / 2 ) ) / d ) ;
        double thi_1 = Math . acos ( ( b * b - a * a ) / ( a * a + b * b ) ) ;
        if ( 3.14159265358979 / 2 - thi_2 - thi_3 > thi_1 ) {
          System . out . println ( "YES" ) ;
        }
        else {
          System . out . println ( "NO" ) ;
        }
      }
    }
  }
  return Math . acos ( a ) ;
}
