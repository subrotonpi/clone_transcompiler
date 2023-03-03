static final int [ ] [ ] solve ( int n ) {
  Scanner input = new Scanner ( System . in ) ;
  System . setIn ( input ) ;
  class FordFulkerson {
    boolean [ ] visited = new boolean [ n ] ;
    int [ ] G = new int [ n ] ;
    int n = input . nextInt ( ) ;
    @ Override public void addEdge ( int fr , int to , int cap ) {
      G [ fr ] [ to ] = cap ;
      G [ to ] [ fr ] = cap ;
    }
    @ Override public int dfs ( int start , int goal , int f ) {
      if ( start == goal ) return f ;
      visited [ start ] = true ;
      for ( int i = 0 ;
      i < n ;
      i ++ ) {
        if ( i == start ) continue ;
        if ( ( ! visited [ i ] ) && G [ start ] [ i ] > 0 ) {
          int d = dfs ( i , goal , Math . min ( f , G [ start ] [ i ] ) ) ;
          if ( d > 0 ) {
            G [ start ] [ i ] -= d ;
            G [ i ] [ start ] += d ;
            return d ;
          }
        }
      }
      return 0 ;
    }
    @ Override public int maxflow ( ) {
      int flow = 0 ;
      while ( true ) {
        visited = new boolean [ n ] ;
        int f = dfs ( 0 , n - 1 , Float . MAX_VALUE ) ;
        if ( f == 0 ) break ;
        flow += f ;
      }
      return flow ;
    }
  }
  int n = input . nextInt ( ) ;
  int g = input . nextInt ( ) ;
  int e = input . nextInt ( ) ;
  List < Integer > P = new LinkedList < Integer > ( ) ;
  for ( int i = 0 ;
  i < e ;
  i ++ ) {
    P . add ( i ) ;
  }
  FordFulkerson FF = new FordFulkerson ( n + 1 ) ;
  for ( int a = 0 ;
  a < n ;
  a ++ ) {
    for ( int b = 0 ;
    b < AB . size ( ) ;
    b ++ ) FF . addEdge ( a , b , 1 ) ;
  }
  for ( int p = 0 ;
  p < P . size ( ) ;
  p ++ ) FF . addEdge ( p , n , 1 ) ;
  System . out . println ( FF . maxflow ( ) ) ;
  return P ;
}
