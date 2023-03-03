static private int [ ] dijkstra ( Map < Integer , Integer > graph , int node , int start ) {
  final int [ ] dist = new int [ node ] ;
  for ( int i = 0 ;
  i < node ;
  i ++ ) dist [ i ] = Double . MAX_VALUE ;
  dist [ start ] = 0 ;
  PriorityQueue < Integer > q = new PriorityQueue < > ( ) ;
  heapq . add ( new Integer ( 0 ) ) ;
  while ( q . size ( ) > 0 ) {
    int cost = q . poll ( ) ;
    int curNode = graph . get ( curNode ) ;
    if ( dist [ curNode ] < cost ) continue ;
    for ( int nexCost = 0 ;
    nexCost < graph . get ( curNode ) ;
    nexCost ++ ) {
      int nexNode = graph . get ( curNode ) ;
      int distCand = dist [ curNode ] + nexCost ;
      if ( distCand < dist [ nexNode ] ) {
        dist [ nexNode ] = distCand ;
        heapq . add ( new Integer ( dist [ nexNode ] ) ) ;
      }
    }
  }
  return dist ;
}
