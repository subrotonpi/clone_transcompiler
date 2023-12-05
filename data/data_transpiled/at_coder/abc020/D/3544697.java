public static int [ ] compute ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int K = Integer . parseInt ( input ) ;
  int MOD = 10 * 9 + 7 ;
  /* prime */
  int [ ] rec = new int [ N ] ;
  int i = 2 ;
  while ( i * i <= M ) {
    if ( M % i == 0 ) {
      rec [ i ] = i ;
      while ( M % i == 0 ) M /= i ;
    }
    i ++ ;
  }
  if ( M > 1 ) rec [ 0 ] = M ;
  /* calc */
  int [ ] div = prime ( K ) ;
  int Q = div . length ;
  int res = 0 ;
  for ( int i = 0 ;
  i < 1 << Q ;
  i ++ ) {
    int mul = 1 ;
    int k = 0 ;
    for ( int j = 0 ;
    j < Q ;
    j ++ ) {
      if ( ( i & 1 << j ) != 0 ) mul *= div [ j ] ;
      k ++ ;
    }
    int d = N / mul ;
    int tmp = d * ( d + 1 ) / 2 * mul ;
    tmp %= MOD ;
    if ( k % 2 != 0 ) {
      res -= tmp + MOD ;
      res %= MOD ;
    }
    else {
      res += tmp ;
      res %= MOD ;
    }
  }
  int ans = 0 ;
  int i = 1 ;
  while ( i * i <= K ) {
    if ( K % i == 0 ) {
      ans += K * compute ( N / i , K / i ) ;
      ans %= MOD ;
      if ( K / i != i ) {
        ans += K * compute ( N * i / K , i ) % MOD ;
        ans %= MOD ;
      }
    }
    i ++ ;
  }
  System . out . println ( ans ) ;
  return rec ;
}
