public static String print ( String s ) {
  String t = StringUtils . printToNull ( input ) ;
  if ( s != t && s . equals ( new String [ ] {
    s , t }
    ) ) {
      System . out . println ( "Yes" ) ;
    }
    else {
      System . out . println ( "No" ) ;
    }
    return t ;
  }
  