public static int [ ] [ ] createCost ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  int D = Integer . parseInt ( input ) ;
  List < List < Integer >> A = new ArrayList < > ( ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    A . add ( Collections . singletonList ( input . substring ( i , i + 1 ) ) ) ;
  }
  Map < Integer , Point > Position = new HashMap < > ( ) ;
  for ( int h = 0 ;
  h < H ;
  h ++ ) {
    for ( int w = 0 ;
    w < W ;
    w ++ ) {
      Position . put ( A . get ( h ) . get ( w ) , new Point ( h , w ) ) ;
    }
  }
  int [ ] [ ] Cost = new int [ H * W + 1 ] [ ] ;
  for ( int d = D + 1 ;
  d <= H * W ;
  d ++ ) {
    int h = Position . get ( d ) . x ;
    int w = Position . get ( d ) . y ;
    int prevH = Position . get ( d - D ) . x ;
    int prevW = Position . get ( d - D ) . y ;
    Cost [ d ] = Math . abs ( h - prevH ) + Math . abs ( w - prevW ) + Cost [ d - D ] ;
  }
  int Q = Integer . parseInt ( input ) ;
  for ( int q = 0 ;
  q < Q ;
  q ++ ) {
    int l = Integer . parseInt ( input . substring ( q , q + 1 ) ) ;
    int r = Integer . parseInt ( input . substring ( q , q + 1 ) ) ;
    System . out . println ( Cost [ r ] - Cost [ l ] ) ;
  }
  return Cost ;
}
