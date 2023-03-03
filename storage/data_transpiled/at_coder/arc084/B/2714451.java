@ VisibleForTesting static void heapify ( ) {
  int K = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> [ ] adjL = new List [ K ] ;
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    adjL [ i ] = new ArrayList < > ( ) ;
  }
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    adjL [ i ] . add ( new ArrayList < > ( ) ) ;
  }
  for ( int i = 0 ;
  i < K ;
  i ++ ) {
    adjL [ i ] . add ( new ArrayList < > ( ) ) ;
  }
  cost [ 1 ] = 0 ;
  PQ = new ArrayList < > ( ) ;
  heapify ( PQ , 0 , 1 ) ;
  while ( PQ . size ( ) > 0 ) {
    int cNow = PQ . get ( 0 ) ;
    int vNow = PQ . get ( 1 ) ;
    if ( vNow == 0 ) break ;
    if ( cNow > cost [ vNow ] ) continue ;
    for ( int v2 = 0 ;
    v2 < adjL [ vNow ] . size ( ) ;
    v2 ++ ) {
      int wt = adjL [ vNow ] . get ( v2 ) ;
      int c2 = cNow + wt ;
      if ( c2 < cost [ v2 ] ) {
        cost [ v2 ] = c2 ;
        heapify ( PQ , c2 , v2 ) ;
      }
    }
  }
  System . out . println ( cost [ 0 ] + 1 ) ;
}
