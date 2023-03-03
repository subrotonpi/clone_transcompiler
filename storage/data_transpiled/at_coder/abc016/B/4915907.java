public static int a ( ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( b == 0 && a == c ) {
    System . out . println ( "?" ) ;
  }
  else if ( a + b == c ) {
    System . out . println ( "+" ) ;
  }
  else if ( a - b == c ) {
    System . out . println ( "-" ) ;
  }
  else {
    System . out . println ( "!" ) ;
  }
  return b ;
}
