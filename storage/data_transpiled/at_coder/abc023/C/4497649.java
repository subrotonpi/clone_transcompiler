public static int R = Integer . parseInt ( input ) {
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] rc = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) rc [ i ] = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] rcnt = new int [ R ] ;
  int [ ] ccnt = new int [ C ] ;
  for ( int ri = 0 ;
  ri < rc . length ;
  ri ++ ) {
    rcnt [ rc [ ri ] - 1 ] ++ ;
    ccnt [ rc [ ci ] - 1 ] ++ ;
  }
  int [ ] rhist = new int [ C + 1 ] ;
  int [ ] chist = new int [ R + 1 ] ;
  for ( int i = 0 ;
  i < R ;
  i ++ ) {
    for ( int j = 0 ;
    j < ccnt . length ;
    j ++ ) chist [ ccnt [ j ] ] ++ ;
  }
  int ans = 0 ;
  for ( int i = 0 ;
  i < K + 1 ;
  i ++ ) {
    if ( rc [ i ] > C || ( K - i ) > R ) continue ;
    ans += ( rhist [ i ] * chist [ K - i ] ) ;
  }
  for ( int ri = 0 ;
  i < rc . length ;
  ri ++ ) {
    if ( rc [ i ] + ccnt [ ci - 1 ] == K + 1 ) ans ++ ;
    else if ( rc [ i ] + ccnt [ ci - 1 ] == K ) ans -- ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
