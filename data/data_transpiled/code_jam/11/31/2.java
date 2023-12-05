public static int T = Integer . parseInt ( Scanner in ) {
  for ( int t = 0 ;
  t < T ;
  t ++ ) {
    int R = in . nextInt ( ) ;
    int C = in . nextInt ( ) ;
    String grid = "" ;
    for ( int r = 0 ;
    r < R ;
    r ++ ) grid += in . next ( ) ;
    int len = grid . length ( ) ;
    try {
      do {
        int s = grid . indexOf ( rSeparator ) ;
        if ( ( s % C ) != C - 1 && s / C != R - 1 && grid . charAt ( s + 1 ) + grid . charAt ( s + C ) + grid . charAt ( s + C + 1 ) == '###' ) {
          grid . setCharAt ( s , '/' ) ;
          grid . setCharAt ( s + 1 , '\\' ) ;
          grid . setCharAt ( s + C , '\\' ) ;
          grid . setCharAt ( s + C + 1 , '/' ) ;
        }
        else break ;
      }
      while ( ( s = grid . indexOf ( rSeparator ) ) != - 1 ) ;
    }
    catch ( NumberFormatException e ) {
    }
    System . out . println ( "Case #" + ( t + 1 ) + ":" ) ;
    try {
      grid . indexOf ( '#' ) ;
      System . out . println ( "Impossible" ) ;
    }
    catch ( NumberFormatException e ) {
      for ( int r = 0 ;
      r < R ;
      r ++ ) System . out . println ( grid . substring ( r * C , ( r + 1 ) * C ) ) ;
    }
  }
  return T ;
}
