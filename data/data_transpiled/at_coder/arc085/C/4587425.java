static final String getInput ( ) {
  Scanner input = new Scanner ( System . in ) ;
  System . setIn ( input ) ;
  @ SuppressWarnings ( "resource" ) final int n = input . nextInt ( ) ;
  final int [ ] [ ] edges = new int [ n ] [ n ] ;
  int s = 0 ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    if ( A [ i ] <= 0 ) {
      edges [ s ] [ i ] = - A [ i ] ;
    }
    else {
      s += A [ i ] ;
      edges [ s ] [ i ] = new int [ n + 1 ] ;
      for ( int j = 2 * ( i + 1 ) ;
      j <= n ;
      j ++ ) edges [ s ] [ j ] = new int [ j + 1 ] ;
    }
  }
  final Dinic dinic = new Dinic ( n + 2 , Edges ) ;
  System . out . println ( s - dinic . maxflow ( 0 , n + 1 ) ) ;
  final int [ ] [ ] edges = new int [ n ] [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    int fr = edges [ i ] [ 0 ] ;
    int to = edges [ i ] [ 1 ] ;
    int cap = edges [ i ] [ 2 ] ;
    edges [ fr ] [ 0 ] = to ;
    edges [ fr ] [ 1 ] = Math . min ( fr , 0 ) ;
    edges [ fr ] [ 2 ] = Math . min ( fr , 0 ) ;
  }
  int maxFlow = 0 ;
  do {
    bfs ( i ) ;
    if ( level [ sink ] < 0 ) return maxFlow ;
    iter = new int [ n ] ;
    int flow = dfs ( i , sink , Double . MAX_VALUE ) ;
    while ( flow > 0 ) {
      maxFlow += flow ;
      flow = dfs ( i , sink , Double . MAX_VALUE ) ;
    }
  }
  while ( iter . hasNext ( ) ) ;
  final int [ ] [ ] edges = new int [ n ] ;
  final int [ ] level = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    edges [ i ] = edges [ i ] [ iter . next ( ) ] ;
  }
  int fr = edges [ fr ] [ n ] ;
  level [ fr ] = 0 ;
  Queue < Integer > q = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++