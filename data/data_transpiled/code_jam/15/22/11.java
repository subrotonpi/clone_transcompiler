static final String solve ( int r , int c , int free , int odd ) {
  final int [ ] ints = new int [ r ] ;
  int i = 0 ;
  for ( i = 0 ;
  i < ints . length ;
  i ++ ) {
    ints [ i ] = ints [ i ] - 1 ;
  }
  int ans = 999999 ;
  for ( int i = 0 ;
  i < ans ;
  i ++ ) {
    ints [ i ] = ints [ i ] ;
  }
  int area = c * r ;
  int half = largeHalf ( area ) ;
  if ( ints [ i ] != 0 ) {
    return ints [ i ] ;
  }
  int unhap = 0 ;
  for ( int i = 0 ;
  i < ans ;
  i ++ ) {
    ints [ i ] = ints [ i ] ;
  }
  int half = largeHalf ( area ) ;
  if ( ints [ i ] == 0 ) {
    return ( ints [ i ] - 1 ) * 2 ;
  }
  if ( ints [ i ] == 0 ) {
    return ints [ i ] ;
  }
  else if ( ints [ i ] == 1 ) {
    return 1 + ( ints [ i ] - 1 ) * 2 ;
  }
  int unhap = 0 ;
  for ( int i = 0 ;
  i < ans ;
  i ++ ) {
    ints [ i ] = ints [ i ] ;
  }
  int half = largeHalf ( area ) ;
  if ( half <= 0 ) {
    return ints [ i ] ;
  }
  int unhap = 0 ;
  for ( int i = 0 ;
  i < ans ;
  i ++ ) {
    ints [ i ] = ints [ i ] ;
  }
  int unhap = 0 ;
  for ( int i = 0 ;
  i < ans ;
  i ++ ) {
    ints [ i ] = ints [ i ] ;
  }
  int unhap = 0 ;
  for ( int i = 0 ;
  i < ans ;
  i ++ ) {
    ints [ i ] = ints [ i ] ;
  }
  int unhap = 0 ;
  for ( int i = 0 ;
  i < ans ;
  i ++ ) {
    ints [ i ] = ints [ i ] ;
  }
  int unhap = 0 ;
  for ( int i = 0 ;
  i < ans ;
  i ++ ) {
    ints [ i ] = ints [ i ] ;
  }
  int unhap = 0 ;
  for ( int i = 0 ;
  i < ans ;
  i ++ ) {
    ints [ i ] = ints [ i ] ;
  }
  return ints [ unhap ] ;
}
