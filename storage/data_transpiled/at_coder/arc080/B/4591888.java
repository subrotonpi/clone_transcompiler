public static void print ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  int N = Integer . parseInt ( input ) ;
  int [ ] A = new int [ N ] ;
  int [ ] a = new int [ N ] ;
  for ( int i = 0 ;
  i < N ;
  i ++ ) {
    A [ i ] = a [ i ] + 1 ;
  }
  int [ ] [ ] L = new int [ W ] [ H ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    L [ i ] = new int [ W ] ;
    for ( int j = 0 ;
    j < H ;
    j ++ ) {
      L [ i ] [ j ] = 0 ;
    }
  }
  for ( int i = 0 ;
  i < H * W ;
  i ++ ) {
    L [ i ] [ 0 ] = 0 ;
    for ( int j = 0 ;
    j < H ;
    j ++ ) {
      L [ i ] [ j ] = 0 ;
    }
    for ( int j = 0 ;
    j < H ;
    j ++ ) {
      L [ i ] [ j ] = 1 ;
    }
  }
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    L [ i ] [ 0 ] = 0 ;
    for ( int j = 0 ;
    j < H ;
    j ++ ) {
      L [ i ] [ j ] = 1 ;
    }
  }
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    System . out . println ( Arrays . toString ( L [ i ] ) ) ;
  }
}
