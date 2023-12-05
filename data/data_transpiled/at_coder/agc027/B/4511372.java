@ VisibleForTesting static void solve ( int N , int X , @ Nonnull List < Integer > x ) {
  final int [ ] coeff = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) coeff [ i ] = i >= 3 ? 2 * i + 1 : 5 ;
  final List < Integer > acc = Collections . unmodifiableList ( accumulate ( 0 , x ) ) ;
  int ans = 10 * 32 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    int tmp = 0 ;
    final int p = N / i , q = N % i ;
    for ( int j = 0 ;
    j < p ;
    j ++ ) tmp += coeff [ p - j ] * ( acc . get ( q + i * ( j + 1 ) ) - acc . get ( q + i * j ) ) ;
    if ( q > 0 ) tmp += coeff [ p + 1 ] * acc . get ( q ) ;
    tmp += N * X + i * X ;
    ans = Math . min ( ans , tmp ) ;
  }
  System . out . println ( ans ) ;
  return ;
}
