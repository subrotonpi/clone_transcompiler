public static void print ( String input ) {
  int h = Integer . parseInt ( input . substring ( 0 , 1 ) ) ;
  int w = Integer . parseInt ( input . substring ( 1 , 2 ) ) ;
  char [ ] A = new char [ h ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    A [ i ] = input . charAt ( i ) ;
  }
  int cnt = 0 ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    for ( int j = 0 ;
    j < w ;
    j ++ ) {
      if ( A [ i ] [ j ] == '#' ) {
        cnt ++ ;
      }
    }
  }
  if ( cnt == w + h - 1 ) {
    System . out . println ( "Possible" ) ;
  }
  else {
    System . out . println ( "Impossible" ) ;
  }
}
