static String s ( ) {
  String s = new String ( input . nextLine ( ) ) ;
  String result = "" ;
  for ( int i = 97 ;
  i <= 97 + 26 ;
  i ++ ) {
    char c = ( char ) i ;
    if ( ! s . contains ( c ) ) {
      result = c ;
      break ;
    }
  }
  return ( result != "" ? result : "None" ) ;
}
