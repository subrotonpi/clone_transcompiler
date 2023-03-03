@ MoreRequires public static int gcd ( int a , int b ) {
  if ( a < b ) {
    return gcd ( b , a ) ;
  }
  if ( b == 0 ) {
    return a ;
  }
  else {
    return gcd ( b , a % b ) ;
  }
}
