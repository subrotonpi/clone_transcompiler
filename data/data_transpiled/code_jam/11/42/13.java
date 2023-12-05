static final int N = Integer . parseInt ( System . in ) {
  int T = Integer . parseInt ( System . in ) ;
  for ( int no_t = 1 ;
  no_t <= T ;
  no_t ++ ) {
    int N = Integer . parseInt ( System . in ) ;
    int M = Integer . parseInt ( System . in ) ;
    int D = Integer . parseInt ( System . in ) ;
    int [ ] [ ] A = new int [ N ] [ M ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      A [ i ] [ i ] = Integer . parseInt ( System . in ) ;
    }
    int sol = 0 ;
    int [ ] sumx = new int [ M ] ;
    int [ ] sumy = new int [ M ] ;
    int [ ] nr = new int [ M ] ;
    for ( int j = 0 ;
    j < M ;
    j ++ ) {
      sumx [ i ] [ j ] = i * ( D + A [ i ] [ j ] ) ;
      sumy [ i ] [ j ] = j * ( D + A [ i ] [ j ] ) ;
      nr [ i ] [ j ] = D + A [ i ] [ j ] ;
      if ( i > 0 ) {
        sumx [ i ] [ j ] += sumx [ i - 1 ] [ j ] ;
        sumy [ i ] [ j ] += sumy [ i - 1 ] [ j ] ;
        nr [ i ] [ j ] += nr [ i - 1 ] [ j ] ;
      }
      if ( i > 0 && j > 0 ) {
        sumx [ i ] [ j ] -= sumx [ i - 1 ] [ j ] ;
        sumy [ i ] [ j ] -= sumy [ i - 1 ] [ j ] ;
        nr [ i ] [ j ] -= nr [ i - 1 ] [ j - 1 ] ;
      }
    }
    sol = 0 ;
    for ( int k = Math . min ( N , M ) ;
    k <= 2 ;
    k -- ) {
      if ( sol ++ > 0 ) break ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        for ( int j = 0 ;
        j < M ;
        j ++ ) {
          int auxx = sumx [ i ] [ j ] ;
          int auxy = sumy [ i ] [ j ] ;
          if ( ( i - k ) >= 0 ) {
            auxx -= sumx [ i ] [ j ] ;
            auxy -= sumy [ i ] [