public static int [ ] get3 ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) , b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a % 3 == 0 || b % 3 == 0 || ( a + b ) % 3 == 0 ) {
    System . out . println ( "Possible" ) ;
  }
  else {
    System . out . println ( "Impossible" ) ;
  }
  return new int [ ] {
    a , b }
    ;
  }
  