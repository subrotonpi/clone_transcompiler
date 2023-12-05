static final int [ ] getBase ( ) {
  System . setProperty ( "java.util.logging.config.file" , "" ) ;
  int mod = 10 * 9 + 7 ;
  int N = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] T = new int [ N ] [ N ] ;
  for ( int i = 0 ;
  i < N - 1 ;
  i ++ ) {
    int a , b ;
    a = Integer . parseInt ( input . nextLine ( ) ) ;
    b = a - 1 ;
    T [ b ] [ i ] = b ;
  }
  int ans = 1 ;
  int [ ] f = new int [ N ] ;
  int [ ] g = new int [ N ] ;
  /*dfs(x, parent);*/
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    int child = T [ i ] [ i ] ;
    if ( child == parent ) continue ;
    dfs ( child , f ) ;
    for ( int j = 0 ;
    j < N ;
    j ++ ) {
      f [ j ] = ( f [ j ] * g [ j ] ) % mod ;
      g [ j ] = ( g [ j ] * f [ j ] ) % mod ;
    }
    f [ j ] = ( f [ j ] + g [ j ] ) % mod ;
  }
  return f ;
}
