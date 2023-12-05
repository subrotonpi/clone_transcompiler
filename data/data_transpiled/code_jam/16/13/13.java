@ VisibleForTesting static int dfs ( Map < Integer , Integer > comp , int i ) {
  int cas ;
  int n ;
  int f ;
  int ans ;
  if ( ( cas = comp . get ( f = i ) ) == - 1 ) {
    comp . put ( f = i , cas = comp . get ( f = i ) ) ;
    ans = solve ( n , f ) ;
    System . out . println ( "Case #" + cas + ": " + ans ) ;
  }
  return i ;
}
