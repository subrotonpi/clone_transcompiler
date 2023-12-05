public static boolean gcd ( int a , int b ) {
  while ( b > 0 ) {
    ( a = b ) = a % b ;
  }
  return a == 0 ;
}
