public static int powMod ( int a , int b ) {
  int res = 1 ;
  while ( b > 0 ) {
    if ( ( b & 1 ) != 0 ) {
      res = ( res * a ) % MOD ;
    }
    b >>= 1 ;
    a = ( a * a ) % MOD ;
  }
  return res ;
}
