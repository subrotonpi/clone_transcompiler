static void solve ( ) {
  final int n = Integer . parseInt ( System . console ( ) . readLine ( ) ) ;
  final String [ ] topics = new String [ n ] ;
  for ( int i = 0 ;
  i < xrange ( n ) ;
  i ++ ) topics [ i ] = System . console ( ) . readLine ( ) . split ( " " ) ;
  final Set < Integer > left = new HashSet < Integer > ( ) ;
  final Set < Integer > right = new HashSet < Integer > ( ) ;
  for ( int i = 0 ;
  i < topics . length ;
  i ++ ) {
    final int a = topics [ i ] . length ( ) ;
    final int b = topics [ i ] . length ( ) ;
    left . add ( a ) ;
    right . add ( b ) ;
  }
  final Graph < Integer > graph = new Graph < Integer > ( ) ;
  for ( int i = 0 ;
  i < topics . length ;
  i ++ ) graph . addEdge ( new Edge < Integer > ( topics [ i ] , new Edge < Integer > ( topics [ i ] , 0 , 1 ) ) ) ;
  for ( int a : left ) graph . addEdge ( new Edge < Integer > ( topics [ i ] , new Edge < Integer > ( topics [ i ] , 0 , 1 ) ) ) ;
  for ( int b : right ) graph . addEdge ( new Edge < Integer > ( topics [ i ] , new Edge < Integer > ( topics [ i ] , 1 , 1 ) ) ) ;
  final int mincostFlow = new MaxFlowMinCost ( graph , 0 , 1 ) ;
  final int mincost = new CostOfFlow ( graph , mincostFlow ) ;
  final int neededArcs = left . size ( ) + right . size ( ) - mincost ;
  final int faked = topics . length - neededArcs ;
  System . out . println ( faked ) ;
}
