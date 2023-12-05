public static int [ ] ints ( ) {
  int a = Integer . parseInt ( input . nextLine ( ) ) , b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( a + b < 24 ) {
    System . out . println ( a + b ) ;
  }
  else {
    System . out . println ( a + b - 24 ) ;
  }
  return ints ( a , b ) ;
}
