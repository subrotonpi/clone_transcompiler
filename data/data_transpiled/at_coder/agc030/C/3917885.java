public static int K = Integer . parseInt ( input ) {
  int M = 1000 ;
  {
    int tmp = ( i - j ) % ( M / 2 ) + 1 ;
    if ( j % 2 == 0 || M + 1 - tmp > K ) {
      return tmp ;
    }
    else {
      return M + 1 - tmp ;
    }
  }
  if ( K <= M / 2 ) {
    System . out . println ( K ) ;
    for ( int i = 0 ;
    i < K ;
    i ++ ) {
      System . out . println ( ( ( int [ ] ) ( i + 1 ) ) * K ) ;
    }
  }
  else {
    System . out . println ( M / 2 ) ;
    for ( int j = 0 ;
    j < M / 2 ;
    j ++ ) {
      System . out . println ( ( ( int [ ] ) ( M / 2 ) ) * M ) ;
    }
  }
  return M ;
}
