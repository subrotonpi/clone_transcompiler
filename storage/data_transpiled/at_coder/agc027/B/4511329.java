@ VisibleForTesting static void solve ( int N , int X , @ Nonnull List < Integer > x ) {
  int [ ] coeff = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) coeff [ i ] = i >= 3 ? 2 * i + 1 : 5 ;
  List < Integer > acc = Collections . unmodifiableList ( accumulate ( 0 ) . add ( x ) ) ;
  int tmp = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) tmp += coeff [ N - i ] * x . get ( i ) ;
  tmp += N * X + X ;
  int ans = tmp ;
  for ( int i = 2 ;
  i <= N ;
  i ++ ) {
    int tmpAns = 0 ;
    int p = N / i , q = N % i ;
    for ( int j = 0 ;
    j < p ;
    j ++ ) tmpAns += coeff [ p - j ] * ( acc . get ( q + i * ( j + 1 ) ) - acc . get ( q + i * j ) ) ;
    if ( q > 0 ) tmpAns += coeff [ p + 1 ] * acc . get ( q ) ;
    tmpAns += N * X + i * X ;
    ans = Math . min ( ans , tmpAns ) ;
  }
  System . out . println ( ans ) ;
  return ;
}
