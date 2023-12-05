public static String input ( ) {
  Set < String > s = new HashSet < String > ( S . toArray ( ) ) ;
  boolean ans = s . isEmpty ( ) || s . contains ( "N" ) || s . contains ( "W" ) || s . contains ( "E" ) ;
  return "Yes" . equals ( ans ? "Yes" : "No" ) ;
}
