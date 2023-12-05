@ MoreRequires public static String gcd ( int a , int b ) {
  if ( b == 0 ) {
    return a ;
  }
  return gcd ( b , a % b ) ;
}
