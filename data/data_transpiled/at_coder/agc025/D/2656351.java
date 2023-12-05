@ VisibleForTesting static Iterable < Integer > combinations ( int N , int D1 , int D2 ) {
  int [ ] Ds = new int [ N ] ;
  int [ ] Ms = new int [ N ] ;
  for ( int D = D1 ;
  D < D2 ;
  D ++ ) {
    int M = 1 ;
    while ( D % 4 == 0 ) {
      D /= 4 ;
      M *= 2 ;
    }
    Ds [ D ] = D ;
    Ms [ M ] = M ;
  }
  int num = 0 ;
  for ( int i = 0 , j = 2 ;
  j < N ;
  j ++ ) {
    for ( int D = 0 , M = 2 ;
    D < Ds . length ;
    D ++ , M = 2 * M ;
    ) {
      if ( D % 2 != 0 ) {
        if ( ( i / M + j / M ) % 2 != 0 ) break ;
      }
      else {
        if ( ( i / M ) % 2 != 0 ) break ;
      }
    }
    else {
      System . out . println ( i + " " + j ) ;
      num ++ ;
      if ( num == N * N ) break ;
    }
  }
  return Arrays . asList ( Ds ) ;
}
