static final double [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] append ( new Dinic [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] ) {
  int i = 0 ;
  for ( int j = 0 ;
  j < vnum ;
  j ++ ) {
    edge = new int [ N ] [ N ] [ ] [ ] [ ] [ ] [ ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      edge [ i ] [ j ] = new int [ N ] [ ] [ ] ;
      for ( int j = 2 * i ;
      j < N ;
      j ++ ) {
        K . addedge ( i , j , inf ) ;
      }
    }
    System . out . println ( Arrays . toString ( [ ] [ ] [ ] ) [ 0 ] - K . getmf ( 0 , N + 1 ) ) ;
    edge [ en ] [ 0 ] = new int [ N ] [ ] [ ] [ ] [ ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      edge [ i ] [ i ] = new int [ N ] ;
      for ( int j = 0 ;
      j < N ;
      j ++ ) {
        edge [ i ] [ j ] [ i ] = i ;
      }
    }
    System . out . println ( Arrays . toString ( [ ] [ ] ) [ 0 ] - K . getmf ( 0 , N + 1 ) ) ;
    edge [ en ] [ 0 ] = 0 ;
    Queue < Integer > Q = new LinkedList < Integer > ( ) ;
    Q . add ( vst ) ;
    while ( Q . size ( ) > 0 ) {
      int nv = Q . poll ( ) ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        int vt = edge [ i ] [ i ] [ 0 ] ;
        int c = edge [ i ] [ i ] [ 1 ] ;
        int r = edges [ i ] [ i ] [ 0 ] ;
        if ( dist [ vt ] == - 1 && c > 0 ) {
          dist [ vt ] = dist [ nv ] + 1 ;
          Q . add ( vt ) ;
        }
      }
    }
    dist = dist ;
  }
  int [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ]