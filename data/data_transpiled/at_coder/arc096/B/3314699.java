public static int [ ] [ ] split ( String input ) {
  int N = Integer . parseInt ( input ) ;
  int C = Integer . parseInt ( input ) ;
  int X [ ] = new int [ N ] ;
  int V [ ] = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    X [ i ] = Integer . parseInt ( input ) ;
    V [ i ] = Integer . parseInt ( input ) ;
  }
  int R [ ] = new int [ N + 1 ] ;
  int Rans [ ] = new int [ N + 1 ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    R [ i + 1 ] = R [ i ] + V [ i ] ;
    Rans [ i + 1 ] = Math . max ( Rans [ i ] , R [ i + 1 ] - X [ i ] ) ;
  }
  int L [ ] = new int [ N + 1 ] ;
  int Lans [ ] = new int [ N + 1 ] ;
  for ( int i = N ;
  i > 0 ;
  i -- ) {
    L [ i - 1 ] = L [ i ] + V [ i ] ;
    Lans [ i ] = Math . max ( Lans [ i ] , L [ i - 1 ] - 2 * ( C - X [ i - 1 ] ) ) ;
  }
  return new int [ ] [ ] {
  }
  ;
}
