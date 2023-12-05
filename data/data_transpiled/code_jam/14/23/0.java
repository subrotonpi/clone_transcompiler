public static int T = Integer . parseInt ( readLine ( ) ) {
  for ( int Case = 0 ;
  Case < T ;
  Case ++ ) {
    int N = Integer . parseInt ( readLine ( ) ) ;
    int M = Integer . parseInt ( readLine ( ) ) ;
    int [ ] [ ] A = ArrayUtil . toArray ( new int [ N ] [ M ] ) ;
    int [ ] [ ] E = new int [ N ] [ M ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      A [ i ] [ 0 ] = stack [ p ] [ 1 ] ;
    }
    int [ ] [ ] ret = new int [ N ] [ M ] ;
    for ( int i = 0 ;
    i < M ;
    i ++ ) {
      int a = Integer . parseInt ( readLine ( ) ) ;
      int b = Integer . parseInt ( readLine ( ) ) ;
      a -- ;
      b -- ;
      E [ a ] [ 1 ] = stack [ p ] [ 1 ] ;
    }
    failattempt = new int [ N ] [ M ] ;
    while ( failattempt [ N ] > p + 1 ) {
      failattempt [ N ] = 1 ;
    }
    int t = Integer . parseInt ( readLine ( ) ) ;
    for ( int i = 0 ;
    i < E [ N ] [ 0 ] ;
    i ++ ) {
      if ( used [ i ] == 0 ) {
        int t = Integer . parseInt ( readLine ( ) ) ;
        for ( int j = 0 ;
        j < N ;
        j ++ ) {
          if ( used [ j ] == 0 ) {
            t = Integer . parseInt ( readLine ( ) ) ;
            if ( t != - 1 ) {
              t = Integer . parseInt ( A [ i ] ) + t ;
              if ( r == - 1 || t < r ) {
                r = t ;
              }
            }
          }
        }
      }
    }
    return r ;
  }
  int [ ] [ ] used = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    used [ i ] = 0 ;
  }
  used [ S ] = 1 ;
  int [ ] [ ] stack = new int [ N ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    stack [ i ] [ 1 ] = stack [ p ] [ 1 ] ;
  }
  String ret = String . valueOf ( A [ S ] ) ;
  /* dfs */
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( used [ i ] == 0 ) {
      stack [