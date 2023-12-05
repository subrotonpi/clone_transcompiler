public static int getA ( ) {
  int A = Integer . parseInt ( input . nextLine ( ) ) ;
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( A > B ) {
    System . out . println ( "GREATER" ) ;
  }
  else if ( A < B ) {
    System . out . println ( "LESS" ) ;
  }
  else {
    System . out . println ( "EQUAL" ) ;
  }
  return A ;
}
