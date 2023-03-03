public static int getInt ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) , b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a <= b ) {
    System . out . println ( a ) ;
  }
  else {
    System . out . println ( a - 1 ) ;
  }
  return a ;
}
