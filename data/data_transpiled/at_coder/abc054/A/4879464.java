public static int getInt ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a == 1 && b == 1 ) {
    System . out . println ( "Draw" ) ;
  }
  else if ( a == 1 ) {
    System . out . println ( "Alice" ) ;
  }
  else if ( b == 1 ) {
    System . out . println ( "Bob" ) ;
  }
  else if ( a > b ) {
    System . out . println ( "Alice" ) ;
  }
  else if ( b > a ) {
    System . out . println ( "Bob" ) ;
  }
  else if ( a == b ) {
    System . out . println ( "Draw" ) ;
  }
  return a ;
}
