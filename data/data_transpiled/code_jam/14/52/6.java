public static int cases = Integer . parseInt ( readLine ( ) ) {
  for ( int testCase = 1 ;
  testCase <= cases ;
  testCase ++ ) {
    int P = Integer . parseInt ( readLine ( ) ) ;
    int Q = Integer . parseInt ( readLine ( ) ) ;
    int n = Integer . parseInt ( readLine ( ) ) ;
    int [ ] H = new int [ n ] ;
    int [ ] G = new int [ n ] ;
    int [ ] T = new int [ n ] ;
    int [ ] R = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int h = Integer . parseInt ( readLine ( ) ) ;
      int g = Integer . parseInt ( readLine ( ) ) ;
      H [ i ] = h ;
      G [ i ] = g ;
      int t = 0 ;
      while ( h > 0 ) {
        if ( h - Q * ( ( ( h + Q - 1 ) / Q ) - 1 ) <= P ) break ;
        h -= P ;
        t ++ ;
      }
      if ( h > 0 ) {
        R [ i ] = ( ( h + Q - 1 ) / Q ) - 1 ;
        T [ i ] = t + 1 ;
      }
      else T [ i ] = - 1 ;
    }
    int [ ] D = new int [ n ] ;
    int [ ] N = new int [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      for ( int j = 0 ;
      j < D . length ;
      j ++ ) {
        int q = ( H [ i ] + Q - 1 ) / Q ;
        if ( ( q + j ) >= 0 ) N [ q + j ] = Math . max ( N [ q + j ] , D [ j ] ) ;
        else N [ q + j ] = D [ j ] ;
        if ( T [ i ] != - 1 ) {
          int p = T [ i ] ;
          int q = R [ i ] ;
          if ( p <= q + j ) {
            if ( ( q + j - p ) >= 0 ) N [ q + j - p ] = Math . max ( N [ q + j - p ] , D [ j ] + G [ i ] ) ;
            else N [ q + j - p ] = D [ j ] + G [ i ] ;
          }
        }
      }
    }
    D = N ;
    N = N ;
  }
  int res = 0 ;
  for ( int i = 0 ;
  i < D . length ;
  i ++ ) {
    if ( res