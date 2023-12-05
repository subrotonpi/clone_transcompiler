public static int MOD = 10 * * 9 + 7 ;
int MAX = 10 * * 6 ;
int [ ] fac = new int [ MAX ] ;
int [ ] finv = new int [ MAX ] ;
int [ ] inv = new int [ MAX ] ;
{
  fac [ 0 ] = fac [ 1 ] = 1 ;
  finv [ 0 ] = finv [ 1 ] = 1 ;
  inv [ 1 ] = 1 ;
}
{
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
}
{
  int N , M ;
  int ans ;
  int i ;
  N = Integer . parseInt ( input . nextLine ( ) ) ;
  M = Integer . parseInt ( input . nextLine ( ) ) ;
  ans = 1 ;
  combInit ( ) ;
  i = 2 ;
  nokori = M ;
  while ( i * i <= nokori ) {
    if ( nokori % i == 0 ) {
      int cnt = 0 ;
      while ( nokori % i == 0 ) {
        cnt ++ ;
        nokori /= i ;
      }
      ans *= comb ( N + cnt - 1 , N - 1 ) ;
      ans %= MOD ;
    }
    i ++ ;
  }
  if ( nokori != 1 ) {
    ans *= comb ( N + 1 - 1 , N - 1 ) ;
    ans %= MOD ;
  }
  System . out . println ( ans ) ;
}
