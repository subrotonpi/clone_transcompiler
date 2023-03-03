public static int a = Integer . parseInt ( input ) {
  int d = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( ( a + 1 ) * d >= ( d + 1 ) * a ) {
    System . out . println ( ( a + 1 ) * d ) ;
  }
  else {
    System . out . println ( ( d + 1 ) * a ) ;
  }
  return a ;
}
