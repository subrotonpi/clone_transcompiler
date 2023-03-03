@ VisibleForTesting static < V > Dinic < V > solve ( int source , int sink , int flow ) {
  class Dinic < V > {
    int N , E ;
    int [ ] [ ] edges ;
    int [ ] [ ] edges ;
    int [ ] [ ] iter ;
    int [ ] level ;
    {
      final int N = Integer . parseInt ( input . readLine ( ) ) ;
      edges = new int [ N + 1 ] [ N ] [ 0 ] [ 100 ] ;
      final int [ ] append = edges . clone ( ) ;
      for ( int p : ( int [ ] ) new int [ N ] [ N ] ) {
        append [ p ] [ 0 ] = p ;
      }
      for ( int a = 0 ;
      a < N ;
      a ++ ) {
        final int b = Integer . parseInt ( input . readLine ( ) ) ;
        edges [ a ] [ b ] = a ;
      }
      for ( int l : ( int [ ] ) new int [ N ] [ N ] ) {
        append [ l ] [ 0 ] = b ;
      }
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        edges [ i ] [ 0 ] = i ;
      }
    }
    final Dinic < V > dinic = new Dinic < V > ( N + 2 , edges ) ;
    System . out . println ( dinic . solve ( N + 1 , N ) ) ;
  }
  {
    int [ ] edges = new int [ N ] [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      edges [ i ] = edges [ i ] ;
      for ( int i = 0 ;
      i < N ;
      i ++ ) {
        int origin = i ;
        int dest = i ;
        int cap = i < N ;
        edges [ origin ] [ dest ] = i ;
        int rev = i < N ;
        edges [ origin ] [ dest ] = i ;
        edges [ origin ] [ rev ] = i ;
      }
    }
    int max = 0 ;
    do {
      bfs ( i , source ) ;
      if ( level [ sink ] < 0 ) {
        return max ;
      }
      iter = new int [ N ] [ N ] ;
      int flow = dfs ( i , sink , inf ) ;
      while ( flow > 0 ) {
        max -= flow ;
        flow = dfs ( i , source , sink , inf ) ;
      }
    }
    while ( max > 0 ) ;
  }
  {
    int [ ] level = new int [ N ] ;
    for ( int i = 0 ;
    i < N ;
    i ++ ) {
      level