public static void print ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  char [ ] [ ] s = new char [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    s [ i ] [ 0 ] = input . charAt ( 0 ) ;
  }
  boolean flag = true ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      if ( s [ i ] [ j ] == '#' ) {
        int c = 0 ;
        if ( j > 0 ) {
          if ( s [ i ] [ j - 1 ] == '#' ) c ++ ;
        }
        if ( j < W - 1 ) {
          if ( s [ i ] [ j + 1 ] == '#' ) c ++ ;
        }
        if ( i > 0 ) {
          if ( s [ i - 1 ] [ j ] == '#' ) c ++ ;
        }
        if ( i < H - 1 ) {
          if ( s [ i + 1 ] [ j ] == '#' ) c ++ ;
        }
        if ( c < 1 ) {
          flag = false ;
          break ;
        }
      }
    }
  }
  if ( flag ) {
    System . out . println ( "Yes" ) ;
  }
  else {
    System . out . println ( "No" ) ;
  }
}
