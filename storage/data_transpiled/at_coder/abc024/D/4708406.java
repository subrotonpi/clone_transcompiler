static int powMod ( int x , int n ) {
  int ret = 1 ;
  while ( n > 0 ) {
    if ( ( n & 1 ) != 0 ) {
      ret *= x ;
      ret %= mod ;
      n -- ;
    }
    else {
      x *= x ;
      x %= mod ;
      n >>>= 1 ;
    }
  }
  /* rev n */
  return powMod ( n , mod - 2 ) ;
}
