static final < V > FordFulkerson < V > solve ( ) {
  final Map < V , Integer > g = new LinkedHashMap < V , Integer > ( ) {
    private static final long serialVersionUID = - 25613022472227L ;
    @ Override public void addEdge ( V u , V v , int c ) {
      g . put ( u , v , c ) ;
    }
    @ Override public int dfs ( V u , V t , int f , Set < V > used ) {
      if ( u == t ) {
        return f ;
      }
      used . add ( u ) ;
      for ( Map . Entry < V , Integer > entry : g . get ( u ) . entrySet ( ) ) {
        if ( ! used . contains ( entry . getKey ( ) ) && entry . getValue ( ) > 0 ) {
          f = Math . min ( entry . getValue ( ) , f ) ;
          int d = dfs ( entry . getKey ( ) , t , f , used ) ;
          if ( d > 0 ) {
            g . put ( u , entry . getValue ( ) , d ) ;
            g . put ( v , u ) ;
            return d ;
          }
        }
      }
      return 0 ;
    }
    @ Override public int maxFlow ( V s , V t ) {
      int f = 0 ;
      while ( true ) {
        int d = dfs ( s , t , Double . MAX_VALUE , new HashSet < V > ( ) ) ;
        if ( d == 0 ) {
          break ;
        }
        f += d ;
      }
      return f ;
    }
  }
  ;
  /* solve */
  final int N = Integer . parseInt ( input ( ) ) ;
  final int G = Integer . parseInt ( input ( ) ) ;
  final int E = Integer . parseInt ( input ( ) ) ;
  final int [ ] girls = Integer . parseInt ( input ( ) ) ;
  final int SINK = - 1 ;
  FordFulkerson < V > solver = new FordFulkerson < V > ( ) ;
  for ( int p : girls ) {
    solver . addEdge ( p , SINK , 1 ) ;
  }
  for ( int i = 0 ;
  i < E ;
  i ++ ) {
    final int u = Integer . parseInt ( input ( ) ) ;
    final int v = Integer . parseInt ( input ( ) ) ;
    solver . addEdge ( u , v , 1 ) ;
    solver . addEdge ( v , u , 1 ) ;
  }
  final int ans = solver . maxFlow ( 0 , SINK ) ;
  System . out . println ( ans ) ;
  