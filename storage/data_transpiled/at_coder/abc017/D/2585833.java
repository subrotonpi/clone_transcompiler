public static int [ ] parse ( String input ) {
  int N = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int M = Integer . parseInt ( input . split ( " " ) [ 1 ] ) ;
  int [ ] src = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) src [ i ] = Integer . parseInt ( input . split ( " " ) [ 0 ] ) ;
  int [ ] used = new int [ M + 1 ] ;
  int [ ] rtol = new int [ N ] ;
  int ans = 0 ;
  int r = 0 ;
  for ( int l = 0 ;
  l < N ;
  l ++ ) {
    while ( r < N && used [ src [ r ] ] == 0 ) {
      used [ src [ r ] ] ++ ;
      rtol [ r ] = l ;
      r ++ ;
    }
    used [ src [ l ] ] -- ;
  }
  MOD = 10 * 9 + 7 ;
  int [ ] dp = new int [ N ] ;
  dp [ 0 ] = 1 ;
  cdp [ 1 ] = 0 ;
  for ( int r = 0 ;
  r < N ;
  r ++ ) {
    int l = rtol [ r ] ;
    dp [ r ] = ( cdp [ r ] - 1 ) - cdp [ l ] ;
    cdp [ l ] = ( cdp [ l ] + dp [ l ] ) % MOD ;
  }
  System . out . println ( dp [ N ] % MOD ) ;
  return dp ;
}
