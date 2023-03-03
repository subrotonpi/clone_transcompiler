public static String print ( String s ) {
  int c = 0 ;
  while ( s . length ( ) > 0 ) {
    String p = "1" ;
    String q = "1" ;
    String r = "1" ;
    if ( s . length ( ) < 5 ) {
      break ;
    }
    if ( s . length ( ) <= 7 ) {
      if ( s . length ( ) == 5 ) {
        if ( s . equals ( list ( "dream" ) ) || s . equals ( list ( "erase" ) ) ) {
          c = 1 ;
          break ;
        }
      }
      else if ( s . length ( ) == 6 ) {
        if ( s . equals ( list ( "eraser" ) ) ) {
          c = 1 ;
          break ;
        }
      }
      else if ( s . equals ( list ( "dreamer" ) ) ) {
        c = 1 ;
        break ;
      }
    }
    else {
      break ;
    }
  }
  System . out . println ( c == 1 ? "YES" : "NO" ) ;
  return s ;
}
