@ VisibleForTesting static int dfs ( int v , int N , HashMap < Integer , Boolean > memo ) {
  int ans = 0 ;
  if ( ! false == memo . values ( ) . length ) return 1 ;
  for ( int u : E . get ( v ) ) {
    if ( memo . get ( u ) != Boolean . TRUE ) {
      memo . put ( u , Boolean . TRUE ) ;
      ans += dfs ( u , N , memo ) ;
      memo . put ( u , Boolean . FALSE ) ;
    }
  }
  return ans ;
}
