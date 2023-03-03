static final int [ ] S ( ) {
  int [ ] S = new int [ 1 ] ;
  for ( int i = 0 ;
  i < S . length ;
  i ++ ) S [ i ] = i == '1' ? 1 : 0 ;
  int l = S . length ;
  if ( l % 2 == 1 ) {
    int t = l / 2 ;
    int a = S [ t ] ;
    for ( int i = 1 ;
    i <= t ;
    i ++ ) {
      if ( S [ t - i ] != a || S [ t + i ] != a ) {
        System . out . println ( t + i ) ;
        System . exit ( 0 ) ;
      }
    }
    System . out . println ( l ) ;
    System . exit ( 0 ) ;
  }
  if ( l % 2 == 0 ) {
    int t = l / 2 ;
    int a = S [ t - 1 ] ;
    int b = S [ t ] ;
    if ( a != b ) {
      System . out . println ( t ) ;
      System . exit ( 0 ) ;
    }
    for ( int i = 1 ;
    i <= t ;
    i ++ ) {
      if ( S [ t - 1 - i ] != a || S [ t + i ] != a ) {
        System . out . println ( t + i ) ;
        System . exit ( 0 ) ;
      }
    }
    System . out . println ( l ) ;
    System . exit ( 0 ) ;
  }
  return S ;
}
