static final long gcd ( long a , long b ) {
  if ( a == 0 ) {
    return b ;
  }
  return gcd ( b % a , a ) ;
}
