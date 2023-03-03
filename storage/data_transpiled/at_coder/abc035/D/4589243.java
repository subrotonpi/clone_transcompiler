static final int [ ] [ ] dijkstraHeap ( int s ) {
  final double [ ] d = new double [ n ] ;
  final boolean [ ] used = new boolean [ n ] ;
  Arrays . fill ( d , true ) ;
  d [ s ] = 0 ;
  used [ s ] = false ;
  final List < List < Edge >> edgelist = new ArrayList < List < Edge >> ( ) ;
  for ( Edge e : edge [ s ] ) {
    heapifyEdgeList ( edgelist , e ) ;
  }
  while ( edgelist . size ( ) > 0 ) {
    final List < Edge > minedge = heapifyEdgeList ( edgelist ) ;
    if ( ! used [ minedge . get ( 1 ) ] ) continue ;
    final int v = minedge . get ( 1 ) ;
    d [ v ] = minedge . get ( 0 ) ;
    used [ v ] = false ;
    for ( Edge e : edge . get ( v ) ) {
      if ( used [ e . getSecond ( ) ] ) heapifyEdgeList ( edgelist , e . getSecond ( ) + d [ v ] , e . getThird ( ) ) ;
    }
  }
  return d ;
}
