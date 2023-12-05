static final int [ ] [ ] dfs ( @ Nonnull final int [ ] [ ] graph , int par , int cur , int mod ) {
  final int [ ] in = new int [ n ] [ ] ;
  System . setIn ( in , new Runnable ( ) {
    @ Override public void run ( ) {
      int li = Integer . parseInt ( in [ 0 ] ) ;
      int li_ = Integer . parseInt ( in [ 1 ] ) - 1 ;
      int lf = Integer . parseInt ( in [ 2 ] ) ;
      int ls = Integer . parseInt ( in [ 3 ] ) ;
      int ns = Integer . parseInt ( in [ 4 ] ) ;
      int lc = Integer . parseInt ( in [ 5 ] ) ;
      int ni = Integer . parseInt ( in [ 6 ] ) ;
      int nf = Float . parseFloat ( in [ 7 ] ) ;
      int [ ] [ ] children = new int [ ns ] [ ] ;
      for ( int i = 0 ;
      i < ns ;
      i ++ ) {
        children [ i ] = graph [ cur ] [ i ] ;
        if ( i == par ) continue ;
        children [ i ] = graph [ cur ] [ i ] ;
      }
      if ( children . length == 0 ) {
        return 2 ;
      }
      else {
        int topall = 1 ;
        int topwht = 1 ;
        for ( int i = 0 ;
        i < children . length ;
        i ++ ) {
          int topallchild = dfs ( graph , cur , children [ i ] , mod ) ;
          int topwhtchild = dfs ( graph , cur , children [ i ] , mod ) ;
          topwht *= topallchild ;
          topwht %= mod ;
          topall *= topwhtchild ;
          topall %= mod ;
        }
        return ( topall + topwht ) % mod ;
      }
    }
  }
  ) ;
  final int n = ni ( ) ;
  graph = new ArrayList [ n ] [ ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) {
    graph [ i ] = new ArrayList < > ( ) ;
  }
  final int MOD = 10 * 9 + 7 ;
  for ( int i = 0 ;
  i < n - 1 ;
  i ++ ) {
    int a = li_ ( ) ;
    int b = li_ ( ) ;
    graph [ a ] [ b ] = graph [ b ] ;
    graph [ b ] [ a ] = graph [ a ] ;
  }
  int ans = dfs ( graph , 0 , 0 , MOD ) ;
  System . out . println ( ans ) ;
}
