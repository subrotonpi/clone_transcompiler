@ VisibleForTesting static void input ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] table = new int [ K ] [ K ] ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    table [ i ] [ 0 ] = 1 ;
    table [ i ] [ 1 ] = ( i + 1 ) % K ;
    int t = ( 10 * i ) % K ;
    if ( t != i ) {
      table [ i ] [ 0 ] = t ;
    }
  }
  Deque < Integer > dij = new ArrayDeque < > ( ) ;
  visit = new boolean [ K ] ;
  int [ ] val = new int [ K ] ;
  val [ 1 ] = 0 ;
  dij . add ( new Integer ( 0 ) ) ;
  while ( dij . size ( ) > 0 ) {
    int d = dij . poll ( ) ;
    int x = dij . poll ( ) ;
    if ( val [ x ] < d ) {
      continue ;
    }
    for ( int q = 0 ;
    q < table [ x ] . length ;
    q ++ ) {
      int y = table [ x ] [ q ] ;
      if ( val [ y ] > val [ x ] + q ) {
        val [ y ] = val [ x ] + q ;
      }
      else {
        dij . add ( val [ y ] ) ;
      }
    }
  }
  System . out . println ( val [ 0 ] + 1 ) ;
}
