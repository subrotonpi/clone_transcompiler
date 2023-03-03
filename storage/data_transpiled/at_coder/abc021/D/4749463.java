public static int comb_fermat ( @ IntRange ( min = 0 , max = 1 ) int n , int r ) {
  if ( r > n - r ) return comb_fermat ( n , n - r ) ;
  int mul = 1 , div = 1 ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) {
    mul *= n - i ;
    mul %= MOD ;
    div *= i + 1 ;
    div %= MOD ;
  }
  int ret = mul * Math . pow ( div , MOD - 2 , MOD ) % MOD ;
  return ret ;
}
