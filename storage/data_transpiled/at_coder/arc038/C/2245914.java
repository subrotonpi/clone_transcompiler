public static int N = Integer . parseInt ( input ) {
  int [ ] C = new int [ N ] ;
  int [ ] A = new int [ N ] ;
  int [ ] begin = new int [ N ] ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    C [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    A [ i ] &= 1 ;
  }
  int N0 = 2 * ( N - 1 ) ;
  int [ ] data = new int [ N0 * 2 ] ;
  /* update the k */
  int k = 0 ;
  int l = 0 ;
  int r = N0 ;
  if ( j <= data [ k ] ) {
    return l ;
  }
  while ( k < N0 - 1 ) {
    if ( data [ 2 * k + 1 ] < j ) {
      r = ( l + r ) / 2 ;
      k = 2 * k + 1 ;
    }
    else {
      l = ( l + r ) / 2 ;
      k = 2 * k + 2 ;
    }
  }
  /* query */
  update ( 0 , 0 ) ;
  int ans = 0 ;
  for ( int i = 1 ;
  i < N ;
  i ++ ) {
    k = query ( i - C [ i ] ) ;
    update ( k , i ) ;
    if ( A [ i ] ) ans ^= k ;
  }
  System . out . println ( ans > 0 ? "First" : "Second" ) ;
  return ans ;
}
