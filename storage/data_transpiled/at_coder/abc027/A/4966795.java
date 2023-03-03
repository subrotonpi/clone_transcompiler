public static int getInt ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a == b ) {
    System . out . println ( Integer . parseInt ( c ) ) ;
  }
  else if ( b == c ) {
    System . out . println ( Integer . parseInt ( a ) ) ;
  }
  else {
    System . out . println ( Integer . parseInt ( b ) ) ;
  }
  return a ;
}
