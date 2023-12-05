static final long gcd ( long a , long b ) throws IOException {
  if ( a > b ) {
    a = b ;
    b = a ;
  }
  if ( a == 0 ) {
    return b ;
  }
  return gcd ( b % a , a ) ;
}
