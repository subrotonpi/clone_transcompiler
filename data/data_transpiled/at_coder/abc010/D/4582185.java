static final int [ ] [ ] getSolutionRoots ( ) {
  final Scanner input = new Scanner ( System . in ) ;
  System . setIn ( new StdIn ( 10 * 9 ) ) ;
  @ SuppressWarnings ( "resource" ) final int n = input . nextInt ( ) ;
  final int [ ] [ ] edges = new int [ n ] [ 2 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    final int a = input . nextInt ( ) ;
    final int b = input . nextInt ( ) ;
    edges [ i ] = new int [ a ] ;
    edges [ i ] [ 0 ] = b ;
    edges [ i ] [ 1 ] = a ;
  }
  final DinicGraph dinic = new DinicGraph ( n + 1 , edges ) ;
  System . out . println ( dinic . maxflow ( 0 , n ) ) ;
  {
    final int [ ] [ ] edges = dinic . edges ;
    for ( int i = 0 ;
    i < edges . length ;
    i ++ ) {
      final int origin = edges [ i ] [ 0 ] ;
      final int dest = edges [ i ] [ 1 ] ;
      final int cap = edges [ i ] [ 2 ] ;
      edges [ i ] [ 0 ] = dest ;
      edges [ i ] [ 1 ] = cap ;
      edges [ i ] [ 2 ] = origin ;
      edges [ i ] [ 3 ] = 0 ;
      edges [ i ] [ 4 ] = origin ;
      edges [ i ] [ 5 ] = 0 ;
      edges [ i ] [ 6 ] = origin ;
      edges [ i ] [ 7 ] = origin ;
    }
  }
  {
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
    while ( flow > 0 ) ;
  }
  {
    final int [ ] [ ] edges = dinic . edges ;
    final int [ ] level = new int [ n ] ;
    final Deque < Integer > q = new ArrayDeque < > ( ) ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      final int fr = q . remove ( ) ;
      for ( int to = 0 ;
      to < edges [ fr ] ;
      to ++ ) {
        final int cap = edges [ fr ] ;
        if ( cap