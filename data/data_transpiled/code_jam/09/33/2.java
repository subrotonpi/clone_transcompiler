public static int T = Integer . parseInt ( Scanner in ) {
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    int P = in . nextInt ( ) ;
    int Q = in . nextInt ( ) ;
    int [ ] p = in . nextInt ( ) ;
    int [ ] r = new int [ Q + 1 ] ;
    for ( int j = 0 ;
    j < Q ;
    j ++ ) r [ j ] = p [ j ] + P + 1 ;
    int [ ] [ ] A = new int [ Q + 1 ] [ Q + 1 ] ;
    for ( int j = 0 ;
    j < Q ;
    j ++ ) A [ j ] [ j ] = 0 ;
    for ( int d = 1 ;
    d <= Q ;
    d ++ ) for ( int i = 0 ;
    i < Q - d ;
    i ++ ) {
      int j = i + d ;
      for ( int k = i + 1 ;
      k <= j ;
      k ++ ) {
        int alt = r [ j + 1 ] - r [ i ] - 2 + A [ i ] [ k - 1 ] + A [ k ] [ j ] ;
        if ( k == i + 1 || alt < A [ i ] [ j ] ) A [ i ] [ j ] = alt ;
      }
    }
  }
  System . out . println ( "Case #" + ( t + 1 ) + ":" + A [ 0 ] [ Q ] ) ;
  return T ;
}
