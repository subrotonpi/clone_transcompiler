static final int [ ] [ ] G ( ) {
  class Dinic {
    int n ;
    int [ ] [ ] g = new int [ n ] [ n ] ;
    int i ;
    int N = 8000 ;
    Dinic dinic = new Dinic ( B * 2 + 2 ) ;
    int idx = 0 ;
    HashSet < Integer > used = new HashSet < Integer > ( ) ;
    {
      int X , Y ;
      int P ;
      for ( int x = 1 ;
      x < X ;
      x ++ ) {
        used . add ( x * P ) ;
        dinic . addEdge ( 2 + x * P - 1 , X ) ;
      }
    }
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      X = Integer . parseInt ( input . nextLine ( ) ) ;
      Y = Integer . parseInt ( input . nextLine ( ) ) ;
      add ( X , Y , Z ) ;
      add ( Y , X , Y ) ;
    }
    for ( int x = 0 ;
    x < N ;
    x ++ ) {
      dinic . addEdge ( 0 , 2 + x - 1 , 1 ) ;
      dinic . addEdge ( 2 + x - 1 , 1 , 1 ) ;
    }
    int f = dinic . maxFlow ( 0 , 1 ) ;
    System . out . println ( ( used . size ( ) - f ) * 2 + f ) ;
  }
  int [ ] [ ] level = new int [ n ] [ n ] ;
  ConcurrentLinkedDeque < Integer > deq = new ConcurrentLinkedDeque < Integer > ( ) ;
  level [ s ] = 0 ;
  deq . add ( s ) ;
  while ( deq . size ( ) > 0 ) {
    int v = deq . poll ( ) ;
    for ( int [ ] e : g [ v ] ) {
      if ( e [ 1 ] > 0 && level [ e [ 0 ] ] < 0 ) {
        level [ e [ 0 ] ] = level [ v ] + 1 ;
        deq . add ( e [ 0 ] ) ;
      }
    }
    level = level ;
  }
  int [ ] [ ] dfs = new int [ n ] [ n ] ;
  int flow = 0 ;
  do {
    bfs ( s ) ;
    if ( level [ t ] < 0 ) break ;
    it = new int [ n ] [ n ] ;
    for ( int i = 0 ;
    i < n ;
    i ++ ) {
      int [ ] e = es [ i ] ;
      if ( e [ 1 ] > 0 && level [ v ] < level [ e [ 0 ] ]