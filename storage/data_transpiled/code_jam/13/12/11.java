static int readInteger ( ) {
  return Integer . parseInt ( in . readLine ( ) ) ;
  /* read array */
  int E = 0 ;
  int R = 0 ;
  /* update maybe and must */
  int i = 0 ;
  int j = i - 1 ;
  int m = maybe [ i ] ;
  while ( j >= 0 ) {
    m -= R ;
    if ( m < must [ j ] ) break ;
    must [ j ] = m ;
    j -- ;
  }
  j = i + 1 ;
  m = must [ i ] ;
  while ( j < maybe . length ) {
    m += R ;
    if ( m > maybe [ j ] ) break ;
    maybe [ j ] = m ;
    j ++ ;
  }
  for ( int test = 0 ;
  test < readInteger ( ) ;
  test ++ ) {
    System . out . println ( "Case #" + ( test + 1 ) + ":" ) ;
    E = in . readInt ( ) ;
    R = in . readInt ( ) ;
    N = in . readInt ( ) ;
    int V = in . readInt ( ) ;
    int [ ] D = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) D [ i ] = - 1 ;
    maybe = new int [ E ] ;
    must = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      V [ i ] = in . readInt ( ) ;
    }
    int best = 0 ;
    for ( int v = 0 ;
    v < tasks . length ;
    v ++ ) {
      int i = tasks [ v ] ;
      best += v * ( maybe [ i ] - must [ i ] ) ;
      D [ i ] = maybe [ i ] - must [ i ] ;
      update ( maybe , must , i , D ) ;
    }
    System . out . println ( best ) ;
  }
  return E ;
}
