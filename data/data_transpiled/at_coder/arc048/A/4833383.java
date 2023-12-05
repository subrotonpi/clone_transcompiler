public static int getInt ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a < 0 && b > 0 ) {
    System . out . println ( b - a - 1 ) ;
  }
  else {
    System . out . println ( b - a ) ;
  }
  return a ;
}
