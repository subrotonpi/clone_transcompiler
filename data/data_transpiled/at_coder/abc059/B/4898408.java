public static int compare ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a > b ) {
    System . out . println ( "GREATER" ) ;
  }
  else if ( b > a ) {
    System . out . println ( "LESS" ) ;
  }
  else {
    System . out . println ( "EQUAL" ) ;
  }
  return a ;
}
