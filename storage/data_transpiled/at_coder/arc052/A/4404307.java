public static String input ( ) {
  String S = input ( ) ;
  String res = "" ;
  for ( int i = 0 ;
  i < S . length ( ) ;
  i ++ ) {
    if ( S . charAt ( i ) . isdigit ( ) ) {
      res += S . charAt ( i ) ;
    }
  }
  System . out . println ( res ) ;
  return res ;
}
