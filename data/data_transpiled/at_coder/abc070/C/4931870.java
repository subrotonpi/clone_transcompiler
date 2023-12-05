public static long gcd ( long x , long y ) {
  if ( y == 0 ) {
    return x ;
  }
  return gcd ( y , x % y ) ;
}
