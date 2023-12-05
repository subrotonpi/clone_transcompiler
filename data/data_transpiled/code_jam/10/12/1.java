public static int T = Integer . parseInt ( Scanner in ) {
  for ( int testCase = 0 ;
  testCase < T ;
  testCase ++ ) {
    int D = in . nextInt ( ) ;
    int I = in . nextInt ( ) ;
    int M = in . nextInt ( ) ;
    int N = in . nextInt ( ) ;
    int a [ ] = in . nextInt ( ) ;
    int dp [ ] [ ] = new int [ N + 1 ] [ 256 ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      dp [ 0 ] [ j ] = 0 ;
    }
    for ( int i = 1 ;
    i <= N ;
    i ++ ) {
      for ( int j = 0 ;
      j < 256 ;
      j ++ ) {
        dp [ i ] [ j ] = D + dp [ i - 1 ] [ j ] ;
        for ( int k = 0 ;
        k < 256 ;
        k ++ ) {
          if ( Math . abs ( k - j ) <= M ) {
            dp [ i ] [ j ] = Math . min ( dp [ i ] [ j ] , dp [ i - 1 ] [ k ] + Math . abs ( a [ i - 1 ] - j ) ) ;
          }
        }
      }
      if ( M != 0 ) {
        for ( int j = 0 ;
        j < 256 ;
        j ++ ) {
          for ( int k = 0 ;
          k < j ;
          k ++ ) {
            int cost = ( j - k + M - 1 ) / M * I ;
            dp [ i ] [ j ] = Math . min ( dp [ i ] [ j ] , dp [ i ] [ k ] + cost ) ;
          }
        }
        for ( int j = 255 ;
        j >= 0 ;
        j -- ) {
          for ( int k = 255 ;
          k >= j ;
          k -- ) {
            int cost = ( k - j + M - 1 ) / M * I ;
            dp [ i ] [ j ] = Math . min ( dp [ i ] [ j ] , dp [ i ] [ k ] + cost ) ;
          }
        }
      }
    }
  }
  double ans = 1e9 ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    ans = Math . min ( ans , dp [ N ] [ j ] ) ;
  }
  System . out . println ( "Case #" + ( testCase + 1 ) + ": " + ans ) ;
  return ans ;
}
