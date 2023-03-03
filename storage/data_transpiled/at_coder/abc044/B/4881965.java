public static String input ( ) {
  String w = input ( ) ;
  String r = "Yes" ;
  for ( char c : w . toCharArray ( ) ) {
    if ( w . indexOf ( c ) % 2 != 0 ) {
      r = "No" ;
      break ;
    }
  }
  System . out . println ( r ) ;
  return r ;
}
