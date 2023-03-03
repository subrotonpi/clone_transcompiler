public static int snukeColoring2 ( @ Nonnull int W , @ Nonnull int H , @ Nonnull int N , @ Nonnull int [ ] queries ) {
  int u = H , d = 0 , r = W , l = 0 ;
  for ( int x = 0 ;
  x < queries . length ;
  x ++ ) {
    int y = queries [ x ] ;
    int a = queries [ y ] ;
    switch ( a ) {
      case 1 : l = Math . max ( l , x ) ;
      break ;
      case 2 : r = Math . min ( r , x ) ;
      break ;
      case 3 : d = Math . max ( d , y ) ;
      break ;
      default : u = Math . min ( u , y ) ;
      break ;
    }
  }
  return Math . max ( r - l , 0 ) * Math . max ( u - d , 0 ) ;
}
