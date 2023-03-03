public static void solveCase ( int t , String [ ] [ ] tiles ) {
  int R = tiles . length ;
  int C = tiles [ 0 ] . length ;
  boolean impossible = false ;
  for ( int r = 0 ;
  r < R ;
  r ++ ) {
    for ( int c = 0 ;
    c < C ;
    c ++ ) {
      if ( tiles [ r ] [ c ] . equals ( "#" ) ) {
        try {
          if ( tiles [ r ] [ c + 1 ] . equals ( "." ) || tiles [ r + 1 ] [ c ] . equals ( "." ) || tiles [ r + 1 ] [ c + 1 ] . equals ( "." ) ) {
            impossible = true ;
            break ;
          }
          tiles [ r ] [ c ] = "/" ;
          tiles [ r ] [ c + 1 ] = "\\" ;
          tiles [ r + 1 ] [ c ] = "\\" ;
          tiles [ r + 1 ] [ c + 1 ] = "/" ;
        }
        catch ( ArrayIndexOutOfBoundsException e ) {
          impossible = true ;
          break ;
        }
      }
    }
  }
  System . out . println ( "Case #" + t + ":" ) ;
  if ( impossible ) {
    System . out . println ( "Impossible" ) ;
  }
  else {
    for ( String [ ] s : tiles ) {
      System . out . println ( s ) ;
    }
  }
}
