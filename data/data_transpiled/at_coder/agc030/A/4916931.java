public static int getInt ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a + b >= c ) {
    System . out . println ( b + c ) ;
  }
  else if ( a == b == c == 0 ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( a + 2 * b + 1 ) ;
  }
  return a ;
}
