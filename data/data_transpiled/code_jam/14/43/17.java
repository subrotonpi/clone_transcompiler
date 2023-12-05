private static int TryPath ( char c0 ) {
  char direction = 'd' ;
  int r = 0 ;
  int c = c0 ;
  int [ ] PATH = new int [ 2 ] ;
  PATH [ 0 ] = new int [ 2 ] ;
  PATH [ 1 ] = new int [ 2 ] ;
  PATH [ 0 ] [ 1 ] = 8 ;
  if ( H == 1 ) {
    Map [ r ] [ c ] = 8 ;
    return 1 ;
  }
  if ( Map [ r + 1 ] [ c ] != 0 ) {
    Map [ r ] [ c ] = 8 ;
    return 0 ;
  }
  int T = Integer . parseInt ( readLine ( ) ) ;
  for ( int q = 0 ;
  q < T ;
  q ++ ) {
    System . out . printf ( "Case #%d:" , q + 1 ) ;
    Arrays . fill ( MAP , Integer . parseInt ( readLine ( ) ) ) ;
    Map = new int [ H ] ;
    for ( int i = 0 ;
    i < B ;
    i ++ ) {
      Map [ r ] [ i ] = 0 ;
    }
    for ( int i = 0 ;
    i < H ;
    i ++ ) {
      for ( int j = 0 ;
      j < H ;
      j ++ ) {
        Map [ r ] [ j ] = Integer . parseInt ( readLine ( ) ) ;
      }
    }
    System . out . printf ( "\n" ) ;
  }
  int [ ] Map = new int [ 2 ] ;
  for ( int i = 0 ;
  i < W ;
  i ++ ) {
    Map [ i ] = new int [ 2 ] ;
  }
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < H ;
    j ++ ) {
      Map [ r ] [ j ] = Integer . parseInt ( readLine ( ) ) ;
    }
  }
  System . out . printf ( "\n" ) ;
  for ( int i = 0 ;
  i < W ;
  i ++ ) {
    System . out . printf ( "Case #%d:" , i + 1 ) ;
  }
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < H ;
    j ++ ) {
      Map [ r ] [ j ] = Integer . parseInt ( readLine ( ) ) ;
    }
  }
  System . out . printf ( "\n" ) ;
  return 0 ;
}
