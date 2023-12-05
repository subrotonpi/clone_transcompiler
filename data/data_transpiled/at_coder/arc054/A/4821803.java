public static double [ ] getDistance ( int L , int X , int Y , int S , int D ) {
  double [ ] ls = new double [ 3 ] ;
  double a = Y - X ;
  double b = D - S ;
  if ( a <= 0 ) {
    if ( S <= D ) {
      System . out . println ( b / ( X + Y ) ) ;
    }
    else {
      System . out . println ( ( L + b ) / ( X + Y ) ) ;
    }
  }
  else {
    if ( S <= D ) {
      ls [ 0 ] = b / ( X + Y ) ;
      ls [ 1 ] = ( L - b ) / a ;
      System . out . println ( Math . min ( ls [ 0 ] , ls [ 1 ] ) ) ;
    }
    else {
      ls [ 0 ] = - b / a ;
      ls [ 1 ] = ( L + b ) / ( X + Y ) ;
      System . out . println ( Math . min ( ls [ 0 ] , ls [ 1 ] ) ) ;
    }
  }
  return ls ;
}
