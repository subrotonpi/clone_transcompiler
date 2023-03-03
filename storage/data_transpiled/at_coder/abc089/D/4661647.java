public static int [ ] [ ] createDes ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  int D = Integer . parseInt ( input ) ;
  int [ ] [ ] A = new int [ H ] [ W ] ;
  int [ ] [ ] L = new int [ H * W + 1 ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    A [ i ] [ 0 ] = Integer . parseInt ( input ) ;
    A [ i ] [ 1 ] = Integer . parseInt ( input ) ;
  }
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      L [ A [ i ] [ j ] ] = new int [ W ] ;
    }
  }
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      L [ A [ i ] [ j ] ] = new int [ W ] ;
    }
  }
  int [ ] d = new int [ H * W + 1 ] ;
  for ( int i = D + 1 ;
  i < H * W + 1 ;
  i ++ ) {
    d [ i ] = d [ i - D ] + Math . abs ( L [ i ] [ 0 ] - L [ i - D ] [ 0 ] ) + Math . abs ( L [ i ] [ 1 ] - L [ i - D ] [ 1 ] ) ;
  }
  int Q = Integer . parseInt ( input ) ;
  for ( int i = 0 ;
  i < Q ;
  i ++ ) {
    int l = Integer . parseInt ( input ) ;
    int r = Integer . parseInt ( input ) ;
    System . out . println ( d [ r ] - d [ l ] ) ;
  }
  return d ;
}
