public static int L = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] X = new int [ N ] ;
  int [ ] sumL = new int [ N ] ;
  int [ ] sumR = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
    sumL [ i ] = sumL [ N - 1 ] + X [ N - 1 ] ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    sumR [ i ] = sumR [ N - 1 ] + L - X [ N - i ] ;
  }
  sumR [ N ] = 0 ;
  Collections . reverse ( sumR ) ;
  int ans = 0 ;
  for ( int b = 0 ;
  b < N + 1 ;
  b ++ ) {
    int z = sumL [ b ] + sumR [ b + 1 ] ;
    if ( ( b > 0 ) && ( b < N - b ) ) {
      if ( ( b <= N - b ) && ( b < N - b ) ) {
        ans = Math . max ( ans , z + sumL [ b - 1 ] + sumR [ b + 1 ] - 2 * sumR [ N + 1 - ( N - b - b ) ] ) ;
      }
      else {
        ans = Math . max ( ans , z + sumL [ b - 1 ] + sumR [ b + 1 ] - 2 * sumL [ b - ( N - b ) - 1 ] ) ;
      }
    }
    if ( ( b < N ) && ( b < N ) ) {
      if ( ( b >= N - b ) && ( b < N - b ) ) {
        ans = Math . max ( ans , z + sumL [ b ] + sumR [ b + 2 ] - 2 * sumL [ b - ( N - b ) ] ) ;
      }
      else {
        ans = Math . max ( ans , z + sumL [ b ] + sumR [ b + 2 ] - 2 * sumR [ N + 1 - ( N - b - b ) + 1 ] ) ;
      }
    }
  }
  System . out . println ( ans ) ;
  return ans ;
}
