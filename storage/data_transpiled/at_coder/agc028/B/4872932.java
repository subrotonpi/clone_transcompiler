public static void print ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] a = Lists . newArrayList ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input ) ;
  }
  int MOD = 10 * 9 + 7 ;
  int M = 100005 ;
  int [ ] fact = new int [ M ] ;
  fact [ 0 ] = 1 ;
  for ( int i = 1 ;
  i < M ;
  i ++ ) {
    fact [ i ] = fact [ i - 1 ] * i ;
    fact [ i ] %= MOD ;
  }
  int [ ] inv = new int [ M ] ;
  inv [ 1 ] = 1 ;
  for ( int i = 2 ;
  i < M ;
  i ++ ) {
    inv [ i ] = inv [ i - 1 ] + Math . pow ( i , MOD - 2 , MOD ) ;
    inv [ i ] %= MOD ;
  }
  int ans = 0 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    ans += ( inv [ i ] + inv [ N - i + 1 ] - 1 + MOD ) * a [ i - 1 ] % MOD ;
    ans %= MOD ;
  }
  System . out . println ( ( ans * fact [ N ] ) % MOD ) ;
}
