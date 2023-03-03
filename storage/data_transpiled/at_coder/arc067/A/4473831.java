public static void prime ( int N ) {
  int p = 2 ;
  int koko = ( int ) ( N * 0.5 ) ;
  while ( N != 1 ) {
    if ( N % p == 0 ) {
      yaku [ p ] ++ ;
      N /= p ;
    }
    else if ( p > koko ) {
      p = N ;
    }
    else {
      p ++ ;
    }
  }
  return ;
  N = Integer . parseInt ( input ( ) ) ;
  int ans = 0 ;
  int mod = 10 * 9 + 7 ;
  yaku = new int [ 10 * 3 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    yaku [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    prime ( i ) ;
  }
  ans = 1 ;
  for ( int a : yaku ) {
    ans *= a + 1 ;
  }
  System . out . println ( ans % mod ) ;
}
