public static int getInt ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a == 1 && b == 1 ) {
    System . out . println ( 1 ) ;
  }
  else if ( a == 1 || b == 1 ) {
    System . out . println ( a * b - 2 ) ;
  }
  else {
    System . out . println ( ( a - 2 ) * ( b - 2 ) ) ;
  }
  return a ;
}
