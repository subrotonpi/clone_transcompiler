public static String gcd ( int a , int b ) {
  while ( b != 0 ) {
    a = b ;
    b = a % b ;
  }
  return a ;
}
