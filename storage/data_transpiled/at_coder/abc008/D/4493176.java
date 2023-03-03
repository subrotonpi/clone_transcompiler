@ functools . lru_cache ( maxsize = 10000 ) public static int dfs ( int ox , int oy , int w , int h ) {
  final int [ ] [ ] ml = new int [ w ] [ h ] ;
  System . arraycopy ( input . split ( ) , 0 , ml , 0 , w ) ;
  @ SuppressWarnings ( "unused" ) final int [ ] [ ] g = new int [ w ] [ h ] ;
  final int g_ = w + h - 1 ;
  final int x = ox + w - 1 ;
  final int y = oy + h - 1 ;
  for ( int i = 0 ;
  i < ml . length ;
  i ++ ) {
    final int [ ] m = ml [ i ] ;
    if ( ox <= mx && x <= x && oy <= my && y <= y ) {
      final int lw = mx - ox ;
      final int rw = x - mx ;
      final int uh = y - oy ;
      g [ i ] [ i ] = g_ + dfs ( ox , oy , lw , uh ) + dfs ( ox , my , rw , uh ) ;
    }
  }
  return g . length ;
}
