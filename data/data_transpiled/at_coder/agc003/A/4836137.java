public static String input ( ) {
  String a = "Yes" ;
  if ( a . contains ( "W" ) && ! a . contains ( "E" ) ) {
    ans = "No" ;
  }
  else if ( a . contains ( "E" ) && ! a . contains ( "W" ) ) {
    ans = "No" ;
  }
  else if ( a . contains ( "N" ) ) {
    ans = "No" ;
  }
  return ans ;
}
