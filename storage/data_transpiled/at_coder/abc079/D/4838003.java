static private int [ ] [ ] dijkstra ( Map < Integer , List < Integer >> graph , int node , int start ) {
  final int [ ] dist = new int [ node ] ;
  for ( int i = 0 ;
  i < node ;
  i ++ ) dist [ i ] = Double . MAX_VALUE ;
  dist [ start ] = 0 ;
  PriorityQueue < Integer > q = new PriorityQueue < > ( ) ;
  heapq . add ( new Integer [ ] {
    0 , start }
    ) ;
    while ( q . size ( ) > 0 ) {
      int cost = q . poll ( ) ;
      int curNode = graph . get ( curNode ) ;
      if ( dist [ curNode ] < cost ) continue ;
      for ( int nexCost = 0 ;
      nexCost < graph . get ( curNode ) . size ( ) ;
      nexCost ++ ) {
        int nexNode = graph . get ( curNode ) . get ( nexCost ) ;
        int distCand = dist [ curNode ] + nexCost ;
        if ( distCand < dist [ nexNode ] ) {
          dist [ nexNode ] = distCand ;
          heapq . add ( new Integer [ ] {
            dist [ nexNode ] }
            ) ;
          }
        }
      }
      return dist ;
    }
    