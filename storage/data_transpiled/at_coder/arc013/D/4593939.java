@ GwtIncompatible ( "java.util.concurrent.atomic.BitSet" ) public static < T > Dinic < T > build ( int n ) {
  Dinic < T > dinic ;
  int m = 20 * 3 ;
  Dinic < T > dinic ;
  int [ ] [ ] edges = new int [ n ] [ n ] ;
  int [ ] iter = new int [ n ] ;
  level = null ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int x = Integer . parseInt ( input . readLine ( ) ) ;
    int y = Integer . parseInt ( input . readLine ( ) ) ;
    int z = Integer . parseInt ( input . readLine ( ) ) ;
    addV ( x , y , z ) ;
    addV ( y , z , x ) ;
  }
  for ( int v = 0 ;
  v < n ;
  v ++ ) {
    dinic . addEdge ( 0 , v , 1 ) ;
    dinic . addEdge ( v + m , m * 2 + 1 , 1 ) ;
  }
  System . out . println ( V . length * 2 - dinic . maxflow ( 0 , m * 2 + 1 ) ) ;
  edges [ to ] [ 0 ] = fr ;
  int flow = dfs ( source , sink , Double . MAX_VALUE ) ;
  while ( flow != 0 ) {
    maxFlow += flow ;
    flow = dfs ( source , sink , Double . MAX_VALUE ) ;
  }
  /* bfs */
  int [ ] [ ] edges = dinic . edges ;
  int [ ] level = new int [ n ] ;
  Arrays . fill ( level , - 1 ) ;
  level [ to ] = 0 ;
  Queue < Integer > q = new PriorityQueue < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int fr = q . remove ( ) ;
    for ( int j = 0 ;
    j < edges [ fr ] . length ;
    j ++ ) {
      int to = edges [ fr ] [ j ] ;
      cap = edges [ fr ] [ j ] ;
      final int rev = edges [ fr ] [ j ] ;
      if ( cap > 0 && level [ to ] < level [ to ] ) {
        int f = dfs ( to , sink , Math . min ( flow , cap ) ) ;
        if ( f > 0 ) {
          edges [ fr ] [ iter ] [ 1 ] -= f ;
          edges [ to ] [ rev ] += f ;
          return f ;
        }
      }
    }
  }
  return dinic ;
}
