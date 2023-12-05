public static int a ( int b ) {
  int a = Math . abs ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  int b = Math . abs ( Integer . parseInt ( input . nextLine ( ) ) ) ;
  if ( a < b ) {
    System . out . println ( "Ant" ) ;
  }
  else if ( a == b ) {
    System . out . println ( "Draw" ) ;
  }
  else {
    System . out . println ( "Bug" ) ;
  }
  return a ;
}
