public static int H = Integer . parseInt ( input ) {
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int MAX = H + W ;
  int MOD = 10 * 9 + 7 ;
  int [ ] fac = new int [ MAX ] ;
  int [ ] finv = new int [ MAX ] ;
  int [ ] inv = new int [ MAX ] ;
  fac [ 0 ] = fac [ 1 ] = 1 ;
  finv [ 0 ] = finv [ 1 ] = 1 ;
  inv [ 1 ] = 1 ;
  for ( int i = 2 ;
  i < MAX ;
  i ++ ) {
    fac [ i ] = fac [ i - 1 ] * i % MOD ;
    inv [ i ] = MOD - inv [ MOD % i ] * ( MOD / i ) % MOD ;
    finv [ i ] = finv [ i - 1 ] * inv [ i ] % MOD ;
  }
  /* COM */
  int ans = 0 ;
  for ( int w = B + 1 ;
  w <= W ;
  w ++ ) {
    ans += route ( H - A , w ) * route ( A , W - w + 1 ) ;
    ans %= MOD ;
  }
  System . out . println ( ans % MOD ) ;
  return MOD ;
}
