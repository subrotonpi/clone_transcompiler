static final int [ ] [ ] getSolutionArray ( ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] [ ] s = new int [ n + 1 ] [ n + 1 ] ;
  int [ ] [ ] g = new int [ n + 1 ] [ n + 1 ] ;
  boolean [ ] h = new boolean [ n + 1 ] ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    s [ a ] [ b ] = new int [ b ] [ c ] ;
    s [ b ] [ c ] = new int [ a ] [ c ] ;
  }
  /* dfs */
  h [ n ] = false ;
  for ( int i = 0 ;
  i < s [ n ] . length ;
  i ++ ) {
    if ( h [ s [ n ] [ i ] ] ) {
      g [ s [ n ] [ i ] ] = g [ s [ n ] [ i ] ] + s [ n ] [ i ] [ 1 ] ;
      dfs ( s [ n ] [ i ] ) ;
    }
  }
  int q = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  dfs ( k ) ;
  for ( int i = 0 ;
  i < q ;
  i ++ ) {
    int x = Integer . parseInt ( input . nextLine ( ) ) ;
    int y = Integer . parseInt ( input . nextLine ( ) ) ;
    System . out . println ( g [ x ] + g [ y ] ) ;
  }
  return s ;
}
