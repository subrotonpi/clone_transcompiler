public static String input ( ) {
  String d = "1234567890" ;
  String n = "" ;
  for ( char c : S ) {
    if ( d . contains ( c ) ) {
      n += c ;
    }
  }
  System . out . println ( n ) ;
  return n ;
}
