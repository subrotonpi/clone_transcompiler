static final String solve ( int a , int b ) {
  if ( ( a < 0 ) && ( b < 0 ) ) {
    return gcd ( - a , b ) ;
  }
  if ( ( b < 0 ) && ( b < 0 ) ) {
    return gcd ( a , - b ) ;
  }
  if ( ( a < b ) && ( b < 0 ) ) {
    return gcd ( b , a ) ;
  }
  if ( ( b == 0 ) && ( b == 0 ) ) {
    return a ;
  }
  return gcd ( b , a % b ) ;
}
