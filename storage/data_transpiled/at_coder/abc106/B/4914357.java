public static int N = Integer . parseInt ( input ) {
  int [ ] odds = new int [ N + 1 ] ;
  for ( int i = 1 ;
  i <= N ;
  i ++ ) {
    odds [ i ] = i ;
  }
  int ans = 0 ;
  for ( int odd : odds ) {
    int cnt = 0 ;
    for ( int bunbo : odds ) {
      if ( odd % bunbo == 0 ) {
        cnt ++ ;
      }
    }
    if ( cnt == 8 ) {
      ans ++ ;
    }
  }
  return ans ;
}
