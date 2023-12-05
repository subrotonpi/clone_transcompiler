public static long solve ( long s , long a , long b ) {
  if ( a % b == 0 ) {
    return s + ( ( a / b ) * 2 - 1 ) * b ;
  }
  if ( b % a == 0 ) {
    return s + ( ( b / a ) * 2 - 1 ) * a ;
  }
  else if ( a > b ) {
    s += ( a / b ) * 2 * b ;
    return solve ( s , a , b % a ) ;
  }
  return s ;
}
