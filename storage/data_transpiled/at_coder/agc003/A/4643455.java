public static String [ ] getStrings ( ) {
  String s [ ] = new String [ ] {
    "" }
    ;
    for ( int i = 0 ;
    i < s . length ;
    i ++ ) {
      s [ i ] = new String ( ) ;
    }
    Arrays . sort ( s ) ;
    if ( s . length == 4 ) {
      System . out . println ( "Yes" ) ;
    }
    else if ( s . length == 2 ) {
      if ( s [ 0 ] + s [ 1 ] . equals ( "NS" ) || s [ 0 ] + s [ 1 ] . equals ( "EW" ) ) {
        System . out . println ( "Yes" ) ;
      }
      else {
        System . out . println ( "No" ) ;
      }
    }
    else {
      System . out . println ( "No" ) ;
    }
    return s ;
  }
  