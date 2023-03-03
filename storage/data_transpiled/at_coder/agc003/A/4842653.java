public static Set < String > solve ( ) {
  Set < String > s = new HashSet < String > ( Collections . singleton ( input ) ) ;
  if ( s . contains ( "S" ) ) {
    if ( ! s . contains ( "N" ) ) {
      System . out . println ( "No" ) ;
      exit ( ) ;
    }
  }
  return s ;
}
