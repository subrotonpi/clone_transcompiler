@ VisibleForTesting static int [ ] [ ] solve ( int [ ] [ ] input ) {
  final int n = input . length ;
  final int [ ] [ ] [ ] matrix = new int [ m + 1 ] [ m + 1 ] [ m + 1 ] ;
  for ( int k = 1 ;
  k <= m ;
  k ++ ) {
    for ( int s = k ;
    s <= m ;
    s ++ ) {
      matrix [ k ] [ s ] [ s % k ] = 1 ;
    }
  }
  return matrix ;
}
