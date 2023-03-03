public static void print ( int a ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = Integer . parseInt ( input . nextLine ( ) ) ;
  int d = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a <= b && c <= d ) {
    System . out . println ( a + c ) ;
  }
  else if ( a <= b && c >= d ) {
    System . out . println ( a + d ) ;
  }
  else if ( a >= b && c <= d ) {
    System . out . println ( b + c ) ;
  }
  else {
    System . out . println ( b + d ) ;
  }
}
