static final int euclidGCD ( int a , int b ) {
  if ( a < b ) {
    return euclidGCD ( b , a ) ;
  }
  int r = a % b ;
  while ( r != 0 ) {
    a = b ;
    b = r ;
    r = a % b ;
  }
  return b ;
}
