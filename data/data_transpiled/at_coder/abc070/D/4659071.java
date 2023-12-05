static final void doDFS ( int k ) {
  System . setSecurityManager ( new SecurityManager ( ) ) ;
  int n = Integer . parseInt ( input . nextLine ( ) ) ;
  float inf = Float . POSITIVE_INFINITY ;
  Map < Integer , Integer > [ ] road = new Map [ n + 1 ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    road [ i ] = new Map < > ( ) ;
  }
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int a = Integer . parseInt ( input . nextLine ( ) ) ;
    int b = Integer . parseInt ( input . nextLine ( ) ) ;
    int c = Integer . parseInt ( input . nextLine ( ) ) ;
    road [ a ] . put ( b , c ) ;
    road [ b ] . put ( a , c ) ;
  }
  int q = Integer . parseInt ( input . nextLine ( ) ) ;
  int k = Integer . parseInt ( input . nextLine ( ) ) ;
  int [ ] dfs = new int [ n + 1 ] ;
  dfs [ k ] = inf ;
  {
    for ( int i = 0 ;
    i < road [ x ] . length ;
    i ++ ) {
      if ( dfs [ i ] == inf ) {
        dfs [ i ] = dfs [ x ] + road [ x ] [ i ] ;
        doDFS ( i ) ;
      }
    }
    return ;
  }
  {
    for ( int i = 0 ;
    i < k ;
    i ++ ) {
      int x = Integer . parseInt ( input . nextLine ( ) ) ;
      int y = Integer . parseInt ( input . nextLine ( ) ) ;
      System . out . println ( dfs [ x ] + dfs [ y ] ) ;
    }
  }
}
