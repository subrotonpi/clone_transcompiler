@ VisibleForTesting static int [ ] [ ] dijkstra ( int vCount , @ Nonnull int [ ] [ ] edges , int start , int unreachable ) {
  int [ ] [ ] vertices = new int [ 300 ] [ vCount ] ;
  for ( int i = 0 ;
  i < vertices . length ;
  i ++ ) vertices [ i ] = new int [ N ] ;
  for ( int i = 0 ;
  i < vertices [ start ] . length ;
  i ++ ) vertices [ i ] [ 0 ] = unreachable ;
  int [ ] minB = new int [ N ] ;
  minB [ 0 ] = 0 ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) minB [ i ] = i ;
  vertices [ start ] = new int [ 300 ] ;
  PriorityQueue < Integer > q = new PriorityQueue < Integer > ( ) , rem = new PriorityQueue < Integer > ( ) ;
  q . add ( new Integer ( 0 ) ) ;
  rem . add ( new Integer ( start ) ) ;
  while ( rem . offer ( ) ) {
    int b = rem . poll ( ) ;
    int cost = rem . poll ( ) ;
    int v = rem . poll ( ) ;
    if ( vertices [ v ] [ b - minB [ v ] ] < cost ) continue ;
    for ( int i = v ;
    i < edges . length ;
    i ++ ) {
      int dest = b + edges [ i ] [ 0 ] ;
      boolean _b = edges [ i ] [ 1 ] ;
      int newB = b + _b ;
      int newCost = cost + ( _b ? newB : 1 ) ;
      if ( minB [ dest ] == - 1 ) minB [ dest ] = newB ;
      int bIndex = newB - minB [ dest ] + 1 ;
      if ( Math . min ( vertices [ dest ] [ bIndex + 1 ] , newCost ) > newCost ) {
        vertices [ dest ] [ bIndex ] = newCost ;
        heapifyPriorityQueue ( vertices , new int [ ] {
          newB , newCost , dest }
          ) ;
        }
      }
    }
    return vertices ;
  }
  