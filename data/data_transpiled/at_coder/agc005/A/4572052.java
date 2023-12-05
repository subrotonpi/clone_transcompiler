public static String input ( ) {
  String S = input ( ) ;
  String result = "" ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( ( S . charAt ( i ) == 'T' ) && result . equals ( "" ) ) {
      result += S . charAt ( i ) ;
    }
    else if ( ( S . charAt ( i ) == 'T' ) && result . charAt ( i ) == 'S' ) {
      result = result . substring ( i ) ;
    }
    else {
      result += S . charAt ( i ) ;
    }
  }
  System . out . println ( result . length ( ) ) ;
  return result ;
}
