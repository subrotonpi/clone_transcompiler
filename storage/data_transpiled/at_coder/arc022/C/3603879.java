@ VisibleForTesting static int [ ] [ ] dijkstra ( int num , int start ) {
  int [ ] dist = new int [ num ] ;
  for ( int i = 0 ;
  i < num ;
  i ++ ) dist [ i ] = Double . MAX_VALUE ;
  dist [ start ] = 0 ;
  PriorityQueue < Integer > q = new PriorityQueue < > ( ) ;
  q . add ( new Integer [ ] {
    dist [ start ] , start }
    ) ;
    while ( q . size ( ) > 0 ) {
      int du = q . poll ( ) ;
      int u = q . poll ( ) ;
      for ( int j = 0 ;
      j < adj [ u ] . length ;
      j ++ ) {
        if ( dist [ j ] > du + j ) {
          dist [ j ] = du + j ;
          q . add ( j ) ;
        }
      }
    }
    return dist ;
  }
  