public static void main ( String [ ] args ) {
  int a = Arrays . stream ( args ) . mapToInt ( String :: length ) . sum ( ) ;
  int b = Arrays . stream ( args ) . mapToInt ( String :: length ) . sum ( ) ;
  if ( a < b ) {
    System . out . println ( "<" ) ;
  }
  else if ( a > b ) {
    System . out . println ( ">" ) ;
  }
  else if ( a == b ) {
    System . out . println ( "=" ) ;
  }
  else {
  }
}
