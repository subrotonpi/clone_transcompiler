public static void print ( String input ) {
  int h = ( int ) input . charAt ( 0 ) ;
  int w = ( int ) input . charAt ( 1 ) ;
  char [ ] [ ] s = new char [ h ] [ w ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) s [ i ] [ 0 ] = input . charAt ( 0 ) ;
  char [ ] [ ] arr = new char [ w ] [ h ] ;
  for ( int y = 0 ;
  y < h ;
  y ++ ) {
    for ( int x = 0 ;
    x < w ;
    x ++ ) {
      boolean flg = true ;
      for ( int dx = Math . max ( 0 , x - 1 ) ;
      dx < Math . min ( w , x + 2 ) ;
      dx ++ ) for ( int dy = Math . max ( 0 , y - 1 ) ;
      dy < Math . min ( h , y + 2 ) ;
      dy ++ ) if ( s [ dy ] [ dx ] == '.' ) flg = false ;
      if ( flg ) arr [ y ] [ x ] = '#' ;
    }
  }
  boolean flg = true ;
  for ( int y = 0 ;
  y < h ;
  y ++ ) {
    for ( int x = 0 ;
    x < w ;
    x ++ ) {
      if ( s [ y ] [ x ] == '.' ) continue ;
      boolean flgL = true ;
      for ( int dx = Math . max ( 0 , x - 1 ) ;
      dx < Math . min ( w , x + 2 ) ;
      dx ++ ) for ( int dy = Math . max ( 0 , y - 1 ) ;
      dy < Math . min ( h , y + 2 ) ;
      dy ++ ) if ( arr [ dy ] [ dx ] == '#' ) flgL = false ;
      if ( flgL ) flg = false ;
    }
  }
  if ( flg ) {
    System . out . println ( "possible" ) ;
    for ( char [ ] [ ] x : arr ) System . out . println ( Arrays . toString ( x ) ) ;
  }
  else System . out . println ( "impossible" ) ;
}
