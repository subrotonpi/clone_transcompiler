@ VisibleForTesting static int [ ] [ ] dijkstra ( int vCount , @ Nonnull int [ ] [ ] edges , int start , int unreachable ) {
  int bMax = 150 ;
  int [ ] [ ] vertices = new int [ vCount ] [ ] ;
  for ( int i = 0 ;
  i < vCount ;
  i ++ ) vertices [ i ] = new int [ bMax + 1 ] ;
  int [ ] minB = new int [ N ] ;
  minB [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) minB [ i ] = i ;
  vertices [ start ] = new int [ bMax ] ;
  PriorityQueue < Integer > q = new PriorityQueue < Integer > ( ) , rem = new PriorityQueue < Integer > ( ) ;
  q . add ( new Integer ( 0 ) ) ;
  rem . add ( new Integer ( start ) ) ;
  q . add ( new Integer ( vCount - 1 ) ) ;
  while ( q . size ( ) > 0 ) {
    int b = q . poll ( ) ;
    int cost = q . poll ( ) ;
    int v = rem . poll ( ) ;
    if ( vertices [ v ] [ b - minB [ v ] ] < cost ) continue ;
    for ( int dest = 0 ;
    dest < edges [ v ] . length ;
    dest ++ ) {
      boolean _b = edges [ v ] [ dest ] ;
      int newB = b + _b ;
      int newCost = cost + ( _b ? newB : 1 ) ;
      if ( minB [ dest ] == - 1 ) minB [ dest ] = newB ;
      int bIndex = newB - minB [ dest ] + 1 ;
      if ( bIndex >= bMax ) continue ;
      if ( Math . min ( vertices [ dest ] [ bIndex ] , newCost ) > newCost ) {
        vertices [ dest ] [ bIndex ] = newCost ;
        heapifyPriorityQueue ( vertices , new int [ ] {
          newB , newCost , dest }
          ) ;
        }
      }
    }
    return vertices ;
  }
  