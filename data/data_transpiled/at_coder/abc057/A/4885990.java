public static int [ ] ints ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) ;
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  int c = a + b ;
  if ( c <= 23 ) {
    System . out . println ( c ) ;
  }
  else {
    System . out . println ( c - 24 ) ;
  }
  return ints ;
}
