public static int f ( int a , int b ) {
  int d , X ;
  if ( a == b ) {
    d = 0 ;
    ret = a ;
  }
  else if ( a < b ) {
    d = b / a ;
    if ( b % a == 0 ) {
      ret = a * ( 2 * d - 1 ) ;
    }
    else {
      ret = 2 * a * d + f ( a , b % a ) ;
    }
  }
  else {
    d = a / b ;
    if ( a % b == 0 ) {
      ret = b * ( 2 * d - 1 ) ;
    }
    else {
      ret = 2 * b * d + f ( a % b , b ) ;
    }
  }
  return ret ;
}
