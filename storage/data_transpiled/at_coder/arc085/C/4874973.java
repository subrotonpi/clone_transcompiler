static final class MaxFlow {
  class Edge {
    int to , cap , rev ;
    Edge ( int source , int sink , int i , int cap ) {
      this . to = source ;
      this . cap = cap ;
      this . rev = rev ;
    }
    int V = Integer . parseInt ( input . nextLine ( ) ) ;
    MaxFlow flow = new MaxFlow ( N + 2 ) {
      int source = N , sink = N + 1 ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        int a = i ;
        if ( a >= 0 ) flow . addEdge ( source , i , a ) ;
        else flow . addEdge ( i , sink , Math . abs ( a ) ) ;
      }
    }
    int cost = flow . dinic ( source , sink , INF ) ;
    System . out . println ( Arrays . toString ( A ) - cost ) ;
  }
  int i ;
  int i ;
  int i ;
  int i ;
  int start = 0 ;
  while ( true ) {
    bfs ( i , source ) ;
    if ( level [ sink ] < 0 ) return maxflow ;
    itr = new int [ V ] ;
    do {
      flow = dfs ( i , source , sink , INF ) ;
      if ( flow > 0 ) maxflow += flow ;
      else break ;
    }
    while ( true ) ;
    i = itr [ vertex ] ;
    while ( i < E [ i ] . size ( ) ) {
      itr [ vertex ] = i ;
      e = E [ i ] . get ( ) ;
      if ( e . cap > 0 && level [ vertex ] < level [ e . to ] ) {
        int d = dfs ( e . to , sink , Math . min ( flow , e . cap ) ) ;
        if ( d > 0 ) {
          e . cap -= d ;
          E [ e . to ] [ e . rev ] . cap += d ;
          return d ;
        }
      }
    }
  }
  int start = 0 ;
  while ( true ) {
    i = que . pollFirst ( ) ;
    i = que . pollFirst ( ) ;
    if ( i < start ) {
      i = i + 1 ;
    }
  }
  return flow ;
}
