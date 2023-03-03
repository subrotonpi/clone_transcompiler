static final PrioritizedHeap < Edge > PRIV_HEAP = new PrioritizedHeap < Edge > ( ) {
  private boolean [ ] used = new boolean [ n ] ;
  private final List < Edge > edgelist = new ArrayList < Edge > ( ) ;
  @ Override public int getPrioritizedEdge ( Edge edge ) {
    for ( Edge e : edge . get ( 0 ) ) {
      heapifyEdge ( edgelist , e ) ;
    }
    used [ 0 ] = false ;
    int res = 0 ;
    while ( edgelist . size ( ) != 0 ) {
      Edge minedge = heapifyEdge ( edgelist ) ;
      if ( ! used [ minedge . getTop ( ) ] ) continue ;
      int v = minedge . getTop ( ) ;
      used [ v ] = false ;
      for ( Edge e : edge . get ( v ) ) {
        if ( used [ e . getTop ( ) ] ) heapifyEdge ( edgelist , e ) ;
      }
      res += minedge . getTop ( ) ;
    }
    return res ;
  }
  @ Override public int getPrioritizedEdge ( Edge edge ) {
    int n = Integer . parseInt ( input ( ) ) ;
    Edge [ ] [ ] edge = new Edge [ n ] [ 2 ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      edge [ i ] = new Edge [ i ] ;
    }
    return edge . length ;
  }
}
