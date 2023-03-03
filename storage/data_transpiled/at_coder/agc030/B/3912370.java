public static int L = Integer . parseInt ( input ) {
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] X = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) X [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( N == 1 ) {
    System . out . println ( Math . max ( X [ 0 ] , L - X [ 0 ] ) ) ;
    exit ( ) ;
  }
  int [ ] cumL = new int [ N ] ;
  for ( int x : X ) cumL [ cumL . length - 1 ] = cumL [ cumL . length - 1 ] + x ;
  int [ ] cumR = new int [ N ] ;
  for ( int x : X ) cumR [ cumR . length - 1 ] = cumR [ cumR . length - 1 ] + L - x ;
  int ans = 0 ;
  for ( int stL = 1 ;
  stL <= N ;
  stL ++ ) {
    int m = N - stL ;
    int r = m - m / 2 ;
    int l = stL + m / 2 ;
    int tmp = ( cumL [ l ] - cumL [ stL - 1 ] + cumR [ r ] ) * 2 ;
    if ( m % 2 ) tmp -= ( L - X [ - r ] ) ;
    else tmp -= X [ l - 1 ] ;
    ans = Math . max ( ans , tmp ) ;
  }
  for ( int stR = 1 ;
  stR <= N ;
  stR ++ ) {
    int m = N - stR ;
    int l = m - m / 2 ;
    int r = stR + m / 2 ;
    int tmp = ( cumR [ r ] - cumR [ stR - 1 ] + cumL [ l ] ) * 2 ;
    if ( m % 2 ) tmp -= X [ l - 1 ] ;
    else tmp -= ( L - X [ - r ] ) ;
    ans = Math . max ( ans , tmp ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
