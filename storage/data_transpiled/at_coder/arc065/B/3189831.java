@ Nullable public static int root ( @ NotNull int [ ] par , int x ) {
  if ( par [ x ] == x ) {
    return x ;
  }
  par [ x ] = root ( par , par [ x ] ) ;
  return par [ x ] ;
}
