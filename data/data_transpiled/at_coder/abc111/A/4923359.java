public static void print ( char c ) {
  for ( char s : list ( input ) ) {
    if ( s == '9' ) {
      s = "1" ;
    }
    else if ( s == '1' ) {
      s = "9" ;
    }
    System . out . print ( s ) ;
  }
  System . out . println ( "" ) ;
}
