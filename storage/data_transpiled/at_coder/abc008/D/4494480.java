@ functools . lru_cache ( maxsize = 10000 ) public static int dp ( int l , int u , int r , int d ) {
  final int g = 0 ;
  for ( int i = 0 ;
  i < ml . length ;
  i ++ ) {
    final int x = ml [ i ] ;
    final int y = ml [ i ] ;
    if ( l <= x && x <= r && u <= y && y <= d ) {
      final int g_ = r - l + 1 + d - u + dp ( l , u , x - 1 , y - 1 ) + dp ( x + 1 , u , r , y - 1 ) + dp ( l , y + 1 , x - 1 , d ) + dp ( x + 1 , y + 1 , r , d ) ;
      if ( g_ > g ) {
        g = g_ ;
      }
    }
  }
  return ( g ) ;
}
