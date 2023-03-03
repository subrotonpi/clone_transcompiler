public static long solve ( int n , int k ) {
  final long MOD = 998244353 ;
  if ( n > k ) {
    return 0 ;
  }
  if ( n == 1 ) {
    return Math . pow ( 2 , k - 1 , MOD ) ;
  }
  long pf = 1 , kf = 1 ;
  for ( int m = 2 ;
  m <= k ;
  m ++ ) {
    pf = kf ;
    kf *= m ;
    kf %= MOD ;
  }
  long inv = Math . pow ( kf , MOD - 2 , MOD ) ;
  long [ ] invs = new long [ k + 1 ] ;
  invs [ k ] = inv ;
  for ( int m = k ;
  m > 1 ;
  m -- ) {
    inv *= m ;
    inv %= MOD ;
    invs [ m - 1 ] = inv ;
  }
  long ans = 0 ;
  if ( ( k & 1 ) == 0 ) {
    int r = k >>> 1 ;
    int s = k - n + 1 ;
    ans = pf * ( invs [ r ] * invs [ r - 1 ] - invs [ s ] * invs [ k - s - 1 ] ) % MOD ;
  }
  for ( int r = k / 2 + 1 ;
  r <= k ;
  r ++ ) {
    if ( r * 2 >= n + k ) {
      ans += kf * invs [ r ] * invs [ k - r ] ;
    }
    else {
      int s = r * 2 - n + 1 ;
      ans += kf * ( invs [ r ] * invs [ k - r ] - invs [ s ] * invs [ k - s ] ) ;
    }
    ans %= MOD ;
  }
  return ans ;
}
