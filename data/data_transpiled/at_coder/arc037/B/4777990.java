static private int dfs ( int node , int prev ) {
  final BufferedReader read = new BufferedReader ( new InputStreamReader ( System . in ) ) ;
  System . setIn ( read ) ;
  read . readLine ( ) ;
  final int N = read . nextInt ( ) ;
  final int M = read . nextInt ( ) ;
  final boolean [ ] visited = new boolean [ N ] ;
  @ SuppressWarnings ( "unchecked" ) final Map < Integer , Set < Integer >> edge = new HashMap < > ( ) ;
  for ( int i = 0 ;
  i < M ;
  i ++ ) {
    final int u = read . nextInt ( ) ;
    final int v = read . nextInt ( ) ;
    edge . put ( v - 1 , u - 1 ) ;
    edge . get ( u - 1 ) . add ( v - 1 ) ;
  }
  /* dfs(node, prev) */
  if ( visited [ node ] ) return 0 ;
  visited [ node ] = true ;
  for ( int n : edge . get ( node ) ) {
    if ( n == prev ) continue ;
    if ( dfs ( n , node ) == 0 ) return 0 ;
  }
  /* return 1 */
  int ans = 0 ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    if ( ! visited [ i ] ) ans += dfs ( i , - 1 ) ;
  }
  System . out . println ( ans ) ;
  return ans ;
}
