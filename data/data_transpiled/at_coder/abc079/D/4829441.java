public static int [ ] [ ] [ ] [ ] [ ] [ ] [ ] [ ] a ( ) {
  int H = Integer . parseInt ( input [ 0 ] [ 0 ] ) , W = Integer . parseInt ( input [ 1 ] [ 0 ] ) ;
  int [ ] [ ] [ ] [ ] [ ] [ ] [ ] A = new int [ H ] [ W ] [ 10 ] [ 10 ] [ 10 ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      for ( int k = 0 ;
      k < W ;
      k ++ ) {
        c [ j ] [ k ] = Math . min ( c [ j ] [ k ] , c [ j ] [ i ] + c [ i ] [ k ] ) ;
      }
    }
  }
  int res = 0 ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      if ( ( A [ i ] [ j ] >= 0 ) && ( A [ i ] [ j ] <= 0 ) ) {
        res += c [ A [ i ] [ j ] ] [ 1 ] ;
      }
    }
  }
  System . out . println ( res ) ;
  return res ;
}
