@ VisibleForTesting static boolean bfs ( String input ) {
  int h = Integer . parseInt ( input ) ;
  int w = Integer . parseInt ( input ) ;
  int t = Integer . parseInt ( input ) ;
  String [ ] s = new String [ h ] ;
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    s [ i ] = input . substring ( i , i + 1 ) ;
  }
  for ( int i = 0 ;
  i < h ;
  i ++ ) {
    for ( int j = 0 ;
    j < w ;
    j ++ ) {
      if ( s [ i ] . charAt ( j ) == 'S' ) {
        s_h = i ;
        s_w = j ;
      }
      if ( s [ i ] . charAt ( j ) == 'G' ) {
        g_h = i ;
        g_w = j ;
      }
    }
  }
  return true ;
}
