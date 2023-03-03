public static int getInt ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a == 1 && b == 1 ) {
    System . out . println ( 1 ) ;
  }
  else if ( a == 1 || b == 1 ) {
    System . out . println ( Math . max ( a , b ) - 2 ) ;
  }
  else if ( a == 2 || b == 2 ) {
    System . out . println ( 0 ) ;
  }
  else {
    System . out . println ( a * b - 2 * a - 2 * b + 4 ) ;
  }
  return a ;
}
