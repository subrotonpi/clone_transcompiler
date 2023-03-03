public static String print ( String A , String B , String C ) {
  String ans ;
  if ( A + B == C && A - B == C ) {
    ans = "?" ;
  }
  else if ( A + B == C ) {
    ans = "+" ;
  }
  else if ( A - B == C ) {
    ans = "-" ;
  }
  else {
    ans = "!" ;
  }
  return ans ;
}
