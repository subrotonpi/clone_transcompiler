public static int nCk ( int n , int A , int B , int k ) {
  int MOD = 998244353 ;
  int MAX = 3 * 10 * 5 + 2 ;
  int [ ] fac = new int [ MAX ] ;
  int [ ] inv = new int [ MAX ] ;
  int [ ] ifac = new int [ MAX ] ;
  fac [ 0 ] = 1 ;
  fac [ 1 ] = 1 ;
  inv [ 1 ] = 1 ;
  ifac [ 0 ] = 1 ;
  ifac [ 1 ] = 1 ;
  for ( int i = 2 ;
  i < MAX ;
  i ++ ) {
    fac [ i ] = fac [ i - 1 ] * i % MOD ;
    inv [ i ] = inv [ MOD % i ] * ( MOD - MOD / i ) % MOD ;
    ifac [ i ] = ifac [ i - 1 ] * inv [ i ] % MOD ;
  }
  /* if (n < k || n < 0 || k < 0) return 0; */
  int ans = 0 ;
  for ( int i = n + 1 ;
  i < MAX ;
  i ++ ) {
    if ( ( k - A * i ) % B == 0 ) {
      int b = ( k - A * i ) / B ;
      if ( 0 <= b && b <= n ) ans = ( ans + nCk ( i , i ) * nCk ( n , b ) ) % MOD ;
    }
  }
  if ( ans == 0 ) System . out . println ( 1 ) ;
  else System . out . println ( ans ) ;
  return ans ;
}
