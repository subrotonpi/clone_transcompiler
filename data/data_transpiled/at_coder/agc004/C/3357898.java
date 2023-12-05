public static void print ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  char [ ] [ ] a = new char [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    a [ i ] = new char [ W ] ;
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      a [ i ] [ j ] = '#' ;
    }
  }
  char [ ] [ ] b = new char [ W ] [ H ] ;
  char [ ] [ ] c = new char [ W ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    c [ i ] [ 0 ] = '#' ;
    b [ i ] [ i ] = '#' ;
  }
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      if ( i % 2 == 0 ) {
        b [ i ] [ j ] = '#' ;
      }
      else {
        c [ i ] [ j ] = '#' ;
      }
    }
  }
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    c [ i ] [ i ] = '.' ;
    b [ i ] [ 0 ] = '.' ;
  }
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    for ( int j = 0 ;
    j < W ;
    j ++ ) {
      if ( a [ i ] [ j ] == '#' ) {
        b [ i ] [ j ] = '#' ;
        c [ i ] [ j ] = '#' ;
      }
    }
  }
  for ( int i = 0 ;
  i < H ;
  i ++ ) {
    System . out . println ( Arrays . toString ( b [ i ] ) ) ;
  }
  System . out . println ( ) ;
  for ( int i = 0 ;
  i < W ;
  i ++ ) {
    System . out . println ( Arrays . toString ( c [ i ] ) ) ;
  }
}
