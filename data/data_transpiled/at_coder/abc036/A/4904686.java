public static int a ( ) {
  int b = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( b % a == 0 ) {
    System . out . println ( b / a ) ;
  }
  else {
    System . out . println ( b / a + 1 ) ;
  }
  return b ;
}
