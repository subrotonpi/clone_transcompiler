static final String print ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  int N = Integer . parseInt ( input ( ) ) ;
  int M = Integer . parseInt ( input ( ) ) ;
  int [ ] A = new int [ M ] ;
  int [ ] B = new int [ M ] ;
  for ( int i = 0 ;
  i < N + 1 ;
  i ++ ) {
    A [ i ] = i ;
    B [ i ] = i ;
  }
  int [ ] [ ] E = new int [ N + 1 ] [ ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    E [ i ] [ 0 ] = i ;
  }
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    E [ i ] [ 0 ] = i == 1 ;
  }
  return dfs ( i , p ) ;
}
