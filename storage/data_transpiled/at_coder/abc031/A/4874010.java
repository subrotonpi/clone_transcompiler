public static int getInt ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a > b ) {
    System . out . println ( a * ( b + 1 ) ) ;
  }
  else {
    System . out . println ( ( a + 1 ) * b ) ;
  }
  return a ;
}
