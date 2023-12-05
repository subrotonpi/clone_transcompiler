public static int [ ] [ ] getans ( ) {
  int N = Integer . parseInt ( input ) ;
  int [ ] A = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) A [ i ] = Integer . parseInt ( input ) ;
  int mod = 10 * 9 + 7 ;
  int [ ] deni = new int [ N + 1 ] ;
  int [ ] quot = new int [ N + 1 ] ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) deni [ i ] = ( deni [ i - 1 ] * ( i + 1 ) ) % mod ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    double t = Math . pow ( i + 1 , mod - 2 , mod ) ;
    quot [ i ] = ( quot [ i - 1 ] * t ) % mod ;
  }
  deni = Arrays . copyOf ( deni , deni . length ) ;
  quot = Arrays . copyOf ( quot , quot . length ) ;
  int [ ] [ ] box = new int [ N + 1 ] [ N + 1 ] ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    if ( box [ A [ i ] - 1 ] [ 0 ] == 1 ) {
      int k_1 = box [ A [ i ] - 1 ] [ 1 ] ;
      int k_2 = N - i ;
      break ;
    }
    box [ A [ i ] - 1 ] = new int [ ] {
      1 , i }
      ;
    }
    int K = k_1 + k_2 ;
    int [ ] [ ] ans = new int [ N + 1 ] [ N + 2 ] ;
    for ( int k = 1 ;
    k <= N + 2 ;
    k ++ ) {
      if ( k == 1 ) ans [ k ] = N ;
      else if ( K >= k - 1 ) {
        int s = deni [ N + 1 ] ;
        s = ( s * quot [ k ] ) % mod ;
        s = ( s * quot [ N + 1 - k ] ) % mod ;
        int t = deni [ K ] ;
        t = ( t * quot [ k - 1 ] ) % mod ;
        t = ( t * quot [ K - k + 1 ] ) % mod ;
        ans [ k ] = ( s - t ) % mod ;
      }
      else {
        int s = deni [ N + 1 ] ;
        s = ( s * quot [ k ] ) % mod