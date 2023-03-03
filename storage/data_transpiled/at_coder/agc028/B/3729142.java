public static int mod ( int mod , int [ ] a ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    a [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  }
  int F = 1 ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    F = ( F * i ) % mod ;
  }
  /* if (i == 0) {
  return 1;
  } else if (i == 1) {
  return i % mod;
  } else if (i % 2) {
  return power(i, 2)*i % mod;
  } */
  int [ ] inv = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    inv [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    inv [ i ] = power ( i + 1 , mod ) ;
  }
  int [ ] S_inv = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    S_inv [ i ] = S_inv [ i ] ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int p = S_inv [ i ] + S_inv [ N - i ] - 1 ;
    ans = ( ans + a [ i ] * F * p ) % mod ;
  }
  System . out . println ( ans ) ;
  return 0 ;
}
