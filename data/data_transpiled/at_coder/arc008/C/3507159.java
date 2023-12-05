@ VisibleForTesting static int [ ] [ ] dijkstra ( int vCount , @ Nonnull final Edge [ ] edges , final int start , final boolean ... adj_matrix , float unreachable ) {
  @ Nonnull final int [ ] [ ] vertices = new int [ vCount ] [ ] ;
  vertices [ start ] = unreachable ;
  vertices [ start ] = 0 ;
  PriorityQueue < Integer > q = new PriorityQueue < > ( ) , rem = new PriorityQueue < > ( ) , vCount - 1 ;
  while ( q . isEmpty ( ) && rem . hasNext ( ) ) {
    final float cost = q . peek ( ) ;
    final int v = vertices [ v ] ;
    if ( vertices [ v ] < cost ) continue ;
    rem . remove ( ) ;
    final List < Integer > dests = adj_matrix ? Arrays . asList ( edges [ v ] ) : edges [ v ] ;
    for ( int dest : dests ) {
      final float _cost = cost + _cost ;
      if ( vertices [ dest ] > newcost ) {
        vertices [ dest ] = newcost ;
        heapifyPriorityQueue ( vertices , new PriorityQueue < > ( ) , new PriorityQueue < > ( ) , new PriorityQueue < > ( ) , new PriorityQueue < > ( ) , new PriorityQueue < > ( ) , new PriorityQueue < > ( ) ) ;
      }
    }
  }
  return vertices ;
}
