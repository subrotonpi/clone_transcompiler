public static int gcd ( int a , int b ) {
  while ( a > 0 ) {
    a = b % a ;
    b = a ;
  }
  return b ;
}
