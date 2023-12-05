public static void UnionFind ( ) {
  int n ;
  int [ ] par = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) par [ i ] = - 1 ;
  /* same root(x) as root(y) */
  /* root(x) */
  if ( par [ n ] < 0 ) return ;
  par [ n ] = root ( par [ n ] ) ;
  /* unite root(x) */
  int x = root ( par [ n ] ) ;
  int y = root ( par [ n ] ) ;
  if ( x == y ) return ;
  if ( par [ x ] > par [ y ] ) x = y ;
  par [ x ] += par [ y ] ;
  par [ y ] = x ;
  /* size of root(x) */
  par [ n ] = - par [ root ( x ) ] ;
}
