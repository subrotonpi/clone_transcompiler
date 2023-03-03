public static int n = Integer . parseInt ( input ) {
  int row = 0 ;
  for ( int i = 0 ;
  i < 100 ;
  i ++ ) {
    if ( 2 * i <= n && n <= 2 * ( i + 1 ) - 1 ) {
      row = i ;
      break ;
    }
  }
  /* seki k */
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    k = 4 * k + 2 ;
  }
  int k = 0 ;
  if ( row % 2 != 0 ) {
    k = 2 ;
    int cri = seki ( k , row / 2 ) ;
    if ( n < cri ) {
      System . out . println ( "Aoki" ) ;
    }
    else {
      System . out . println ( "Takahashi" ) ;
    }
  }
  else {
    k = 1 ;
    int cri = seki ( k , row / 2 ) ;
    if ( n < cri ) {
      System . out . println ( "Takahashi" ) ;
    }
    else {
      System . out . println ( "Aoki" ) ;
    }
  }
  return k ;
}
