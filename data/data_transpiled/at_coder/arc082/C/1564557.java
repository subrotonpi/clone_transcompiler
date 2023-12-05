@ VisibleForTesting static int from ( String input ) {
  int N = Integer . parseInt ( input ) ;
  List < Integer > xyList = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    xyList . add ( Collections . singletonList ( Integer . parseInt ( input ) ) ) ;
  }
  int M = 998244353 ;
  double res = Math . pow ( 2 , N , M ) ;
  res -= 1 ;
  res -= N ;
  int [ ] lineCnt = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int xi = xyList . get ( i ) ;
    int yi = xyList . get ( i ) ;
    double [ ] angleArray = new double [ N + 1 ] ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      int xj = xyList . get ( j ) ;
      int yj = xyList . get ( j ) ;
      if ( xj != xi ) angleArray [ j ] = ( yj - yi ) / ( xj - xi ) ;
      else if ( yj != yi ) angleArray [ j ] = 10000.0 ;
    }
    Counter cnt_i = new Counter ( angleArray ) ;
    for ( int k : cnt_i . values ( ) ) {
      lineCnt [ k + 1 ] ++ ;
    }
  }
  for ( int i = 2 ;
  i <= N ;
  i ++ ) {
    int cnt = lineCnt [ i ] / i ;
    res -= cnt * ( Math . pow ( 2 , i , M ) - i - 1 ) ;
  }
  res = res % M ;
  System . out . println ( res ) ;
  return res ;
}
