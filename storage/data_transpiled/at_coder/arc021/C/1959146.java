public static int K = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] A = new int [ N ] ;
  int [ ] D = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = 0 ;
    D [ i ] = Integer . parseInt ( ( input . nextLine ( ) ) ) ;
  }
  /* get M */
  int res = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( M >= A [ i ] ) {
      res += 1 + ( M - A [ i ] ) / D [ i ] ;
    }
  }
  /* get M */
  int lo = 0 ;
  int hi = Math . pow ( 10 , 15 ) ;
  while ( hi - lo > 1 ) {
    int mid = ( hi + lo ) / 2 ;
    if ( M >= K ) {
      hi = mid ;
    }
    else {
      lo = mid ;
    }
  }
  int M = hi ;
  int k = 0 ;
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( M >= A [ i ] ) {
      int n = ( M - A [ i ] ) / D [ i ] ;
      ans += ( n + 1 ) * A [ i ] ;
      ans += D [ i ] * ( n + 1 ) * n / 2 ;
      k += n + 1 ;
      if ( ( k >= K ) && ( k < M ) ) {
        ans -= ( k - K ) * M ;
        k = K ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
