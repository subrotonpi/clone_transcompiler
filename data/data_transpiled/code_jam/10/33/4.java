public static int T = Integer . parseInt ( input ) {
  int i , j ;
  int s = 0 ;
  do {
    if ( s + i >= M || s + j >= N ) return s ;
    for ( int ii = 0 ;
    ii <= s ;
    ii ++ ) {
      if ( b [ i + ii ] [ s + j ] != v ) return s ;
      if ( b [ s + i ] [ j + ii ] != v ) return s ;
    }
    s ++ ;
  }
  while ( true ) ;
  {
    if ( s + i >= M || s + j >= N ) return s ;
    for ( int ii = 0 ;
    ii <= s ;
    ii ++ ) {
      if ( b [ i + ii ] [ s + j ] != v ) return s ;
      if ( b [ s + i ] [ j + ii ] != v ) return s ;
    }
    s ++ ;
  }
  /* fill in case of a square size */
  for ( i = 0 ;
  i <= M ;
  i ++ ) {
    for ( int jj = 0 ;
    jj <= j ;
    jj ++ ) {
      b [ ii ] [ jj ] = null ;
    }
  }
  /* find the square size */
  int mi = 0 ;
  int mj = 0 ;
  int m = 0 ;
  for ( i = 0 ;
  i <= M ;
  i ++ ) {
    for ( int j = 0 ;
    j <= N ;
    j ++ ) {
      if ( b [ i ] [ j ] == null ) continue ;
      int s = sqSize ( b , b [ i ] [ j ] , M , N , i , j ) ;
      if ( s > m ) {
        m = s ;
        mi = i ;
        mj = j ;
      }
    }
  }
  /* fill in case of a square size */
  for ( int testCase = 0 ;
  testCase <= T ;
  testCase ++ ) {
    String line = input . readLine ( ) ;
    M = Integer . parseInt ( line . substring ( 0 , 1 ) ) ;
    N = Integer . parseInt ( line . substring ( 1 , 2 ) ) ;
    b = new boolean [ M ] [ N ] ;
    for ( int i = 0 ;
    i <= M ;
    i ++ ) {
      int [ ] r = new int [ N ] ;
      for ( int j = 0 ;
      j <= N ;
      j ++ ) {
        r [ j ] = Integer . parseInt ( line . substring ( 2 , j ) , 16 ) ;
      }
      boolean [ ] row = new boolean