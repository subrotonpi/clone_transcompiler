public static int N ( ) {
  int ans = 0 ;
  if ( N < 105 ) {
    ans = 0 ;
  }
  else {
    for ( int i = 105 ;
    i <= N ;
    i += 2 ) {
      int cnt = 0 ;
      for ( int j = 1 ;
      j <= N ;
      j += 2 ) {
        if ( i % j == 0 ) {
          cnt ++ ;
          if ( cnt == 8 ) {
            ans ++ ;
          }
        }
      }
    }
  }
  return ans ;
}
