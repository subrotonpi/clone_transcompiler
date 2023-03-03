@ VisibleForTesting static void dfs ( ) {
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int m = Integer . parseInt ( input . nextLine ( ) ) ;
  List < List < Integer >> edge = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < m ;
  i ++ ) {
    edge . add ( Collections . singletonList ( input . nextLine ( ) ) ) ;
  }
  double [ ] [ ] kyori = new double [ n ] [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    kyori [ i ] [ i ] = Double . MAX_VALUE ;
  }
  /* dfs */
  double [ ] visitedCost = new double [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    visitedCost [ i ] = Double . MAX_VALUE ;
  }
  visitedCost [ 0 ] = 0 ;
  PriorityQueue < Integer > que = new PriorityQueue < > ( ) ;
  que . add ( start ) ;
  while ( que . size ( ) > 0 ) {
    int pos = que . poll ( ) ;
    for ( List < Integer > [ ] tree : tree ) {
      int nextPos = tree [ pos ] . size ( ) ;
      if ( visitedCost [ nextPos ] > visitedCost [ pos ] + cost ) {
        visitedCost [ nextPos ] = visitedCost [ pos ] + cost ;
        que . add ( nextPos ) ;
      }
    }
  }
  edge = new ArrayList < > ( edge ) ;
  tree = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    tree . add ( new ArrayList < > ( ) ) ;
  }
  int ans = m ;
  for ( List < Integer > list : edge ) {
    int start = list . get ( i ) ;
    int goal = list . get ( i ) ;
    int cost = list . get ( i ) ;
    start -- ;
    goal -- ;
    if ( cost <= dfs ( start , goal ) ) {
      tree . get ( start ) . add ( goal ) ;
      tree . get ( goal ) . add ( start ) ;
      ans -- ;
    }
  }
  System . out . println ( ans ) ;
}
