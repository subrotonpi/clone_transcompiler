public static int input ( ) {
  String tmp = input ;
  double r , b ;
  float rf = ( float ) r ;
  float bf = ( float ) b ;
  r = ( int ) r ;
  b = ( int ) b ;
  tmp = input ;
  double x , y ;
  float xf = ( float ) x ;
  float yf = ( float ) y ;
  x = ( int ) x ;
  y = ( int ) y ;
  /* verify that the result is a positive integer */
  if ( ( ( ( x1 * p1 + q1 ) <= r1 ) && ( ( ( p1 + y1 * q1 ) <= b1 ) ) ) ) {
    return 1 ;
  }
  else {
    return 0 ;
  }
  if ( ( r * y <= b ) && ( ( x * y ) <= r ) ) {
    System . out . println ( r ) ;
  }
  else if ( ( b * x <= r ) && ( ( x * y ) <= r ) ) {
    System . out . println ( b ) ;
  }
  else {
    double q = ( x * b - r ) / ( x * y - 1 ) ;
    double p = ( y * r - b ) / ( x * y - 1 ) ;
    if ( ( ( int ) p + 2 ) == ( int ) q + 2 ) {
      System . out . println ( ( int ) p + 2 ) ;
    }
    else if ( ( ( int ) p + 1 ) == ( int ) q + 1 ) {
      System . out . println ( ( int ) p + 1 ) ;
    }
    else if ( ( ( int ) p - 1 ) == ( int ) q - 2 ) {
      System . out . println ( ( int ) p + 1 ) ;
    }
    else if ( ( ( int ) p - 1 ) == ( int ) q - 1 ) {
      System . out . println ( ( int ) p - 1 ) ;
    }
    else if ( ( ( int ) p - 2 ) == ( int ) q - 2 ) {
      System . out . println ( ( int ) p + 2 ) ;
    }
    else if ( ( ( int ) p - 1 ) == ( int ) q - 1 ) {
      System . out . println ( ( int ) p - 1 ) ;
    }
    else {
      System . out . println ( ( int ) p - 1 ) ;
    }
  }
  return 0 ;
}
