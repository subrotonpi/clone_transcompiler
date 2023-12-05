public static int [ ] convert ( String input ) {
  int n = Integer . parseInt ( input ) ;
  int m = Integer . parseInt ( input ) ;
  int [ ] par = new int [ n ] ;
  for ( int i = 0 ;
  i < n ;
  i ++ ) par [ i ] = - 1 ;
  /* Find the first element in the list */
  if ( par [ i ] < 0 ) {
    /* Find the second element in the list */
    par [ i ] = find ( par [ i ] ) ;
    /* Find the first element in the list */
  }
  /* Size of the first element in the list */
  int size = - par [ find ( par [ 0 ] ) ] ;
  /* Unite the first element in the list */
  int x = par [ 0 ] , y = par [ 1 ] ;
  if ( x == y ) return null ;
  if ( size ( x ) < size ( y ) ) {
    x = y ;
    y = x ;
  }
  par [ x ] += par [ y ] ;
  par [ y ] = x ;
  /* Same the first element in the list */
  return par ;
}
