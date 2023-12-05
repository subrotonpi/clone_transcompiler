public static int H = Integer . parseInt ( input ) {
  int W = Integer . parseInt ( input . nextLine ( ) ) ;
  int h = Integer . parseInt ( input . nextLine ( ) ) ;
  int w = Integer . parseInt ( input . nextLine ( ) ) ;
  int p = 1000 ;
  if ( H % h > 0 || W % w > 0 ) {
    System . out . println ( "Yes" ) ;
    int [ ] [ ] a = new int [ H ] [ W ] ;
    for ( int i = 0 ;
    i < H ;
    i += h ) {
      a [ i ] [ i ] = p ;
    }
    for ( int i = h - 1 ;
    i < H ;
    i += h ) {
      for ( int j = w - 1 ;
      j < W ;
      j += w ) {
        a [ i ] [ j ] = - p * ( h * w - 1 ) - 1 ;
      }
    }
    for ( int i = 0 ;
    i < H ;
    i ++ ) {
      System . out . println ( StringUtils . toString ( a [ i ] ) ) ;
    }
  }
  else {
    System . out . println ( "No" ) ;
  }
  return H ;
}
