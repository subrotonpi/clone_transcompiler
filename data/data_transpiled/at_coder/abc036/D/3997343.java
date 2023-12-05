static final int [ ] getGraph ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  int N = Integer . parseInt ( input ) ;
  Map [ ] graph = new Map [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input ) ;
    int b = Integer . parseInt ( input ) ;
    graph [ a - 1 ] . put ( b - 1 , 1 ) ;
    graph [ b - 1 ] . put ( a - 1 , 1 ) ;
  }
  int mod = 10 * 9 + 7 ;
  boolean [ ] visited = new boolean [ N ] ;
  visited [ 0 ] = true ;
  /* dfs */
  int w = 1 , b = 1 ;
  for ( int to : graph [ v ] . keySet ( ) ) {
    if ( visited [ to ] ) continue ;
    visited [ to ] = true ;
    int w_tmp = dfs ( to ) ;
    int b_tmp = dfs ( to ) ;
    w = ( w * ( w_tmp + b_tmp ) ) % mod ;
    b = ( b * w_tmp ) % mod ;
  }
  return visited ;
}
