public static long sumBase10to ( long n , long b ) {
  if ( n / b > 0 ) {
    return sumBase10to ( n / b , b ) + n % b ;
  }
  return n % b ;
}
