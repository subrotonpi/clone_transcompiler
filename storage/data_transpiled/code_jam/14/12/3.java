static int dfs ( int x , int y ) {
  int i ;
  int f , g ;
  int [ ] a = new int [ a . length ] , k = 1 ;
  for ( i = 0 ;
  i < a [ x ] ;
  i ++ ) {
    if ( a [ x ] != i ) {
      int ff = dfs ( a [ x ] , i ) ;
      int gg = dfs ( a [ x ] , i ) ;
      g += gg ;
      f [ i ] = ff - gg ;
    }
  }
  Arrays . sort ( f ) ;
  if ( f . length >= 2 ) {
    return g + f [ 0 ] + f [ 1 ] - 1 ;
  }
  else {
    return g - 1 ;
  }
  int t = input . nextInt ( ) ;
  for ( int tt = 0 ;
  tt < t ;
  tt ++ ) {
    print >> System . err . println ( "???" + tt ) ;
    int n = input . nextInt ( ) ;
    a = new int [ n + 1 ] [ n ] ;
    for ( i = 0 ;
    i < n - 1 ;
    i ++ ) {
      x = Integer . parseInt ( input . next ( ) ) ;
      y = Integer . parseInt ( input . next ( ) ) ;
      a [ x ] [ i ] = y ;
      a [ y ] [ i ] = x ;
    }
    int ans = n ;
    for ( i = 1 ;
    i <= n ;
    i ++ ) {
      f = dfs ( i , 0 ) ;
      if ( f == - 1 ) f = g ;
      ans = Math . min ( ans , f ) ;
    }
    print = "Case #" + ( tt + 1 ) + ":" ;
    print = ans ;
  }
  return g ;
}
