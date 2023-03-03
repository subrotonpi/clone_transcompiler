public static String input ( ) {
  String ans = "" ;
  for ( String word : s . split ( " " ) ) {
    if ( word . equals ( "Left" ) ) {
      ans += " <" ;
    }
    else if ( word . equals ( "Right" ) ) {
      ans += " >" ;
    }
    else {
      ans += " A" ;
    }
  }
  System . out . println ( ans . substring ( 1 ) ) ;
  return ans ;
}
