static final int [ ] [ ] getLevels ( ) {
  final int N = Integer . parseInt ( input . nextLine ( ) ) ;
  final int [ ] [ ] D = new int [ N + 1 ] [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    for ( int j = 0 ;
    j < Integer . parseInt ( input . nextLine ( ) ) ;
    j ++ ) {
      D [ i + 1 ] [ j + 1 ] = input . nextInt ( ) ;
    }
  }
  Arrays . sort ( D ) ;
  Arrays . sort ( D ) ;
  final int [ ] maxs = new int [ N * N + 1 ] ;
  for ( int r = 1 ;
  r <= N ;
  r ++ ) {
    for ( int c = 1 ;
    c <= N ;
    c ++ ) {
      maxs [ r * c ] = Math . max ( maxs [ r * c ] , Math . max ( D [ i + r ] [ j + c ] - D [ i ] [ j + c ] - D [ i + r ] [ j ] + D [ i ] [ j ] ) ) ;
    }
  }
  for ( int p = 1 ;
  p <= N * N ;
  p ++ ) {
    maxs [ p ] = Math . max ( maxs [ p ] , maxs [ p - 1 ] ) ;
  }
  final int Q = Integer . parseInt ( input . nextLine ( ) ) ;
  for ( int q = 0 ;
  q < Q ;
  q ++ ) {
    final int P = Integer . parseInt ( input . nextLine ( ) ) ;
    System . out . println ( maxs [ P ] ) ;
  }
  return maxs ;
}
