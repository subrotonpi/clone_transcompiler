@ VisibleForTesting static void heapify ( ) {
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
  int [ ] dij = new int [ K ] ;
  boolean [ ] visit = new boolean [ K ] ;
  int [ ] val = new int [ K ] ;
  Arrays . fill ( val , 10 * 9 ) ;
  Arrays . fill ( dij , 1 ) ;
  heapify ( dij , 0 , 1 ) ;
  while ( dij . length > 0 ) {
    int d = dij [ 0 ] ;
    int x = dij [ 0 ] ;
    if ( val [ x ] < d ) {
      continue ;
    }
    for ( int q = 0 ;
    q < table [ x ] ;
    q ++ ) {
      int y = table [ x ] ;
      if ( val [ y ] > val [ x ] + q ) {
        val [ y ] = val [ x ] + q ;
        heapify ( dij , val [ y ] , y ) ;
      }
    }
  }
  System . out . println ( val [ 0 ] + 1 ) ;
}
