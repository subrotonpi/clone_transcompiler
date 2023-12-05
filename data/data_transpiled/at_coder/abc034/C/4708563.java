public static void input ( String w , String h ) {
  int MOD = 10 * 9 + 7 ;
  int n = w + h - 2 ;
  int r = Math . min ( w - 1 , h - 1 ) ;
  int ans = 1 ;
  for ( int i = 0 ;
  i < r ;
  i ++ ) ans = ( ans * ( n - i ) ) % MOD ;
  int div = 1 ;
  int [ ] inv = new int [ r + 1 ] ;
  inv [ 1 ] = 1 ;
  for ( int i = 2 ;
  i <= r ;
  i ++ ) {
    inv [ i ] = ( - ( MOD / i ) * inv [ MOD % i ] ) % MOD ;
    div = ( div * inv [ i ] ) % MOD ;
  }
  System . out . println ( ( ans * div ) % MOD ) ;
}
