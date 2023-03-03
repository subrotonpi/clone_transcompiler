public static String input ( ) {
  String a = "" ;
  for ( int i = 0 ;
  i < s . length ( ) ;
  i ++ ) {
    if ( s . charAt ( i ) == '0' ) {
      a = a + "0" ;
    }
    else if ( s . charAt ( i ) == '1' ) {
      a = a + "1" ;
    }
    else {
      a = a . substring ( 0 , a . length ( ) - 1 ) ;
    }
  }
  System . out . println ( a ) ;
  return a ;
}
