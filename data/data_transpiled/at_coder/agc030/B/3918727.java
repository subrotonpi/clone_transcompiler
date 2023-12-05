public static int [ ] convert ( String input ) {
  int L = Integer . parseInt ( input ) ;
  int N = Integer . parseInt ( input ) ;
  int [ ] X = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X [ i ] = Integer . parseInt ( input ) ;
  }
  Arrays . sort ( X ) ;
  int ma = 0 ;
  for ( int k = 0 ;
  k < 2 ;
  k ++ ) {
    if ( k == 1 ) {
      X = new int [ N + 1 ] ;
      for ( int i = 1 ;
      i <= N ;
      i ++ ) {
        X [ i ] = L - X [ i - 1 ] ;
      }
    }
    int s = X [ 0 ] ;
    for ( int i = 1 ;
    i <= N ;
    i ++ ) {
      if ( i % 2 == 1 ) {
        s += L - X [ - ( i / 2 ) - 1 ] + X [ i / 2 ] ;
      }
      else {
        s += X [ i / 2 ] + ( L - X [ - ( i / 2 ) ] ) ;
      }
    }
    ma = Math . max ( ma , s ) ;
    int lt = N % 2 == 1 ? ( N - 1 ) / 2 : - N / 2 ;
    for ( int i = 1 ;
    i <= N ;
    i ++ ) {
      if ( lt > 0 ) {
        if ( N % 2 == 1 ) {
          s += X [ lt ] - X [ i - 1 ] * 2 - ( L - X [ lt + 1 ] ) ;
        }
        else {
          s += X [ lt ] - X [ i - 1 ] * 2 - ( L - X [ lt + 1 ] ) ;
        }
        lt = 1 + lt - N ;
        ma = Math . max ( ma , s ) ;
      }
      else {
        if ( N % 2 == 1 ) {
          s += X [ lt ] - X [ i - 1 ] * 2 - ( L - X [ lt ] ) ;
        }
        else {
          s += X [ lt ] * 2 - L - X [ i - 1 ] * 2 ;
        }
        lt = N + lt ;
        ma = Math . max ( ma , s ) ;
      }
    }
  }
  System . out . println ( ma ) ;
  return X ;
}
