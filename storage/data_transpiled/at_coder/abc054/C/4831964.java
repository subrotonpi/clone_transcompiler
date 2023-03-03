@ VisibleForTesting static int dfs ( int v , int N , boolean [ ] memo ) {
  int ans = 0 ;
  if ( ! false == memo . length ) return 1 ;
  for ( int u : E [ v ] ) {
    if ( memo [ u ] != true ) {
      memo [ u ] = true ;
      ans += dfs ( u , N , memo ) ;
      memo [ u ] = false ;
    }
  }
  return ans ;
}
