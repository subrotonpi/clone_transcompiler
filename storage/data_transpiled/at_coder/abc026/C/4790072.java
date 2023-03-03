@ VisibleForTesting static LinkedHashMap < Node , Integer > getFollowPay ( ) {
  int N = Integer . parseInt ( input ( ) ) ;
  int [ ] S = new int [ N - 1 ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    S [ i ] = Integer . parseInt ( input ( ) ) ;
  }
  class Graph implements Graph {
    private final LinkedHashMap < Node , Integer > follow ;
    private final LinkedHashMap < Node , Integer > pay ;
    private final LinkedHashMap < Node , Integer > followPay_list ;
    {
      this . follow = new LinkedHashMap < Node , Integer > ( ) ;
      this . pay = new LinkedHashMap < Node , Integer > ( ) ;
      this . followPay_list = new LinkedHashMap < Node , Integer > ( ) ;
    }
    @ Override public int followLen ( Node node ) {
      return follow . get ( node ) . size ( ) ;
    }
    @ Override public void addEdge ( Node node , int one ) {
      follow . put ( one , two ) ;
    }
  }
  {
  }
  Graph g = new Graph ( ) ;
  for ( int n = 0 ;
  n < N - 1 ;
  n ++ ) {
    g . addEdge ( S [ n ] , n + 2 ) ;
  }
}
