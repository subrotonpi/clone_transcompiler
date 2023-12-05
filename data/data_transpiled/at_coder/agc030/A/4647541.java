public static int A = Integer . parseInt ( input ) {
  int B = Integer . parseInt ( input . nextLine ( ) ) ;
  int C = Integer . parseInt ( input . nextLine ( ) ) ;
  if ( A + B + 1 >= C ) {
    System . out . println ( B + C ) ;
  }
  else {
    System . out . println ( A + 2 * B + 1 ) ;
  }
  return A ;
}
