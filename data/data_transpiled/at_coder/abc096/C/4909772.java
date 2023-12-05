public static void main ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  int [ ] [ ] S = new int [ H ] [ W ] ;
  for ( int j = 0 ;
  j < H ;
  j ++ ) {
    S [ j ] [ i ] = 0 ;
  }
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      int sij = Integer . parseInt ( input ) ;
      S [ i ] [ j ] = sij ;
    }
  }
  boolean flag = true ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      if ( S [ i ] [ j ] == '#' ) {
        if ( 0 <= i - 1 && S [ i - 1 ] [ j ] == '#' || 0 <= j - 1 && S [ i ] [ j - 1 ] == '#' || j + 1 < W && S [ i ] [ j + 1 ] == '#' || i + 1 < H && S [ i + 1 ] [ j ] == '#' ) {
          continue ;
        }
        else {
          flag = false ;
          break ;
        }
      }
    }
    if ( flag == false ) {
      break ;
    }
  }
  if ( flag ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
