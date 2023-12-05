public static String input ( ) {
  String [ ] X1 = X . split ( "ch" ) ;
  String [ ] X2 = Arrays . asList ( X1 ) . split ( "o" ) ;
  String [ ] X3 = Arrays . asList ( X2 ) . split ( "k" ) ;
  String [ ] X4 = Arrays . asList ( X3 ) . split ( "u" ) ;
  if ( Arrays . toString ( X4 ) . length == 0 ) {
    System . out . println ( "YES" ) ;
  }
  else {
    System . out . println ( "NO" ) ;
  }
  return "" ;
}
