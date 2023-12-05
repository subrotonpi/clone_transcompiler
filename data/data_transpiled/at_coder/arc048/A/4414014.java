public static int getInt ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a * b > 0 ) {
    System . out . println ( b - a ) ;
  }
  else {
    System . out . println ( b - a - 1 ) ;
  }
  return a ;
}
