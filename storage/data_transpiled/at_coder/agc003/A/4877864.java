public static String input ( ) {
  String s = input ;
  String ans = "No" ;
  String y = "Yes" ;
  if ( ( s . contains ( "N" ) && s . contains ( "S" ) ) || ( ! s . contains ( "N" ) && ! s . contains ( "S" ) ) ) {
    if ( ( s . contains ( "E" ) && s . contains ( "W" ) ) || ( ! s . contains ( "E" ) && ! s . contains ( "W" ) ) ) {
      ans = y ;
    }
  }
  return ans ;
}
