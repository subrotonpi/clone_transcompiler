@ VisibleForTesting static int [ ] [ ] solve ( int m , Set < Integer > subset ) {
  int [ ] [ ] matrix = new int [ m + 1 ] [ m + 1 ] ;
  for ( int k : subset ) {
    for ( int s = k ;
    s <= m ;
    s ++ ) {
      matrix [ s ] [ s % k ] = 1 ;
    }
  }
  return dijkstra ( matrix ) ;
}
