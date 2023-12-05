static int [ ] [ ] rec ( int i ) {
  final int N = Integer . parseInt ( input ( ) ) ;
  final int [ ] tree = new int [ N ] ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    tree [ j ] = Integer . parseInt ( input ( ) ) ;
  }
  final int [ ] edges = new int [ N + 1 ] ;
  for ( int j = 0 ;
  j < N ;
  j ++ ) {
    edges [ j ] = tree [ j ] ;
  }
  return edges ;
}
