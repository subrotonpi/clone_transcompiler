public static int [ ] solve ( int N , int [ ] X ) {
  int * X = Integer . parseInt ( input ( ) ) ;
  int L = Integer . parseInt ( input ( ) ) ;
  int K = 20 ;
  int [ ] [ ] D = new int [ K + 1 ] [ K + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    D [ i ] [ 0 ] = N ;
  }
  int j = N - 1 ;
  for ( int i = N - 1 ;
  i >= 0 ;
  i -- ) {
    while ( j > 0 && X [ j ] - X [ i ] > L ) {
      j -- ;
    }
    D [ i ] [ 0 ] = j ;
  }
  for ( int k = 0 ;
  k < K ;
  k ++ ) {
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      if ( D [ i ] [ k ] != N ) {
        D [ i ] [ k + 1 ] = D [ i ] [ k ] ;
      }
    }
  }
  /* solve */
  if ( ! a < b ) {
    a = b ;
  }
  int Q = Integer . parseInt ( input ( ) ) ;
  int [ ] ans = new int [ Q ] ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int a = Integer . parseInt ( input ( ) ) ;
    int b = Integer . parseInt ( input ( ) ) ;
    ans [ i ] = solve ( a - 1 , b - 1 ) ;
  }
  System . out . println ( ( ans ) ) ;
  return ans ;
}
