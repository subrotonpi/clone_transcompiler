public static int inv ( int x , int mod ) {
  return pow ( x , mod - 2 , mod ) ;
  mod = 10 * 9 + 7 ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] fact = new int [ N ] ;
  fact [ 0 ] = 1 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    fact [ i ] = fact [ i - 1 ] * i % mod ;
  }
  int [ ] invFact = new int [ N ] ;
  invFact [ 0 ] = inv ( fact [ N - 1 ] ) ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    invFact [ i ] = invFact [ i - 1 ] * i % mod ;
  }
  invFact = invFact [ N ] ;
  int ans = 0 ;
  int prev = 0 ;
  for ( int k = ( N + 1 ) / 2 ;
  k < N ;
  k ++ ) {
    int cnt = fact [ k - 1 ] * invFact [ k * 2 - N ] % mod * fact [ k ] % mod ;
    ans += ( cnt - prev + mod ) * k ;
    ans %= mod ;
    prev = cnt ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
