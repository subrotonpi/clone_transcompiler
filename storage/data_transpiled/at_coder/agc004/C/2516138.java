public static void print ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  int [ ] P = new int [ H ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    P [ i ] = input . charAt ( i ) ;
  }
  char [ ] [ ] red = new char [ W ] [ H ] ;
  char [ ] [ ] blue = new char [ W ] [ H ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    red [ i ] [ 0 ] = '#' ;
    blue [ i ] [ W - 1 ] = '#' ;
    for ( int j = 1 ;
    j <= W - 1 ;
    j ++ ) {
      if ( i % 2 == 0 ) red [ i ] [ j ] = '#' ;
      else blue [ i ] [ j ] = '#' ;
    }
  }
  for ( int i = 1 ;
  i < H - 1 ;
  i ++ ) {
    for ( int j = 1 ;
    j <= W - 1 ;
    j ++ ) {
      if ( P [ i ] [ j ] == '#' ) {
        red [ i ] [ j ] = '#' ;
        blue [ i ] [ j ] = '#' ;
      }
    }
  }
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    print ( new String ( red [ i ] ) ) ;
  }
  print ( "" ) ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    print ( new String ( blue [ i ] ) ) ;
  }
}
