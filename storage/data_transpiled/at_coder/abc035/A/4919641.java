public static int gcd ( @ IntRange ( from = 0 , to = 1 ) int a , @ IntRange ( from = 1 , to = 1 ) int b ) {
  if ( a < b ) {
    a = b ;
    b = a ;
  }
  return b == 0 ? a : gcd ( b , a % b ) ;
}
private static String tv ( int H , int W ) {
  int g = gcd ( H , W ) ;
  return H / g + ":" + W / g ;
}
