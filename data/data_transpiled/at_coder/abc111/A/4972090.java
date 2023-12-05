public static String input ( ) {
  String S = input ( ) ;
  String res = "" ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( i == "9" ) {
      res += "1" ;
    }
    else if ( i == "1" ) {
      res += "9" ;
    }
    else {
      res += S . charAt ( i ) ;
    }
  }
  System . out . println ( res ) ;
  return res ;
}
