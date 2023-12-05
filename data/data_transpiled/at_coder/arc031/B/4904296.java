public static void dfs ( int H , int W ) {
  char [ ] [ ] field = new char [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) field [ i ] = new char [ W ] ;
  int [ ] [ ] Around = new int [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) Around [ i ] [ i ] = new int [ W ] ;
  int cnt_islands = 0 ;
  {
    if ( i < 0 || i >= W || i < 0 || i >= H || field [ i ] [ i ] == 'r' ) return ;
    if ( field [ i ] [ i ] == 'x' ) {
      field [ i ] [ i ] = 'r' ;
      Around [ i ] [ i ] ++ ;
      return ;
    }
    field [ i ] [ i ] = 'r' ;
    dfs ( i + 1 , i ) ;
    dfs ( i - 1 , i ) ;
    dfs ( i , i + 1 ) ;
    dfs ( i , i - 1 ) ;
  }
  for ( int y = 0 ;
  y < H ;
  y ++ ) {
    for ( int x = 0 ;
    x < W ;
    x ++ ) {
      if ( field [ y ] [ x ] == 'o' ) {
        for ( int yr = 0 ;
        yr < H ;
        yr ++ ) {
          for ( int xr = 0 ;
          xr < W ;
          xr ++ ) {
            if ( field [ yr ] [ xr ] == 'r' ) field [ yr ] [ xr ] = 'x' ;
          }
        }
      }
      dfs ( i , y ) ;
      cnt_islands ++ ;
    }
  }
  if ( cnt_islands == 1 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    boolean f = false ;
    for ( int y = 0 ;
    y < H ;
    y ++ ) {
      for ( int x = 0 ;
      x < W ;
      x ++ ) {
        if ( Around [ y ] [ x ] == cnt_islands ) {
          f = true ;
          System . out . println ( "YES" ) ;
          break ;
        }
      }
      if ( f ) break ;
    }
    if ( ! f ) System . out . println ( "NO" ) ;
  }
}
