public static void print ( String input ) {
  int H = Integer . parseInt ( input ) ;
  int W = Integer . parseInt ( input ) ;
  char [ ] [ ] src = new char [ H ] [ W ] ;
  for ( int i = 0 ;
  i < H ;
  i ++ ) src [ i ] = input . toCharArray ( ) ;
  char [ ] [ ] ans1 = new char [ W - 1 ] [ W - 1 ] ;
  char [ ] [ ] ans2 = new char [ W - 1 ] [ W - 1 ] ;
  for ( int i = 0 ;
  i < H - 1 ;
  i ++ ) for ( int j = 0 ;
  j < W - 1 ;
  j ++ ) {
    ans1 [ i ] [ j ] = '#' ;
    ans2 [ i ] [ j ] = src [ i ] [ j ] ;
  }
  for ( int i = 1 ;
  i < H - 1 ;
  i ++ ) for ( int j = 1 ;
  j < W - 1 ;
  j ++ ) {
    if ( i % 2 != 0 ) {
      ans1 [ i ] [ j ] = '#' ;
      ans2 [ i ] [ j ] = src [ i ] [ j ] ;
    }
    else {
      ans1 [ i ] [ j ] = src [ i ] [ j ] ;
      ans2 [ i ] [ j ] = '#' ;
    }
  }
  for ( char [ ] row : ans1 ) System . out . println ( new String ( row ) ) ;
  System . out . println ( "" ) ;
  for ( char [ ] row : ans2 ) System . out . println ( new String ( row ) ) ;
}
